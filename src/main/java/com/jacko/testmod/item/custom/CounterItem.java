package com.jacko.testmod.item.custom;

import com.jacko.testmod.TMComponents;
import com.jacko.testmod.item.component.ComponentWithTooltip;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CounterItem extends Item {
    public CounterItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        ItemStack stack = player.getItemInHand(hand);
        int count = stack.getOrDefault(TMComponents.COUNT_CLICK, new ComponentWithTooltip(0)).clickCount();
        stack.set(TMComponents.COUNT_CLICK, new ComponentWithTooltip(++count));
        
        return InteractionResult.SUCCESS;
    }
}
