package com.jacko.testmod.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class TMLangENProvider extends FabricLanguageProvider {
    public TMLangENProvider(FabricPackOutput packOutput, CompletableFuture<Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder builder) {
        builder.add(TMBlocks.CONDENSED_DIRT, "Condensed Dirt");
        builder.add(TMBlocks.ICE_ETHER_ORE, "Ice Ether Ore");
        builder.add(TMBlocks.DEEPSLATE_ICE_ETHER_ORE, "Deepslate Ice Ether Ore");
        builder.add(TMBlocks.RAW_ICE_ETHER_BLOCK, "Block of Raw Ice Ether");
        builder.add(TMBlocks.ICE_ETHER_BLOCK, "Block of Ice Ether");
        builder.add(TMBlocks.ICE_ETHER_STAIRS, "Ice Ether Stairs");
        builder.add(TMBlocks.ICE_ETHER_SLAB, "Ice Ether Slab");
        builder.add(TMBlocks.ICE_ETHER_BUTTON, "Ice Ether Button");
        builder.add(TMBlocks.ICE_ETHER_PRESSURE_PLATE, "Ice Ether Pressure Plate");
        builder.add(TMBlocks.ICE_ETHER_FENCE, "Ice Ether Fence");
        builder.add(TMBlocks.ICE_ETHER_FENCE_GATE, "Ice Ether Fence Gate");
        builder.add(TMBlocks.ICE_ETHER_WALL, "Ice Ether Wall");
        builder.add(TMBlocks.ICE_ETHER_DOOR, "Ice Ether Door");
        builder.add(TMBlocks.ICE_ETHER_TRAPDOOR, "Ice Ether Trapdoor");
        
        builder.add(TMItems.CHEESE, "Cheese");
        builder.add(TMItems.CORN, "Corn");
        builder.add(TMItems.POISONOUS_APPLE, "Poisonous Apple");
        builder.add(TMItems.STRAWBERRY, "Strawberry");
        builder.add(TMItems.QUARK_GLUON_PLASMA, "Quark Gluon Plasma");
        builder.add(TMItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");
        builder.add(TMItems.ICE_ETHER, "Ice Ether");
        builder.add(TMItems.RAW_ICE_ETHER, "Raw Ice Ether");
        builder.add(TMItems.ANTHRACITE, "Anthracite");

        builder.add("test_mod_items.test-mod", "Test Mod Items");
    }
}
