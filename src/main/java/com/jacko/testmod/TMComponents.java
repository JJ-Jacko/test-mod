package com.jacko.testmod;

import com.jacko.testmod.item.component.ComponentWithTooltip;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;

public class TMComponents {
    public static final DataComponentType<ComponentWithTooltip> COUNT_CLICK = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        TMCommon.id("count_click"),
        DataComponentType.<ComponentWithTooltip>builder()
            .persistent(ExtraCodecs.NON_NEGATIVE_INT.xmap(
                ComponentWithTooltip::new,
                ComponentWithTooltip::clickCount
            ))
            .networkSynchronized(ByteBufCodecs.VAR_INT.map(
                ComponentWithTooltip::new,
                ComponentWithTooltip::clickCount
            ))
            .build()
    );
    
    public static void init() {
        TMCommon.LOGGER.info("Initializing components...");
    }
}
