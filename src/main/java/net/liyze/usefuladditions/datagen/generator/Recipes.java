package net.liyze.usefuladditions.datagen.generator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;

import java.util.function.Consumer;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.item.ItemsConfiguration.*;
import static net.minecraft.item.Items.*;

public class Recipes extends FabricRecipeProvider {
    public Recipes(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        if (CONFIG.isEnableMiniIngots()) {
            ShapelessRecipeJsonBuilder.create(MINI_GOLD_INGOT).input(GOLD_NUGGET, 3).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(MINI_IRON_INGOT).input(IRON_NUGGET, 3).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(MINI_LAPIS_BLOCK).input(LAPIS_LAZULI, 3).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(MINI_REDSTONE_BLOCK).input(REDSTONE, 3).offerTo(exporter);

            ShapelessRecipeJsonBuilder.create(GOLD_INGOT,3).input(MINI_GOLD_INGOT, 9).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(IRON_INGOT,3).input(MINI_IRON_INGOT, 9).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(LAPIS_BLOCK,3).input(MINI_LAPIS_BLOCK, 9).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(REDSTONE_BLOCK,3).input(MINI_REDSTONE_BLOCK, 9).offerTo(exporter);

            ShapelessRecipeJsonBuilder.create(GOLD_INGOT,2).input(MINI_GOLD_INGOT, 6).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(IRON_INGOT,2).input(MINI_IRON_INGOT, 6).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(LAPIS_BLOCK,2).input(MINI_LAPIS_BLOCK, 6).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(REDSTONE_BLOCK,2).input(MINI_REDSTONE_BLOCK, 6).offerTo(exporter);
        }
    }
}
