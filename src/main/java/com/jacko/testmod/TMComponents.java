package com.jacko.testmod;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;

public class TMComponents {
    public static final DataComponentType<Integer> COUNT_CLICK = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        TMCommon.id("count_click"),
        DataComponentType.<Integer>builder().persistent(ExtraCodecs.NON_NEGATIVE_INT).networkSynchronized(ByteBufCodecs.VAR_INT).build()
    );
    
    public static void init() {
        TMCommon.LOGGER.info("Initializing components...");
    }
}
