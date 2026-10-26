package com.jacko.testmod.tags;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TMItemTags {
    public static final TagKey<Item> SUGER = bind("sugar");
    public static final TagKey<Item> ICE_ETHER_TOOL_MATERIALS = bind("ice_ether_tool_materials");
    public static final TagKey<Item> REPAIRS_ICE_ETHER_ARMOR = bind("repairs_ice_ether_armor");
    
    private static TagKey<Item> bind(String name) {
		return TagKey.create(Registries.ITEM, TMCommon.id(name));
	}
}
