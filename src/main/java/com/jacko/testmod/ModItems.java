package com.jacko.testmod;

import java.util.function.Function;

import net.minecraft.core.registries.BuiltInRegistries;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = register(ModItemIds.SUSPICIOUS_SUBSTANCE, Item::new, new Item.Properties());
    
    public static Item register(
        ResourceKey<Item> itemKey,
        Function<Item.Properties, Item> itemFactory,
        Item.Properties settings
    ) {
        // Create the item instance.
        Item item = itemFactory.apply(settings.setId(itemKey));
        
        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
            .register((creativeTab) -> creativeTab.accept(SUSPICIOUS_SUBSTANCE));
    }
}
