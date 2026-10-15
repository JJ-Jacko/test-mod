package com.jacko.testmod.item;

import java.util.List;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class TMConsumables {
    public static final Consumable POISONOUS_APPLE = Consumables.defaultFood()
        // duration: 20 ticks = 1 second
        // amplifier (level): 0, 1, 2 ... = I, II, III ...
        .onConsume(new ApplyStatusEffectsConsumeEffect(
            List.of(
                new MobEffectInstance(MobEffects.POISON, 6 * 20, 1),
                new MobEffectInstance(MobEffects.WITHER, 6 * 20, 2)
            ), 0.8F
        ))
        .build();
}
