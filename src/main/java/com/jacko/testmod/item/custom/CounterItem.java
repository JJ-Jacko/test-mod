package com.jacko.testmod.item.custom;

import java.util.function.Consumer;

import com.jacko.testmod.TMComponents;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

public class CounterItem extends Item {
    public static final String TRANSLATION_INFO = "item.test-mod.counter.info";
    
    public CounterItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack usedItem = player.getItemInHand(hand);
        usedItem.consume(1, player);
        
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(
            ItemStack itemStack,
            TooltipContext context,
            TooltipDisplay display,
            Consumer<Component> builder,
            TooltipFlag tooltipFlag
    ) {
        int count = itemStack.getOrDefault(TMComponents.COUNT_CLICK, 0);
        builder.accept(Component.translatable(TRANSLATION_INFO, count).withStyle(ChatFormatting.GOLD));
    }
}
