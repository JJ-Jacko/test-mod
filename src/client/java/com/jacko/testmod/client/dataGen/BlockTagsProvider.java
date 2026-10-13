package com.jacko.testmod.client.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.ModBlockItemIds;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.tags.BlockTags;

public class BlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public BlockTagsProvider(FabricPackOutput output, CompletableFuture<Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(Provider provider) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlockItemIds.ICE_ETHER_ORE)
            .add(ModBlockItemIds.DEEPSLATE_ICE_ETHER_ORE)
            .add(ModBlockItemIds.ICE_ETHER_BLOCK)
            .add(ModBlockItemIds.ICE_ETHER_STAIRS)
            .add(ModBlockItemIds.ICE_ETHER_SLAB)
            .add(ModBlockItemIds.ICE_ETHER_BUTTON)
            .add(ModBlockItemIds.ICE_ETHER_PRESSURE_PLATE)
            .add(ModBlockItemIds.ICE_ETHER_FENCE)
            .add(ModBlockItemIds.ICE_ETHER_FENCE_GATE)
            .add(ModBlockItemIds.ICE_ETHER_WALL)
            .add(ModBlockItemIds.ICE_ETHER_DOOR)
            .add(ModBlockItemIds.ICE_ETHER_TRAPDOOR);
            
        builder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlockItemIds.ICE_ETHER_ORE)
            .add(ModBlockItemIds.DEEPSLATE_ICE_ETHER_ORE)
            .add(ModBlockItemIds.ICE_ETHER_BLOCK)
            .add(ModBlockItemIds.ICE_ETHER_STAIRS)
            .add(ModBlockItemIds.ICE_ETHER_SLAB)
            .add(ModBlockItemIds.ICE_ETHER_BUTTON)
            .add(ModBlockItemIds.ICE_ETHER_PRESSURE_PLATE)
            .add(ModBlockItemIds.ICE_ETHER_FENCE)
            .add(ModBlockItemIds.ICE_ETHER_FENCE_GATE)
            .add(ModBlockItemIds.ICE_ETHER_WALL)
            .add(ModBlockItemIds.ICE_ETHER_DOOR)
            .add(ModBlockItemIds.ICE_ETHER_TRAPDOOR);
        
        builder(BlockTags.FENCES)
            .add(ModBlockItemIds.ICE_ETHER_FENCE);
        
        builder(BlockTags.FENCE_GATES)
            .add(ModBlockItemIds.ICE_ETHER_FENCE_GATE);
        
        builder(BlockTags.WALLS)
            .add(ModBlockItemIds.ICE_ETHER_WALL);
        
        builder(BlockTags.DOORS)
            .add(ModBlockItemIds.ICE_ETHER_DOOR);

        builder(BlockTags.TRAPDOORS)
            .add(ModBlockItemIds.ICE_ETHER_TRAPDOOR);
    }
}
