package com.jacko.testmod.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.block.TMBlockItemIds;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.tags.BlockTags;

public class TMBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public TMBlockTagsProvider(FabricPackOutput output, CompletableFuture<Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(Provider provider) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(TMBlockItemIds.ICE_ETHER_ORE)
            .add(TMBlockItemIds.DEEPSLATE_ICE_ETHER_ORE)
            .add(TMBlockItemIds.RAW_ICE_ETHER_BLOCK)
            .add(TMBlockItemIds.ICE_ETHER_BLOCK)
            .add(TMBlockItemIds.ICE_ETHER_STAIRS)
            .add(TMBlockItemIds.ICE_ETHER_SLAB)
            .add(TMBlockItemIds.ICE_ETHER_BUTTON)
            .add(TMBlockItemIds.ICE_ETHER_PRESSURE_PLATE)
            .add(TMBlockItemIds.ICE_ETHER_FENCE)
            .add(TMBlockItemIds.ICE_ETHER_FENCE_GATE)
            .add(TMBlockItemIds.ICE_ETHER_WALL)
            .add(TMBlockItemIds.ICE_ETHER_DOOR)
            .add(TMBlockItemIds.ICE_ETHER_TRAPDOOR);
            
        builder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(TMBlockItemIds.ICE_ETHER_ORE)
            .add(TMBlockItemIds.DEEPSLATE_ICE_ETHER_ORE)
            .add(TMBlockItemIds.RAW_ICE_ETHER_BLOCK)
            .add(TMBlockItemIds.ICE_ETHER_BLOCK)
            .add(TMBlockItemIds.ICE_ETHER_STAIRS)
            .add(TMBlockItemIds.ICE_ETHER_SLAB)
            .add(TMBlockItemIds.ICE_ETHER_BUTTON)
            .add(TMBlockItemIds.ICE_ETHER_PRESSURE_PLATE)
            .add(TMBlockItemIds.ICE_ETHER_FENCE)
            .add(TMBlockItemIds.ICE_ETHER_FENCE_GATE)
            .add(TMBlockItemIds.ICE_ETHER_WALL)
            .add(TMBlockItemIds.ICE_ETHER_DOOR)
            .add(TMBlockItemIds.ICE_ETHER_TRAPDOOR);
        
        builder(BlockTags.FENCES)
            .add(TMBlockItemIds.ICE_ETHER_FENCE);
        
        builder(BlockTags.FENCE_GATES)
            .add(TMBlockItemIds.ICE_ETHER_FENCE_GATE);
        
        builder(BlockTags.WALLS)
            .add(TMBlockItemIds.ICE_ETHER_WALL);
        
        builder(BlockTags.DOORS)
            .add(TMBlockItemIds.ICE_ETHER_DOOR);

        builder(BlockTags.TRAPDOORS)
            .add(TMBlockItemIds.ICE_ETHER_TRAPDOOR);
    }
}
