package com.nik56mh6.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import com.nik56mh6.datagen.ModRecipeProvider;

import com.nik56mh6.ModItems;
import org.jspecify.annotations.NonNull;


// ---------------------------------------------------------- IF YOU EVER FORGET
// https://docs.fabricmc.net/develop/data-generation/recipes
// ABSURDLY IMPORTANT: IF ONE RECIPE BREAKS THE ONES AFTER IT WONT GENERATE (THE PREVIOUS ONES IF CORRECT YES
// ----------------------------------------------------------


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                shaped(RecipeCategory.MISC, ModItems.GOURD_OF_RETURN, 1)
                        .pattern(" a ")
                        .pattern("bcb")
                        .pattern("aaa")
                        .define('a', ItemTags.PLANKS)
                        .define('b', Items.GOLD_INGOT)
                        .define('c', Items.DIAMOND)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.DRAGON_SWORD, 1)
                        .pattern("aaa")
                        .pattern("ada")
                        .pattern("saa")
                        .define('n', ModItems.VOID_STAR)
                        .define('a', Items.END_CRYSTAL)
                        .define('d', Items.DRAGON_EGG)
                        .define('s', ModItems.VOID_STICK)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .unlockedBy(getHasName(Items.DRAGON_EGG), has(Items.DRAGON_EGG))
                        .unlockedBy(getHasName(Items.END_CRYSTAL), has(Items.END_CRYSTAL))
                        .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                        .unlockedBy(getHasName(ModItems.VOID_STICK), has(ModItems.VOID_STICK))
                        .save(output);
                // recipe for duplication of the dragon egg
                shaped(RecipeCategory.MISC, Items.DRAGON_EGG, 2)
                        .pattern("aaa")
                        .pattern("aba")
                        .pattern("aaa")
                        .define('a', Items.END_CRYSTAL)
                        .define('b', Items.DRAGON_EGG)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .unlockedBy(getHasName(Items.DRAGON_EGG), has(Items.DRAGON_EGG))
                        .save(output);
                shaped(RecipeCategory.MISC, ModItems.VOID_STAR, 1)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .define('a', Items.NETHER_STAR)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                        .save(output);
                shaped(RecipeCategory.MISC, ModItems.VOID_STICK, 1)
                        .pattern(" ll")
                        .pattern("lvl")
                        .pattern("ll")
                        .define('l', ItemTags.LOGS)
                        .define('v', ModItems.VOID_STAR)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .unlockedBy(getHasName(ModItems.VOID_STAR), has(ModItems.VOID_STAR))
                        .save(output);

            }
        };
    }

    @Override
    public @NonNull String getName() {
        return "ModRecipeProvider";
    }
}

