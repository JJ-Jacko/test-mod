package com.jacko.testmod.item.component;

import java.util.function.Consumer;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentGetter;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipProvider;

public record ComponentWithTooltip(int clickCount) implements TooltipProvider {
    public static final String TRANSLATION_INFO = "item.test-mod.counter.info";

    @Override
    public void addToTooltip(
            TooltipContext context,
            Consumer<Component> consumer,
            TooltipFlag flag,
            DataComponentGetter components
    ) {
        consumer.accept(Component.translatable(TRANSLATION_INFO, this.clickCount).withStyle(ChatFormatting.GOLD));
    }
}
