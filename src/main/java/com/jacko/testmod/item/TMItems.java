package com.jacko.testmod.item;

import java.util.function.Function;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class TMItems {
    public static final Item CHEESE = register(
        TMItemIds.CHEESE,
        Item::new,
        new Item.Properties().food(TMFoods.CHEESE, TMConsumables.CHEESE)
    );
    public static final Item CORN = register(
        TMItemIds.CORN,
        Item::new,
        new Item.Properties().food(TMFoods.CORN)
    );
    public static final Item POISONOUS_APPLE = register(
        TMItemIds.POISONOUS_APPLE,
        Item::new,
        new Item.Properties().food(TMFoods.POISONOUS_APPLE, TMConsumables.POISONOUS_APPLE)
    );
    public static final Item STRAWBERRY = register(
        TMItemIds.STRAWBERRY,
        Item::new,
        new Item.Properties().food(TMFoods.STRAWBERRY)
    );
    public static final Item QUARK_GLUON_PLASMA = register(TMItemIds.QUARK_GLUON_PLASMA, Item::new, new Item.Properties());
    public static final Item SUSPICIOUS_SUBSTANCE = register(TMItemIds.SUSPICIOUS_SUBSTANCE, Item::new, new Item.Properties());
    public static final Item ICE_ETHER = register(TMItemIds.ICE_ETHER, Item::new, new Item.Properties());
    public static final Item RAW_ICE_ETHER = register(TMItemIds.RAW_ICE_ETHER, Item::new, new Item.Properties());
    public static final Item ANTHRACITE = register(TMItemIds.ANTHRACITE, Item::new,
        new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_COAL)
    );
    
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
        
    }
}
