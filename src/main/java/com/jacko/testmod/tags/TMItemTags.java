package com.jacko.testmod.tags;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TMItemTags {
    public static final TagKey<Item> SUGER = bind("sugar");
    
    private static TagKey<Item> bind(String name) {
		return TagKey.create(Registries.ITEM, TMCommon.id(name));
	}
}
