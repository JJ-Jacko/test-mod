package com.jacko.testmod.tags;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TMBlockTags {
    public static final TagKey<Block> ORE = create("ore");
    public static final TagKey<Block> MINEABLE_WITH_PICKAXE_AND_SHOVEL = create("mineable/pickaxe_and_shovel");
    
    private static TagKey<Block> create(String name) {
		return TagKey.create(Registries.BLOCK, TMCommon.id(name));
	}
}
