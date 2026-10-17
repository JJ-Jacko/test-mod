package com.jacko.testmod.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.item.TMItemIds;
import com.jacko.testmod.tags.TMItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.references.ItemIds;

public class TMItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public TMItemTagsProvider(FabricPackOutput output, CompletableFuture<Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(Provider provider) {
        builder(TMItemTags.SUGER)
            .add(ItemIds.BEETROOT)
            .add(TMItemIds.STRAWBERRY);
    }
}
