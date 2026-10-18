package com.jacko.testmod.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.item.TMItemIds;
import com.jacko.testmod.tags.TMItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;

public class TMItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public TMItemTagsProvider(FabricPackOutput output, CompletableFuture<Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(Provider provider) {
        builder(TMItemTags.SUGER)
            .add(ItemIds.BEETROOT)
            .add(TMItemIds.STRAWBERRY);
        builder(TMItemTags.ICE_ETHER_TOOL_MATERIALS)
            .add(TMItemIds.ICE_ETHER);
        builder(ItemTags.SWORDS)
            .add(TMItemIds.ICE_ETHER_SWORD);
        builder(ItemTags.SHOVELS)
            .add(TMItemIds.ICE_ETHER_SHOVEL);
        builder(ItemTags.PICKAXES)
            .add(TMItemIds.ICE_ETHER_PICKAXE);
        builder(ItemTags.AXES)
            .add(TMItemIds.ICE_ETHER_AXE);
        builder(ItemTags.HOES)
            .add(TMItemIds.ICE_ETHER_HOE);
        builder(ItemTags.SPEARS)
            .add(TMItemIds.ICE_ETHER_SPEAR);
    }
}
