package com.jacko.testmod.item;

import net.minecraft.world.food.FoodProperties;

public class TMFoods {
    public static final FoodProperties POISONOUS_APPLE = new FoodProperties.Builder()
        .nutrition(2)
        .saturationModifier(0.1F)
        .build();
}
