package com.jacko.testmod.item.custom;

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
        ItemStack usedItem = player.getItemInHand(hand);
        usedItem.consume(1, player);
        
        return InteractionResult.SUCCESS;
    }
}
