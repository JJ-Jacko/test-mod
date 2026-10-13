package com.jacko.testmod;
import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModBlocks {
    public static final Block CONDENSED_DIRT = register(
        ModBlockItemIds.CONDENSED_DIRT,
        Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.GLASS)
    );
    public static final Block ICE_ETHER_ORE = register(
        ModBlockItemIds.ICE_ETHER_ORE,
        Block::new,
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F)
    );
    public static final Block DEEPSLATE_ICE_ETHER_ORE = register(
        ModBlockItemIds.DEEPSLATE_ICE_ETHER_ORE,
        Block::new,
        BlockBehaviour.Properties.of()
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
    );
    public static final Block ICE_ETHER_BLOCK = register(
        ModBlockItemIds.ICE_ETHER_BLOCK,
        Block::new,
        BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0F, 6.0F)
    );
    public static final Block ICE_ETHER_STAIRS = register(
        ModBlockItemIds.ICE_ETHER_STAIRS,
        p -> new StairBlock(ICE_ETHER_BLOCK.defaultBlockState(), p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_SLAB = register(
        ModBlockItemIds.ICE_ETHER_SLAB,
        SlabBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_BUTTON = register(
        ModBlockItemIds.ICE_ETHER_BUTTON,
        p -> new ButtonBlock(BlockSetType.STONE, 20, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_PRESSURE_PLATE = register(
        ModBlockItemIds.ICE_ETHER_PRESSURE_PLATE,
        p -> new PressurePlateBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_FENCE = register(
        ModBlockItemIds.ICE_ETHER_FENCE,
        FenceBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_FENCE_GATE = register(
        ModBlockItemIds.ICE_ETHER_FENCE_GATE,
        p -> new FenceGateBlock(WoodType.OAK, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_WALL = register(
        ModBlockItemIds.ICE_ETHER_WALL,
        WallBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_DOOR = register(
        ModBlockItemIds.ICE_ETHER_DOOR,
        p -> new DoorBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_TRAPDOOR = register(
        ModBlockItemIds.ICE_ETHER_TRAPDOOR,
        p -> new TrapDoorBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    
    private static Block register(
            ResourceKey<Block> id,
            Function<BlockBehaviour.Properties, Block> blockFactory,
            BlockBehaviour.Properties properties
    ) {
        // Create the block instance
        Block block = blockFactory.apply(properties.setId(id));

        // Register the block.
        Registry.register(BuiltInRegistries.BLOCK, id, block);

        return block;
    }

    private static Block register(
            BlockItemId id,
            Function<BlockBehaviour.Properties, Block> blockFactory,
            BlockBehaviour.Properties properties
    ) {
        // Create the block instance
        Block block = register(id.block(), blockFactory, properties);

        // Create the block item instance
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
        Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);

        return block;
    }

    public static void initialize() {
        
    }
}
