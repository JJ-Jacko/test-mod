package com.jacko.testmod.client;

import com.jacko.testmod.client.dataGen.LangEnglishProvider;
import com.jacko.testmod.client.dataGen.ModelProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class TestModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(LangEnglishProvider::new);
		pack.addProvider(ModelProvider::new);
	}
}
