package com.jacko.testmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class ModBlockIds {
    public static final ResourceKey<Block> CONDENSED_DIRT = create("condensed_dirt");
    
    private static ResourceKey<Block> create(String name) {
        // Create the block key.
        return ResourceKey.create(Registries.BLOCK, TestMod.id(name));
    }
}
