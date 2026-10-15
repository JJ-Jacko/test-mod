package com.jacko.testmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;

public class TMCommon implements ModInitializer {
	public static final String MOD_ID = "test-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TMItems.initialize();
		TMBlocks.initialize();
		TMCreativeModeTabs.initialize();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
