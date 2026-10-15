package com.jacko.testmod.client.dataGen;

import com.jacko.testmod.TMBlocks;
import com.jacko.testmod.TMItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class TMBlockLootTableProvider extends FabricBlockLootSubProvider {
    public TMBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(TMBlocks.CONDENSED_DIRT);

        add(TMBlocks.ICE_ETHER_ORE, createOreDrop(TMBlocks.ICE_ETHER_ORE, TMItems.RAW_ICE_ETHER));
        add(TMBlocks.DEEPSLATE_ICE_ETHER_ORE, createOreDrop(TMBlocks.DEEPSLATE_ICE_ETHER_ORE, TMItems.RAW_ICE_ETHER));

        dropSelf(TMBlocks.RAW_ICE_ETHER_BLOCK);
        dropSelf(TMBlocks.ICE_ETHER_BLOCK);
        dropSelf(TMBlocks.ICE_ETHER_STAIRS);
        dropSelf(TMBlocks.ICE_ETHER_SLAB);
        dropSelf(TMBlocks.ICE_ETHER_BUTTON);
        dropSelf(TMBlocks.ICE_ETHER_PRESSURE_PLATE);
        dropSelf(TMBlocks.ICE_ETHER_FENCE);
        dropSelf(TMBlocks.ICE_ETHER_FENCE_GATE);
        dropSelf(TMBlocks.ICE_ETHER_WALL);
        dropSelf(TMBlocks.ICE_ETHER_DOOR);
        dropSelf(TMBlocks.ICE_ETHER_TRAPDOOR);
    }

    @Override
    public BlockLootSubProvider withConditions(ResourceCondition... conditions) {
        return super.withConditions(conditions);
    }

    @Override
    public BiConsumer<ResourceKey<LootTable>, LootTable.Builder> withConditions(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> exporter, ResourceCondition... conditions) {
        return super.withConditions(exporter, conditions);
    }
}
