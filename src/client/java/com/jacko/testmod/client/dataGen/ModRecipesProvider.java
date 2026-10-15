package com.jacko.testmod.client.dataGen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.ModBlocks;
import com.jacko.testmod.ModItems;
import com.jacko.testmod.TestMod;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
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
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ICE_ETHER_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);

				// Shapeless
                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_ORE)
                    .requires(ModItems.RAW_ICE_ETHER)
                    .requires(Items.STONE)
                    .unlockedBy(getHasName(ModItems.RAW_ICE_ETHER), has(ModItems.RAW_ICE_ETHER))
                    .save(output);
				shapeless(RecipeCategory.REDSTONE, ModBlocks.ICE_ETHER_BUTTON)
                    .requires(ModItems.ICE_ETHER)
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .save(output);
                
				// Shaped
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_STAIRS, 4)
                    .define('#', ModBlocks.ICE_ETHER_BLOCK)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .unlockedBy(getHasName(ModBlocks.ICE_ETHER_BLOCK), has(ModBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_SLAB, 6)
                    .define('#', ModBlocks.ICE_ETHER_BLOCK)
                    .pattern("###")
                    .unlockedBy(getHasName(ModBlocks.ICE_ETHER_BLOCK), has(ModBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.REDSTONE, ModBlocks.ICE_ETHER_PRESSURE_PLATE, 1)
                    .define('#', ModItems.ICE_ETHER)
                    .pattern("##")
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_FENCE, 6)
                    .define('*', ModItems.ICE_ETHER)
                    .define('#', ModBlocks.ICE_ETHER_BLOCK)
                    .pattern("#*#")
                    .pattern("#*#")
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .unlockedBy(getHasName(ModBlocks.ICE_ETHER_BLOCK), has(ModBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_FENCE_GATE)
                    .define('*', ModItems.ICE_ETHER)
                    .define('#', ModBlocks.ICE_ETHER_BLOCK)
                    .pattern("*#*")
                    .pattern("*#*")
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .unlockedBy(getHasName(ModBlocks.ICE_ETHER_BLOCK), has(ModBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_WALL, 6)
                    .define('#', ModBlocks.ICE_ETHER_BLOCK)
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy(getHasName(ModBlocks.ICE_ETHER_BLOCK), has(ModBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_DOOR, 3)
                    .define('#', ModItems.ICE_ETHER)
                    .pattern("## ")
                    .pattern("## ")
                    .pattern("## ")
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_TRAPDOOR)
                    .define('#', ModItems.ICE_ETHER)
                    .pattern("## ")
                    .pattern("## ")
                    .unlockedBy(getHasName(ModItems.ICE_ETHER), has(ModItems.ICE_ETHER))
                    .save(output);
                
                
                oreSmelting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ICE_ETHER, 0.7F, 200, "ice_ether");
                oreBlasting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ICE_ETHER, 0.7F, 100, "ice_ether");

                // Smoker
                SimpleCookingRecipeBuilder.smoking(
                    Ingredient.of(Items.ROTTEN_FLESH),
                    RecipeCategory.MISC,
                    Items.LEATHER,
                    0.7F, 100
                )
                    .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                    .save(output, TestMod.id("smoker_rotten_flesh_to_leather").toString());
                
                // Campfire
                SimpleCookingRecipeBuilder.campfireCooking(
                    Ingredient.of(Items.ROTTEN_FLESH),
                    RecipeCategory.MISC,
                    Items.LEATHER,
                    0.7F, 100
                )
                    .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                    .save(output, TestMod.id("campfire_rotten_flesh_to_leather").toString());
            }
        };
    }
}
