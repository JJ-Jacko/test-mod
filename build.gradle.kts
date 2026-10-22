import org.gradle.api.tasks.javadoc.Javadoc

plugins {
	id("net.fabricmc.fabric-loom")
	`maven-publish`
}

repositories {
	// Add repositories to retrieve artifacts from in here.
	// You should only use this when depending on other mods because
	// Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
	// See https://docs.gradle.org/current/userguide/declaring_repositories.html
	// for more information about repositories.
}

fabricApi {
	configureDataGeneration {
		client = true
		modId = "test-mod"
	}
}

dependencies {
	// To change the versions see the gradle.properties file
	minecraft("com.mojang:minecraft:${providers.gradleProperty("minecraft_version").get()}")
	implementation("net.fabricmc:fabric-loader:${providers.gradleProperty("loader_version").get()}")

	// Fabric API. This is technically optional, but you probably want it anyway.
	implementation("net.fabricmc.fabric-api:fabric-api:${providers.gradleProperty("fabric_api_version").get()}")
}

tasks.processResources {
	val version = version
	inputs.property("version", version)

	filesMatching("fabric.mod.json") {
		expand("version" to version)
	}
}

tasks.withType<JavaCompile>().configureEach {
	options.release = 25
}

java {
	// Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
	// if it is present.
	// If you remove this line, sources will not be generated.
	withSourcesJar()

	sourceCompatibility = JavaVersion.VERSION_25
	targetCompatibility = JavaVersion.VERSION_25
}

tasks.jar {
	val projectName = project.name
	inputs.property("projectName", projectName)

	from("LICENSE") {
		rename { "${it}_$projectName" }
	}
}

tasks.register<Javadoc>("javadoc-mc") {
	group = "documentation"
	description = "Generates Javadoc API documentation for the decompiled Minecraft sources."
	title = "Minecraft ${providers.gradleProperty("minecraft_version").get()}"
	dependsOn("genSources")
	exclude(
		"com/mojang/blaze3d/platform/MacosUtil.java",
		"com/mojang/realmsclient/gui/screens/RealmsPdpScreen.java",
	)

	val minecraftSourcesJar = providers.provider {
		fileTree(".gradle/loom-cache/minecraftMaven/net/minecraft") {
			include("minecraft-merged-*/*/*-sources.jar")
		}.singleFile
	}

	source(minecraftSourcesJar.map { zipTree(it) })
	classpath = files(
		tasks.compileJava.get().classpath,
		configurations.detachedConfiguration(
			dependencies.create("com.google.code.findbugs:jsr305:3.0.2"),
		),
	)
	destinationDir = layout.buildDirectory.dir("docs/MC-doc").get().asFile
}

// configure the maven publication
publishing {
	publications {
		register<MavenPublication>("mavenJava") {
			from(components["java"])
		}
	}

	// See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
	repositories {
		// Add repositories to publish to here.
		// Notice: This block does NOT have the same function as the block in the top level.
		// The repositories here will be used for publishing your artifact, not for
		// retrieving dependencies.
	}
}
