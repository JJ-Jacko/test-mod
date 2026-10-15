package com.jacko.testmod.item;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class TMItemIds {
    public static final ResourceKey<Item> POISONOUS_APPLE = create("poisonous_apple"); 
    public static final ResourceKey<Item> QUARK_GLUON_PLASMA = create("quark_gluon_plasma"); 
    public static final ResourceKey<Item> SUSPICIOUS_SUBSTANCE = create("suspicious_substance"); 
    public static final ResourceKey<Item> ICE_ETHER = create("ice_ether"); 
    public static final ResourceKey<Item> RAW_ICE_ETHER = create("raw_ice_ether"); 
    public static final ResourceKey<Item> ANTHRACITE = create("anthracite"); 
    
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, TMCommon.id(name));
    }
}
