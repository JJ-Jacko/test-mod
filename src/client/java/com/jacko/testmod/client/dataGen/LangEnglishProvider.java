package com.jacko.testmod.client.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class LangEnglishProvider extends FabricLanguageProvider {

    public LangEnglishProvider(FabricPackOutput packOutput, CompletableFuture<Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.CONDENSED_DIRT, "Condensed Dirt");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "Ice Ether Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_ICE_ETHER_ORE, "Deepslate Ice Ether Ore");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "Block of Ice Ether");
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS, "Ice Ether Stairs");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB, "Ice Ether Slab");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON, "Ice Ether Button");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE, "Ice Ether Pressure Plate");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE, "Ice Ether Fence");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE, "Ice Ether Fence Gate");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALL, "Ice Ether Wall");
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR, "Ice Ether Door");
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR, "Ice Ether Trapdoor");
        
        translationBuilder.add(ModItems.POISONOUS_APPLE, "Poisonous Apple");
        translationBuilder.add(ModItems.QUARK_GLUON_PLASMA, "Quark Gluon Plasma");
        translationBuilder.add(ModItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");
        translationBuilder.add(ModItems.ICE_ETHER, "Ice Ether");

        translationBuilder.add("test_mod_items.test-mod", "Test Mod Items");
    }
}
