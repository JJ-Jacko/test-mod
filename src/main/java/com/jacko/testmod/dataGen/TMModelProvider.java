package com.jacko.testmod.dataGen;

import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class TMModelProvider extends FabricModelProvider {
    public TMModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generators) {
        generators.createTrivialCube(TMBlocks.CONDENSED_DIRT);
        generators.createTrivialCube(TMBlocks.ICE_ETHER_ORE);
        generators.createTrivialCube(TMBlocks.DEEPSLATE_ICE_ETHER_ORE);
        generators.createTrivialCube(TMBlocks.RAW_ICE_ETHER_BLOCK);
        generators.family(TMBlocks.ICE_ETHER_BLOCK)
            .stairs(TMBlocks.ICE_ETHER_STAIRS)
            .slab(TMBlocks.ICE_ETHER_SLAB)
            .button(TMBlocks.ICE_ETHER_BUTTON)
            .pressurePlate(TMBlocks.ICE_ETHER_PRESSURE_PLATE)
            .fence(TMBlocks.ICE_ETHER_FENCE)
            .fenceGate(TMBlocks.ICE_ETHER_FENCE_GATE)
            .wall(TMBlocks.ICE_ETHER_WALL);
        generators.createDoor(TMBlocks.ICE_ETHER_DOOR);
        generators.createTrapdoor(TMBlocks.ICE_ETHER_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
        generators.generateFlatItem(TMItems.CHEESE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.CORN, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.POISONOUS_APPLE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.STRAWBERRY, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.QUARK_GLUON_PLASMA, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.SUSPICIOUS_SUBSTANCE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.RAW_ICE_ETHER, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_PICKAXE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_HELMET, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_LEGGINGS, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.ICE_ETHER_BOOTS, ModelTemplates.FLAT_ITEM);
        generators.generateSpear(TMItems.ICE_ETHER_SPEAR);
        generators.generateFlatItem(TMItems.ANTHRACITE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.PROSPECTOR, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(TMItems.COUNTER, ModelTemplates.FLAT_ITEM);
    }
}
