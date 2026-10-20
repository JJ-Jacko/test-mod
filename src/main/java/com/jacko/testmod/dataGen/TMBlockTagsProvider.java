package com.jacko.testmod.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.block.TMBlockItemIds;
import com.jacko.testmod.tags.TMBlockTags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.BlockTags;

public class TMBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public TMBlockTagsProvider(FabricPackOutput output, CompletableFuture<Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(Provider provider) {
        // Vanilla
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
        
        // Mod
        builder(TMBlockTags.ORE)
            .add(TMBlockItemIds.ICE_ETHER_ORE)
            .add(TMBlockItemIds.DEEPSLATE_ICE_ETHER_ORE)
            .forceAddTag(BlockItemTags.COAL_ORES.block())
            .forceAddTag(BlockItemTags.IRON_ORES.block())
            .forceAddTag(BlockItemTags.GOLD_ORES.block())
            .forceAddTag(BlockItemTags.DIAMOND_ORES.block())
            .forceAddTag(BlockItemTags.EMERALD_ORES.block())
            .forceAddTag(BlockItemTags.LAPIS_ORES.block())
            .forceAddTag(BlockItemTags.REDSTONE_ORES.block())
            .forceAddTag(BlockItemTags.COPPER_ORES.block());
        builder(TMBlockTags.MINEABLE_WITH_PICKAXE_AND_SHOVEL)
            .forceAddTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .forceAddTag(BlockTags.MINEABLE_WITH_SHOVEL);
    }
}
