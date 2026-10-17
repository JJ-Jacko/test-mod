package com.jacko.testmod.dataGen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class TMData implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(TMLangENProvider::new);
		pack.addProvider(TMModelProvider::new);
		pack.addProvider(TMBlockLootTableProvider::new);
		pack.addProvider(TMBlockTagsProvider::new);
		pack.addProvider(TMItemTagsProvider::new);
		pack.addProvider(TMRecipesProvider::new);
	}
}
