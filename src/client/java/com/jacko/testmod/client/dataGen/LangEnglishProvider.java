package com.jacko.testmod.client.dataGen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class LangEnglishProvider extends FabricLanguageProvider {

    public LangEnglishProvider(FabricPackOutput packOutput, CompletableFuture<Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.test-mod.poisonous_apple", "Poisonous Apple");
        translationBuilder.add("item.test-mod.quark_gluon_plasma", "Quark Gluon Plasma");
        translationBuilder.add("item.test-mod.suspicious_substance", "Suspicious Substance");
    }
}
