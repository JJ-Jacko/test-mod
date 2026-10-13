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
    public void generateTranslations(Provider registryLookup, TranslationBuilder builder) {
        builder.add(ModBlocks.CONDENSED_DIRT, "Condensed Dirt");
        builder.add(ModBlocks.ICE_ETHER_ORE, "Ice Ether Ore");
        builder.add(ModBlocks.DEEPSLATE_ICE_ETHER_ORE, "Deepslate Ice Ether Ore");
        builder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "Block of Raw Ice Ether");
        builder.add(ModBlocks.ICE_ETHER_BLOCK, "Block of Ice Ether");
        builder.add(ModBlocks.ICE_ETHER_STAIRS, "Ice Ether Stairs");
        builder.add(ModBlocks.ICE_ETHER_SLAB, "Ice Ether Slab");
        builder.add(ModBlocks.ICE_ETHER_BUTTON, "Ice Ether Button");
        builder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE, "Ice Ether Pressure Plate");
        builder.add(ModBlocks.ICE_ETHER_FENCE, "Ice Ether Fence");
        builder.add(ModBlocks.ICE_ETHER_FENCE_GATE, "Ice Ether Fence Gate");
        builder.add(ModBlocks.ICE_ETHER_WALL, "Ice Ether Wall");
        builder.add(ModBlocks.ICE_ETHER_DOOR, "Ice Ether Door");
        builder.add(ModBlocks.ICE_ETHER_TRAPDOOR, "Ice Ether Trapdoor");
        
        builder.add(ModItems.POISONOUS_APPLE, "Poisonous Apple");
        builder.add(ModItems.QUARK_GLUON_PLASMA, "Quark Gluon Plasma");
        builder.add(ModItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");
        builder.add(ModItems.ICE_ETHER, "Ice Ether");
        builder.add(ModItems.RAW_ICE_ETHER, "Raw Ice Ether");

        builder.add("test_mod_items.test-mod", "Test Mod Items");
    }
}
