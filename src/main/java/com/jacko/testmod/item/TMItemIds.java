package com.jacko.testmod.item;

import com.jacko.testmod.TMCommon;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class TMItemIds {
    public static final ResourceKey<Item> CHEESE = create("cheese"); 
    public static final ResourceKey<Item> CORN = create("corn"); 
    public static final ResourceKey<Item> POISONOUS_APPLE = create("poisonous_apple"); 
    public static final ResourceKey<Item> STRAWBERRY = create("strawberry"); 
    public static final ResourceKey<Item> QUARK_GLUON_PLASMA = create("quark_gluon_plasma"); 
    public static final ResourceKey<Item> SUSPICIOUS_SUBSTANCE = create("suspicious_substance"); 
    public static final ResourceKey<Item> ICE_ETHER = create("ice_ether"); 
    public static final ResourceKey<Item> RAW_ICE_ETHER = create("raw_ice_ether"); 
    public static final ResourceKey<Item> ICE_ETHER_SWORD = create("ice_ether_sword"); 
    public static final ResourceKey<Item> ICE_ETHER_SHOVEL = create("ice_ether_shovel"); 
    public static final ResourceKey<Item> ICE_ETHER_PICKAXE = create("ice_ether_pickaxe"); 
    public static final ResourceKey<Item> ICE_ETHER_AXE = create("ice_ether_axe"); 
    public static final ResourceKey<Item> ICE_ETHER_HOE = create("ice_ether_hoe"); 
    public static final ResourceKey<Item> ICE_ETHER_SPEAR = create("ice_ether_spear"); 
    public static final ResourceKey<Item> ICE_ETHER_PICKAXE_SHOVEL = create("ice_ether_pickaxe_shovel"); 
    public static final ResourceKey<Item> ICE_ETHER_HELMET = create("ice_ether_helmet"); 
    public static final ResourceKey<Item> ICE_ETHER_CHESTPLATE = create("ice_ether_chestplate"); 
    public static final ResourceKey<Item> ICE_ETHER_LEGGINGS = create("ice_ether_leggings"); 
    public static final ResourceKey<Item> ICE_ETHER_BOOTS = create("ice_ether_boots"); 
    public static final ResourceKey<Item> ANTHRACITE = create("anthracite"); 
    public static final ResourceKey<Item> PROSPECTOR = create("prospector"); 
    public static final ResourceKey<Item> COUNTER = create("counter"); 
    
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, TMCommon.id(name));
    }
}
