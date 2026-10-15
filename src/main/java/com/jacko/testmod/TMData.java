package com.jacko.testmod;

import com.jacko.testmod.dataGen.TMBlockLootTableProvider;
import com.jacko.testmod.dataGen.TMBlockTagsProvider;
import com.jacko.testmod.dataGen.TMLangENProvider;
import com.jacko.testmod.dataGen.TMRecipesProvider;
import com.jacko.testmod.dataGen.TMModelProvider;

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
		pack.addProvider(TMRecipesProvider::new);
	}
}
