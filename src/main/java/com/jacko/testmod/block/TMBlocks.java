package com.jacko.testmod.block;

import java.util.function.Function;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class TMBlocks {
    public static final Block CONDENSED_DIRT = register(
        TMBlockItemIds.CONDENSED_DIRT,
        BlockBehaviour.Properties.of().sound(SoundType.GLASS)
    );
    public static final Block ICE_ETHER_ORE = register(
        TMBlockItemIds.ICE_ETHER_ORE,
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F)
    );
    public static final Block DEEPSLATE_ICE_ETHER_ORE = register(
        TMBlockItemIds.DEEPSLATE_ICE_ETHER_ORE,
        BlockBehaviour.Properties.of()
            .sound(SoundType.DEEPSLATE)
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
    );
    public static final Block RAW_ICE_ETHER_BLOCK = register(
        TMBlockItemIds.RAW_ICE_ETHER_BLOCK,
        BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops()
            .strength(2.0F, 2.0F)
    );
    public static final Block ICE_ETHER_BLOCK = register(
        TMBlockItemIds.ICE_ETHER_BLOCK,
        BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0F, 6.0F)
    );
    public static final Block ICE_ETHER_STAIRS = register(
        TMBlockItemIds.ICE_ETHER_STAIRS,
        p -> new StairBlock(ICE_ETHER_BLOCK.defaultBlockState(), p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_SLAB = register(
        TMBlockItemIds.ICE_ETHER_SLAB,
        SlabBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_BUTTON = register(
        TMBlockItemIds.ICE_ETHER_BUTTON,
        p -> new ButtonBlock(BlockSetType.STONE, 20, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_PRESSURE_PLATE = register(
        TMBlockItemIds.ICE_ETHER_PRESSURE_PLATE,
        p -> new PressurePlateBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_FENCE = register(
        TMBlockItemIds.ICE_ETHER_FENCE,
        FenceBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_FENCE_GATE = register(
        TMBlockItemIds.ICE_ETHER_FENCE_GATE,
        p -> new FenceGateBlock(WoodType.OAK, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_WALL = register(
        TMBlockItemIds.ICE_ETHER_WALL,
        WallBlock::new,
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_DOOR = register(
        TMBlockItemIds.ICE_ETHER_DOOR,
        p -> new DoorBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHER_TRAPDOOR = register(
        TMBlockItemIds.ICE_ETHER_TRAPDOOR,
        p -> new TrapDoorBlock(BlockSetType.STONE, p),
        BlockBehaviour.Properties.ofFullCopy(ICE_ETHER_BLOCK)
    );
    public static final Block ICE_ETHERROTS = register(
        TMBlockItemIds.ICE_ETHERROT_CROP,
        IceEtherrotBlock::new,
        BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS)
    );
    public static final Block STRAWBERRIES = register(
        TMBlockItemIds.STRAWBERRY_CROP,
        StrawberryBlock::new,
        BlockBehaviour.Properties.of()
            .mapColor(state -> state.getValue(StrawberryBlock.AGE) >= 4 ? MapColor.COLOR_RED : MapColor.PLANT)
			.noCollision()
			.randomTicks()
			.instabreak()
			.sound(SoundType.CROP)
			.pushReaction(PushReaction.POPPED)
    );
    
    private static Block register(
            final ResourceKey<Block> id,
            final Function<BlockBehaviour.Properties, Block> blockFactory,
            final BlockBehaviour.Properties properties
    ) {
        Block block = blockFactory.apply(properties.setId(id));
        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static Block register(
            final BlockItemId id,
            final Function<BlockBehaviour.Properties, Block> blockFactory,
            final BlockBehaviour.Properties properties
    ) {
        return register(id.block(), blockFactory, properties);
    }

    private static Block register(
            final BlockItemId id,
            final BlockBehaviour.Properties properties
    ) {
        return register(id, Block::new, properties);
    }

    public static void init() {
        TMCommon.LOGGER.info("Initializing blocks...");
    }
}
