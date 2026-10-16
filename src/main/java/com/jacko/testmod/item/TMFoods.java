package com.jacko.testmod.item;

import net.minecraft.world.food.FoodProperties;

public class TMFoods {
    // saturation = nutrition * saturationModifier * 2
    
    public static final FoodProperties CHEESE = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(1.2F)
        .build();
    public static final FoodProperties CORN = new FoodProperties.Builder()
        .nutrition(2)
        .saturationModifier(1.0F)
        .build();
    public static final FoodProperties POISONOUS_APPLE = new FoodProperties.Builder()
        .nutrition(2)
        .saturationModifier(0.1F)
        .build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder()
        .nutrition(2)
        .saturationModifier(1.0F)
        .build();
}
