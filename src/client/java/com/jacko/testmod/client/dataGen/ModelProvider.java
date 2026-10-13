package com.jacko.testmod.client.dataGen;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generators) {
        generators.createTrivialCube(ModBlocks.CONDENSED_DIRT);
        generators.createTrivialCube(ModBlocks.ICE_ETHER_ORE);
        generators.createTrivialCube(ModBlocks.DEEPSLATE_ICE_ETHER_ORE);
        generators.createTrivialCube(ModBlocks.RAW_ICE_ETHER_BLOCK);
        generators.family(ModBlocks.ICE_ETHER_BLOCK)
            .stairs(ModBlocks.ICE_ETHER_STAIRS)
            .slab(ModBlocks.ICE_ETHER_SLAB)
            .button(ModBlocks.ICE_ETHER_BUTTON)
            .pressurePlate(ModBlocks.ICE_ETHER_PRESSURE_PLATE)
            .fence(ModBlocks.ICE_ETHER_FENCE)
            .fenceGate(ModBlocks.ICE_ETHER_FENCE_GATE)
            .wall(ModBlocks.ICE_ETHER_WALL);
        generators.createDoor(ModBlocks.ICE_ETHER_DOOR);
        generators.createTrapdoor(ModBlocks.ICE_ETHER_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
        generators.generateFlatItem(ModItems.POISONOUS_APPLE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.QUARK_GLUON_PLASMA, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.SUSPICIOUS_SUBSTANCE, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ICE_ETHER, ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_ICE_ETHER, ModelTemplates.FLAT_ITEM);
    }
}
