package com.jacko.testmod;
import java.util.function.Function;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

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
