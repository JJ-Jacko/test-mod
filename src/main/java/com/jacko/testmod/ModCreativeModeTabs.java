package com.jacko.testmod;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> TEST_MOD_ITEMS_TAB_KEY = ResourceKey.create(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(),
        TestMod.id("test_mod_items")
    );

    public static final CreativeModeTab TEST_MOD_ITEMS_TAB  = FabricCreativeModeTab.builder()
        .icon(() -> new ItemStack(ModItems.POISONOUS_APPLE))
        .title(Component.translatable("test_mod_items.test-mod"))
        .displayItems(((parameters, output) -> {
            output.accept(ModItems.POISONOUS_APPLE);
            output.accept(ModItems.QUARK_GLUON_PLASMA);
            output.accept(ModItems.SUSPICIOUS_SUBSTANCE);
            output.accept(ModBlocks.CONDENSED_DIRT);

            output.accept(ModItems.ICE_ETHER);
            output.accept(ModBlocks.ICE_ETHER_ORE);
            output.accept(ModBlocks.DEEPSLATE_ICE_ETHER_ORE);
            output.accept(ModBlocks.ICE_ETHER_BLOCK);
        }))
        .build();
    
    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TEST_MOD_ITEMS_TAB_KEY, TEST_MOD_ITEMS_TAB);
    }
}
