package com.jacko.testmod.dataGen;

import com.jacko.testmod.block.IceEtherrotBlock;
import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;

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

        LootItemCondition.Builder isIceEtherrotMaxAge = MatchBlock.blockMatches(
			this.blocks, TMBlocks.ICE_ETHERROTS, StatePropertiesPredicate.Builder.properties().hasProperty(IceEtherrotBlock.AGE, 7)
		);
        add(
			TMBlocks.ICE_ETHERROTS,
			this.applyExplosionDecay(
				TMBlocks.ICE_ETHERROTS,
				LootTable.lootTable()
					.withPool(
                        LootPool.lootPool()
                            .add(LootItem.lootTableItem(TMItems.ICE_ETHERROT))
                    )
					.withPool(
						LootPool.lootPool()
							.when(isIceEtherrotMaxAge)
							.add(LootItem.lootTableItem(TMItems.ICE_ETHERROT).apply(ApplyBonusCount.addBonusBinomialDistributionCount(this.enchantments.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3)))
					)
			)
		);
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
