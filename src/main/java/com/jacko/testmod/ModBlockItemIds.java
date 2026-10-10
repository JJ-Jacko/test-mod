package com.jacko.testmod;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId CONDENSED_DIRT = create("condensed_dirt");
    
    private static BlockItemId create(String name) {
        Identifier id = TestMod.id(name);
        return BlockItemId.create(id, id);
    }
}
