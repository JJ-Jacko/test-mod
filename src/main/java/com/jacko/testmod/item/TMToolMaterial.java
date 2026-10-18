package com.jacko.testmod.item;

import com.jacko.testmod.tags.TMItemTags;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class TMToolMaterial {
    public static final ToolMaterial ICE_ETHER = new ToolMaterial(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
        64, 14.0F, 3.0F, 28,
        TMItemTags.ICE_ETHER_TOOL_MATERIALS
    );
}
