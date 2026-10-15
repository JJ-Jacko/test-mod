package com.jacko.testmod;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TMCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> TEST_MOD_ITEMS_TAB_KEY = ResourceKey.create(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(),
        TMCommon.id("test_mod_items")
    );

    public static final CreativeModeTab TEST_MOD_ITEMS_TAB  = FabricCreativeModeTab.builder()
        .icon(() -> new ItemStack(TMItems.POISONOUS_APPLE))
        .title(Component.translatable("test_mod_items.test-mod"))
        .displayItems(((parameters, output) -> {
            output.accept(TMItems.POISONOUS_APPLE);
            output.accept(TMItems.QUARK_GLUON_PLASMA);
            output.accept(TMItems.SUSPICIOUS_SUBSTANCE);
            output.accept(TMItems.ANTHRACITE);
            output.accept(TMBlocks.CONDENSED_DIRT);

            output.accept(TMItems.ICE_ETHER);
            output.accept(TMItems.RAW_ICE_ETHER);
            output.accept(TMBlocks.ICE_ETHER_ORE);
            output.accept(TMBlocks.DEEPSLATE_ICE_ETHER_ORE);
            output.accept(TMBlocks.RAW_ICE_ETHER_BLOCK);
            output.accept(TMBlocks.ICE_ETHER_BLOCK);
            output.accept(TMBlocks.ICE_ETHER_STAIRS);
            output.accept(TMBlocks.ICE_ETHER_SLAB);
            output.accept(TMBlocks.ICE_ETHER_BUTTON);
            output.accept(TMBlocks.ICE_ETHER_PRESSURE_PLATE);
            output.accept(TMBlocks.ICE_ETHER_FENCE);
            output.accept(TMBlocks.ICE_ETHER_FENCE_GATE);
            output.accept(TMBlocks.ICE_ETHER_WALL);
            output.accept(TMBlocks.ICE_ETHER_DOOR);
            output.accept(TMBlocks.ICE_ETHER_TRAPDOOR);
        }))
        .build();
    
    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TEST_MOD_ITEMS_TAB_KEY, TEST_MOD_ITEMS_TAB);
    }
}
