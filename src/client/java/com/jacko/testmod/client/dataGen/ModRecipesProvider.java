package com.jacko.testmod.client.dataGen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricPackOutput output, CompletableFuture<Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<ItemLike> ICE_ETHER_LIST = List.of(
        ModItems.RAW_ICE_ETHER,
        ModBlocks.ICE_ETHER_ORE,
        ModBlocks.DEEPSLATE_ICE_ETHER_ORE
    );

    @Override
    protected RecipeProvider createRecipeProvider(
            Provider registries,
            BootstrapContext<Recipe<?>> recipes,
            BootstrapContext<Advancement> advancements
    ) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                oreSmelting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ICE_ETHER, 0.7F, 200, "ice_ether");
                oreBlasting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ICE_ETHER, 0.7F, 100, "ice_ether");
            }
        };
    }
}
