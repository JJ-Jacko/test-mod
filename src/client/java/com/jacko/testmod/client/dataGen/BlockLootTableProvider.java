package com.jacko.testmod.client.dataGen;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class BlockLootTableProvider extends FabricBlockLootSubProvider {

    public BlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.CONDENSED_DIRT);

        dropWhenSilkTouch(ModBlocks.ICE_ETHER_ORE);
        add(ModBlocks.ICE_ETHER_ORE, createOreDrop(ModBlocks.ICE_ETHER_ORE, ModItems.RAW_ICE_ETHER));
        dropWhenSilkTouch(ModBlocks.DEEPSLATE_ICE_ETHER_ORE);
        add(ModBlocks.DEEPSLATE_ICE_ETHER_ORE, createOreDrop(ModBlocks.DEEPSLATE_ICE_ETHER_ORE, ModItems.RAW_ICE_ETHER));

        dropSelf(ModBlocks.ICE_ETHER_BLOCK);
        dropSelf(ModBlocks.ICE_ETHER_STAIRS);
        dropSelf(ModBlocks.ICE_ETHER_SLAB);
        dropSelf(ModBlocks.ICE_ETHER_BUTTON);
        dropSelf(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
        dropSelf(ModBlocks.ICE_ETHER_FENCE);
        dropSelf(ModBlocks.ICE_ETHER_FENCE_GATE);
        dropSelf(ModBlocks.ICE_ETHER_WALL);
        dropSelf(ModBlocks.ICE_ETHER_DOOR);
        dropSelf(ModBlocks.ICE_ETHER_TRAPDOOR);
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
