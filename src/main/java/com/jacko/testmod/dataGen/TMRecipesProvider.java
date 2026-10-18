package com.jacko.testmod.dataGen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.jacko.testmod.block.TMBlocks;
import com.jacko.testmod.item.TMItems;
import com.jacko.testmod.tags.TMItemTags;
import com.jacko.testmod.TMCommon;

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

public class TMRecipesProvider extends FabricRecipeProvider {
    public TMRecipesProvider(FabricPackOutput output, CompletableFuture<Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<ItemLike> ICE_ETHER_LIST = List.of(
        TMItems.RAW_ICE_ETHER,
        TMBlocks.ICE_ETHER_ORE,
        TMBlocks.DEEPSLATE_ICE_ETHER_ORE
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
                nineBlockStorageRecipes(RecipeCategory.MISC, TMItems.RAW_ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, TMBlocks.RAW_ICE_ETHER_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, TMItems.ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_BLOCK);

				// Shapeless
                shapeless(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_ORE)
                    .requires(TMItems.RAW_ICE_ETHER)
                    .requires(Items.STONE)
                    .unlockedBy(getHasName(TMItems.RAW_ICE_ETHER), has(TMItems.RAW_ICE_ETHER))
                    .save(output);
				shapeless(RecipeCategory.REDSTONE, TMBlocks.ICE_ETHER_BUTTON)
                    .requires(TMItems.ICE_ETHER)
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                
				// Shaped
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_STAIRS, 4)
                    .define('#', TMBlocks.ICE_ETHER_BLOCK)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .unlockedBy(getHasName(TMBlocks.ICE_ETHER_BLOCK), has(TMBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_SLAB, 6)
                    .define('#', TMBlocks.ICE_ETHER_BLOCK)
                    .pattern("###")
                    .unlockedBy(getHasName(TMBlocks.ICE_ETHER_BLOCK), has(TMBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.REDSTONE, TMBlocks.ICE_ETHER_PRESSURE_PLATE, 1)
                    .define('#', TMItems.ICE_ETHER)
                    .pattern("##")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_FENCE, 6)
                    .define('*', TMItems.ICE_ETHER)
                    .define('#', TMBlocks.ICE_ETHER_BLOCK)
                    .pattern("#*#")
                    .pattern("#*#")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .unlockedBy(getHasName(TMBlocks.ICE_ETHER_BLOCK), has(TMBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_FENCE_GATE)
                    .define('*', TMItems.ICE_ETHER)
                    .define('#', TMBlocks.ICE_ETHER_BLOCK)
                    .pattern("*#*")
                    .pattern("*#*")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .unlockedBy(getHasName(TMBlocks.ICE_ETHER_BLOCK), has(TMBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_WALL, 6)
                    .define('#', TMBlocks.ICE_ETHER_BLOCK)
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy(getHasName(TMBlocks.ICE_ETHER_BLOCK), has(TMBlocks.ICE_ETHER_BLOCK))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_DOOR, 3)
                    .define('#', TMItems.ICE_ETHER)
                    .pattern("## ")
                    .pattern("## ")
                    .pattern("## ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, TMBlocks.ICE_ETHER_TRAPDOOR)
                    .define('#', TMItems.ICE_ETHER)
                    .pattern("## ")
                    .pattern("## ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.COMBAT, TMItems.ICE_ETHER_SWORD)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("#")
                    .pattern("#")
                    .pattern("X")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.TOOLS, TMItems.ICE_ETHER_SHOVEL)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("#")
                    .pattern("X")
                    .pattern("X")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.TOOLS, TMItems.ICE_ETHER_PICKAXE)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("###")
                    .pattern(" X ")
                    .pattern(" X ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.TOOLS, TMItems.ICE_ETHER_AXE)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("## ")
                    .pattern("#X ")
                    .pattern(" X ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.TOOLS, TMItems.ICE_ETHER_HOE)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("## ")
                    .pattern(" X ")
                    .pattern(" X ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.TOOLS, TMItems.ICE_ETHER_SPEAR)
                    .define('#', TMItems.ICE_ETHER)
                    .define('X', Items.STICK)
                    .pattern("  #")
                    .pattern(" X ")
                    .pattern("X  ")
                    .unlockedBy(getHasName(TMItems.ICE_ETHER), has(TMItems.ICE_ETHER))
                    .save(output);
                shaped(RecipeCategory.MISC, Items.SUGAR)
                    .define('#', TMItemTags.SUGER)
                    .pattern("###")
                    .unlockedBy("has_Item", has(TMItemTags.SUGER))
                    .save(output);
                
                
                oreSmelting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, TMItems.ICE_ETHER, 0.7F, 200, "ice_ether");
                oreBlasting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, TMItems.ICE_ETHER, 0.7F, 100, "ice_ether");

                // Smoker
                SimpleCookingRecipeBuilder.smoking(
                    Ingredient.of(Items.ROTTEN_FLESH),
                    RecipeCategory.MISC,
                    Items.LEATHER,
                    0.7F, 100
                )
                    .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                    .save(output, TMCommon.id("smoker_rotten_flesh_to_leather").toString());
                
                // Campfire
                SimpleCookingRecipeBuilder.campfireCooking(
                    Ingredient.of(Items.ROTTEN_FLESH),
                    RecipeCategory.MISC,
                    Items.LEATHER,
                    0.7F, 100
                )
                    .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                    .save(output, TMCommon.id("campfire_rotten_flesh_to_leather").toString());
            }
        };
    }
}
