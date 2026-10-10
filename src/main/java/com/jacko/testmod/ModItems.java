package com.jacko.testmod;

import java.util.function.Function;

import net.minecraft.core.registries.BuiltInRegistries;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModItems {
    public static final Item POISONOUS_APPLE = register(ModItemIds.POISONOUS_APPLE, Item::new, new Item.Properties().food(
        new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build(),
        Consumables.defaultFood()
            // duration: 20 ticks = 1 second
            // amplifier (level): 0, 1, 2 ... = I, II, III ...
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 6 * 20, 0), 1.0F))
            .build()
    ));
    // TODO: Custom Fuel 26.3 is using soft coding instead of hard coding.
    public static final Item QUARK_GLUON_PLASMA = register(ModItemIds.QUARK_GLUON_PLASMA, Item::new, new Item.Properties());
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
