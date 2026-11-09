package com.jacko.testmod.block;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class TMBlockIds {
    private static ResourceKey<Block> create(String name) {
        return ResourceKey.create(Registries.BLOCK, TMCommon.id(name));
    }
}
