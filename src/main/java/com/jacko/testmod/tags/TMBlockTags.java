package com.jacko.testmod.tags;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TMBlockTags {
    public static final TagKey<Block> ORE = create("ore");
    
    private static TagKey<Block> create(String name) {
		return TagKey.create(Registries.BLOCK, TMCommon.id(name));
	}
}
