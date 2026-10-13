package com.jacko.testmod;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId CONDENSED_DIRT = create("condensed_dirt");
    public static final BlockItemId ICE_ETHER_ORE = create("ice_ether_ore");
    public static final BlockItemId DEEPSLATE_ICE_ETHER_ORE = create("deepslate_ice_ether_ore");
    public static final BlockItemId ICE_ETHER_BLOCK = create("ice_ether_block");
    public static final BlockItemId ICE_ETHER_STAIRS = create("ice_ether_stairs");
    public static final BlockItemId ICE_ETHER_SLAB = create("ice_ether_slab");
    public static final BlockItemId ICE_ETHER_BUTTON = create("ice_ether_button");
    public static final BlockItemId ICE_ETHER_PRESSURE_PLATE = create("ice_ether_pressure_plate");
    public static final BlockItemId ICE_ETHER_FENCE = create("ice_ether_fence");
    public static final BlockItemId ICE_ETHER_FENCE_GATE = create("ice_ether_fence_gate");
    public static final BlockItemId ICE_ETHER_WALL = create("ice_ether_wall");
    public static final BlockItemId ICE_ETHER_DOOR = create("ice_ether_door");
    public static final BlockItemId ICE_ETHER_TRAPDOOR = create("ice_ether_trapdoor");
    
    private static BlockItemId create(String name) {
        Identifier id = TestMod.id(name);
        return BlockItemId.create(id, id);
    }
}
