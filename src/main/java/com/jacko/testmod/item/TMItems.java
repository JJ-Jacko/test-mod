package com.jacko.testmod.item;

import java.util.function.Function;

import com.jacko.testmod.TMCommon;
import com.jacko.testmod.TMComponents;
import com.jacko.testmod.item.component.ComponentWithTooltip;
import com.jacko.testmod.item.custom.CounterItem;
import com.jacko.testmod.item.custom.ProspectorItem;
import com.jacko.testmod.item.equipment.TMArmorMaterials;
import com.jacko.testmod.tags.TMBlockTags;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class TMItems {
    public static final Item CHEESE = registerItem(
        TMItemIds.CHEESE,
        new Item.Properties().food(TMFoods.CHEESE, TMConsumables.CHEESE)
    );
    public static final Item CORN = registerItem(
        TMItemIds.CORN,
        new Item.Properties().food(TMFoods.CORN)
    );
    public static final Item POISONOUS_APPLE = registerItem(
        TMItemIds.POISONOUS_APPLE,
        new Item.Properties().food(TMFoods.POISONOUS_APPLE, TMConsumables.POISONOUS_APPLE)
    );
    public static final Item STRAWBERRY = registerItem(
        TMItemIds.STRAWBERRY,
        new Item.Properties().food(TMFoods.STRAWBERRY)
    );
    public static final Item QUARK_GLUON_PLASMA = registerItem(TMItemIds.QUARK_GLUON_PLASMA);
    public static final Item SUSPICIOUS_SUBSTANCE = registerItem(TMItemIds.SUSPICIOUS_SUBSTANCE);
    public static final Item ICE_ETHER = registerItem(TMItemIds.ICE_ETHER);
    public static final Item RAW_ICE_ETHER = registerItem(TMItemIds.RAW_ICE_ETHER);
    public static final Item ICE_ETHER_SWORD = registerItem(
        TMItemIds.ICE_ETHER_SWORD,
        new Item.Properties().sword(TMToolMaterial.ICE_ETHER, 3.0F, -2.4F)
    );
    public static final Item ICE_ETHER_SHOVEL = registerItem(
        TMItemIds.ICE_ETHER_SHOVEL,
        new Item.Properties().shovel(TMToolMaterial.ICE_ETHER, 1.5F, -3.0F)
    );
    public static final Item ICE_ETHER_PICKAXE = registerItem(
        TMItemIds.ICE_ETHER_PICKAXE,
        new Item.Properties().pickaxe(TMToolMaterial.ICE_ETHER, 1.0F, -2.8F)
    );
    public static final Item ICE_ETHER_AXE = registerItem(
        TMItemIds.ICE_ETHER_AXE,
        new Item.Properties().axe(TMToolMaterial.ICE_ETHER, 6.0F, -3.0F)
    );
    public static final Item ICE_ETHER_HOE = registerItem(
        TMItemIds.ICE_ETHER_HOE,
        new Item.Properties().hoe(TMToolMaterial.ICE_ETHER, 0.0F, -3.0F)
    );
    public static final Item ICE_ETHER_SPEAR = registerItem(
        TMItemIds.ICE_ETHER_SPEAR,
        new Item.Properties().spear(TMToolMaterial.ICE_ETHER, 0.95F, 0.7F, 0.7F, 3.5F, 13.0F, 8.5F, 5.1F, 13.75F, 4.6F)
    );
    public static final Item ICE_ETHER_PICKAXE_SHOVEL = registerItem(
        TMItemIds.ICE_ETHER_PICKAXE_SHOVEL,
        new Item.Properties()
            .tool(TMToolMaterial.ICE_ETHER, TMBlockTags.MINEABLE_WITH_PICKAXE_AND_SHOVEL, 1.0F, -2.8F, 0.0F)
    );
    public static final Item ICE_ETHER_HELMET = registerItem(
        TMItemIds.ICE_ETHER_HELMET,
        new Item.Properties()
            .humanoidArmor(TMArmorMaterials.ICE_ETHER, ArmorType.HELMET)
    );
    public static final Item ICE_ETHER_CHESTPLATE = registerItem(
        TMItemIds.ICE_ETHER_CHESTPLATE,
        new Item.Properties()
            .humanoidArmor(TMArmorMaterials.ICE_ETHER, ArmorType.CHESTPLATE)
    );
    public static final Item ICE_ETHER_LEGGINGS = registerItem(
        TMItemIds.ICE_ETHER_LEGGINGS,
        new Item.Properties()
            .humanoidArmor(TMArmorMaterials.ICE_ETHER, ArmorType.LEGGINGS)
    );
    public static final Item ICE_ETHER_BOOTS = registerItem(
        TMItemIds.ICE_ETHER_BOOTS,
        new Item.Properties()
            .humanoidArmor(TMArmorMaterials.ICE_ETHER, ArmorType.BOOTS)
    );
    public static final Item ANTHRACITE = registerItem(
        TMItemIds.ANTHRACITE,
        new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_COAL)
    );
    public static final Item PROSPECTOR = registerItem(
        TMItemIds.PROSPECTOR,
        ProspectorItem::new,
        new Item.Properties().durability(127)
    );
    public static final Item COUNTER = registerItem(
        TMItemIds.COUNTER,
        CounterItem::new,
        new Item.Properties()
            .component(TMComponents.COUNT_CLICK, new ComponentWithTooltip(0))
    );
    
    public static Item registerItem(
        final ResourceKey<Item> id,
        final Function<Item.Properties, Item> itemFactory,
        final Item.Properties properties
    ) {
        Item item = itemFactory.apply(properties.setId(id));
		if (item instanceof BlockItem blockItem) {
			blockItem.registerBlocks(Item.BY_BLOCK, item);
		}

        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    private static Item registerItem(
            final ResourceKey<Item> id,
            final Item.Properties properties
    ) {
        return registerItem(id, Item::new, properties);
    }

    private static Item registerItem(final ResourceKey<Item> id) {
        return registerItem(id, Item::new, new Item.Properties());
    }

    public static void init() {
        TMCommon.LOGGER.info("Initializing items...");
    }
}
