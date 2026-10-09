package com.jacko.testmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static final ResourceKey<Item> SUSPICIOUS_SUBSTANCE = create("suspicious_substance"); 
    
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, TestMod.id(name));
    }
}
