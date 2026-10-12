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
            .add(ModBlockItemIds.DEEPSLATE_ICE_ETHER_ORE);
            
        builder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlockItemIds.ICE_ETHER_ORE)
            .add(ModBlockItemIds.DEEPSLATE_ICE_ETHER_ORE);
    }
}
