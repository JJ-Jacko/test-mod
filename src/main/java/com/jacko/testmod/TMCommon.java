package com.jacko.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.ItemComponentTooltipProviderRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;
import com.jacko.testmod.util.TMArmorEffects;

public class TMCommon implements ModInitializer {
	public static final String MOD_ID = "test-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TMItems.init();
		TMBlocks.init();
		TMCreativeModeTabs.init();
		TMComponents.init();
		TMArmorEffects.init();
		ItemComponentTooltipProviderRegistry.addAfter(DataComponents.DAMAGE, TMComponents.COUNT_CLICK);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
