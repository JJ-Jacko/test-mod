package com.jacko.testmod;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId CONDENSED_DIRT = create("condensed_dirt");
    public static final BlockItemId ICE_ETHER_ORE = create("ice_ether_ore");
    public static final BlockItemId DEEPSLATE_ICE_ETHER_ORE = create("deepslate_ice_ether_ore");
    
    private static BlockItemId create(String name) {
        Identifier id = TestMod.id(name);
        return BlockItemId.create(id, id);
    }
}
