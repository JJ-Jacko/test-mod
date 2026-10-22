package com.jacko.testmod.item;

import java.util.function.Function;

import com.jacko.testmod.TMCommon;
import com.jacko.testmod.TMComponents;
import com.jacko.testmod.item.component.ComponentWithTooltip;
import com.jacko.testmod.item.custom.CounterItem;
import com.jacko.testmod.item.custom.ProspectorItem;
import com.jacko.testmod.tags.TMBlockTags;

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
    public static final Item ICE_ETHER_SWORD = register(
        TMItemIds.ICE_ETHER_SWORD,
        Item::new,
        new Item.Properties().sword(TMToolMaterial.ICE_ETHER, 3.0F, -2.4F)
    );
    public static final Item ICE_ETHER_SHOVEL = register(
        TMItemIds.ICE_ETHER_SHOVEL,
        Item::new,
        new Item.Properties().shovel(TMToolMaterial.ICE_ETHER, 1.5F, -3.0F)
    );
    public static final Item ICE_ETHER_PICKAXE = register(
        TMItemIds.ICE_ETHER_PICKAXE,
        Item::new,
        new Item.Properties().pickaxe(TMToolMaterial.ICE_ETHER, 1.0F, -2.8F)
    );
    public static final Item ICE_ETHER_AXE = register(
        TMItemIds.ICE_ETHER_AXE,
        Item::new,
        new Item.Properties().axe(TMToolMaterial.ICE_ETHER, 6.0F, -3.0F)
    );
    public static final Item ICE_ETHER_HOE = register(
        TMItemIds.ICE_ETHER_HOE,
        Item::new,
        new Item.Properties().hoe(TMToolMaterial.ICE_ETHER, 0.0F, -3.0F)
    );
    public static final Item ICE_ETHER_SPEAR = register(
        TMItemIds.ICE_ETHER_SPEAR,
        Item::new,
        new Item.Properties().spear(TMToolMaterial.ICE_ETHER, 0.95F, 0.7F, 0.7F, 3.5F, 13.0F, 8.5F, 5.1F, 13.75F, 4.6F)
    );
    public static final Item ICE_ETHER_PICKAXE_SHOVEL = register(
        TMItemIds.ICE_ETHER_PICKAXE_SHOVEL,
        Item::new,
        new Item.Properties()
            .tool(TMToolMaterial.ICE_ETHER, TMBlockTags.MINEABLE_WITH_PICKAXE_AND_SHOVEL, 1.0F, -2.8F, 0.0F)
    );
    public static final Item ANTHRACITE = register(TMItemIds.ANTHRACITE, Item::new,
        new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_COAL)
    );
    public static final Item PROSPECTOR = register(
        TMItemIds.PROSPECTOR,
        ProspectorItem::new,
        new Item.Properties().durability(127)
    );
    public static final Item COUNTER = register(
        TMItemIds.COUNTER,
        CounterItem::new,
        new Item.Properties()
            .component(TMComponents.COUNT_CLICK, new ComponentWithTooltip(0))
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

    public static void init() {
        TMCommon.LOGGER.info("Initializing items...");
    }
}
