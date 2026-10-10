package com.jacko.testmod.client.dataGen;

import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class LangEnglishProvider extends FabricLanguageProvider {

    public LangEnglishProvider(FabricPackOutput packOutput, CompletableFuture<Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.CONDENSED_DIRT, "Condensed Dirt");
        translationBuilder.add(ModItems.POISONOUS_APPLE, "Poisonous Apple");
        translationBuilder.add(ModItems.QUARK_GLUON_PLASMA, "Quark Gluon Plasma");
        translationBuilder.add(ModItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");
    }
}
