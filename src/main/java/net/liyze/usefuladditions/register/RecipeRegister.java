package net.liyze.usefuladditions.register;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;
import static net.liyze.usefuladditions.util.RecipeLoad.*;

public class RecipeRegister {

    public static void registerRecipes() {
        if (CONFIG.isEnableCopperTools()) {
            COPPER_PICKAXE_RECIPE = createShapedRecipeJson(Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("tag", "item"),
                    Lists.newArrayList(
                            "###",
                            " | ",
                            " | "
                    ),
                    new Identifier(ID, "copper_pickaxe"), 1
            );
            COPPER_SWORD_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("tag", "item"),
                    Lists.newArrayList(
                            "#",
                            "#",
                            "|"
                    ),
                    new Identifier(ID, "copper_sword"), 1
            );
            COPPER_AXE_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("tag", "item"),
                    Lists.newArrayList(
                            "##",
                            "#|",
                            " |"
                    ),
                    new Identifier(ID, "copper_axe"), 1
            );
            COPPER_HOE_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("tag", "item"),
                    Lists.newArrayList(
                            "##",
                            " |",
                            " |"
                    ),
                    new Identifier(ID, "copper_hoe"), 1
            );
            COPPER_SHOVEL_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("tag", "item"),
                    Lists.newArrayList(
                            "#",
                            "|",
                            "|"
                    ),
                    new Identifier(ID, "copper_shovel"), 1
            );
        }
        if (CONFIG.isEnableIceTools()) {
            ICE_PICKAXE_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("ice"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "###",
                            " | ",
                            " | "
                    ),
                    new Identifier(ID, "ice_pickaxe"), 1
            );
            ICE_SWORD_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("ice"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "#",
                            "#",
                            "|"
                    ),
                    new Identifier(ID, "ice_sword"), 1
            );
            ICE_AXE_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("ice"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "##",
                            "#|",
                            " |"
                    ),
                    new Identifier(ID, "ice_axe"), 1
            );
            ICE_HOE_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("ice"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "##",
                            " |",
                            " |"
                    ),
                    new Identifier(ID, "ice_hoe"), 1
            );
            ICE_SHOVEL_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("ice"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "#",
                            "|",
                            "|"
                    ),
                    new Identifier("useful_additions", "ice_shovel"), 1
            );
            if (CONFIG.isEnableMiniIngots()) {
                MINI_GOLD_INGOT_RECIPE = createShapelessRecipeJson(
                        Lists.newArrayList(
                                new Identifier("minecraft", "gold_nugget"),
                                new Identifier("minecraft", "gold_nugget"),
                                new Identifier("minecraft", "gold_nugget")
                        ),
                        Lists.newArrayList("item", "item", "item"),
                        new Identifier(ID, "mini_gold_ingot"), 1
                );
                MINI_IRON_INGOT_RECIPE = createShapelessRecipeJson(
                        Lists.newArrayList(
                                new Identifier("minecraft", "iron_nugget"),
                                new Identifier("minecraft", "iron_nugget"),
                                new Identifier("minecraft", "iron_nugget")
                        ),
                        Lists.newArrayList("item", "item", "item"),
                        new Identifier(ID, "mini_iron_ingot"), 1
                );
                MINI_LAPIS_BLOCK_RECIPE = createShapelessRecipeJson(
                        Lists.newArrayList(
                                new Identifier("minecraft", "lapis_lazuli"),
                                new Identifier("minecraft", "lapis_lazuli"),
                                new Identifier("minecraft", "lapis_lazuli")
                        ),
                        Lists.newArrayList("item", "item", "item"),
                        new Identifier(ID, "mini_lapis_block"), 1
                );
                MINI_REDSTONE_BLOCK_RECIPE = createShapelessRecipeJson(
                        Lists.newArrayList(
                                new Identifier("minecraft", "redstone"),
                                new Identifier("minecraft", "redstone"),
                                new Identifier("minecraft", "redstone")
                        ),
                        Lists.newArrayList("item", "item", "item"),
                        new Identifier(ID, "mini_redstone_block"), 1
                );

                GOLD_INGOT_A_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_gold_ingot")),
                        Lists.newArrayList(9),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "gold_ingot"), 3
                );
                GOLD_INGOT_B_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_gold_ingot")),
                        Lists.newArrayList(6),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "gold_ingot"), 2
                );

                IRON_INGOT_A_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_iron_ingot")),
                        Lists.newArrayList(9),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "iron_ingot"), 3
                );
                IRON_INGOT_B_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_iron_ingot")),
                        Lists.newArrayList(6),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "iron_ingot"), 2
                );

                REDSTONE_BLOCK_A_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_lapis_block")),
                        Lists.newArrayList(9),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "lapis_block"), 3
                );
                REDSTONE_BLOCK_B_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_redstone_block")),
                        Lists.newArrayList(6),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "redstone_block"), 2
                );
                LAPIS_BLOCK_A_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_lapis_block")),
                        Lists.newArrayList(9),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "lapis_block"), 3
                );
                LAPIS_BLOCK_B_RECIPE = createStackRecipeJson(
                        Lists.newArrayList(
                                new Identifier(ID, "mini_lapis_block")
                        ),
                        Lists.newArrayList(6),
                        Lists.newArrayList("item"),
                        new Identifier("minecraft", "lapis_block"), 2
                );
            }
        }
    }

    public static JsonObject COPPER_PICKAXE_RECIPE = null;
    public static JsonObject COPPER_AXE_RECIPE = null;
    public static JsonObject COPPER_SWORD_RECIPE = null;
    public static JsonObject COPPER_HOE_RECIPE = null;
    public static JsonObject COPPER_SHOVEL_RECIPE = null;
    public static JsonObject ICE_PICKAXE_RECIPE = null;
    public static JsonObject ICE_SWORD_RECIPE = null;
    public static JsonObject ICE_AXE_RECIPE = null;
    public static JsonObject ICE_HOE_RECIPE = null;
    public static JsonObject ICE_SHOVEL_RECIPE = null;
    public static JsonObject MINI_GOLD_INGOT_RECIPE = null;
    public static JsonObject MINI_IRON_INGOT_RECIPE = null;
    public static JsonObject MINI_LAPIS_BLOCK_RECIPE = null;
    public static JsonObject MINI_REDSTONE_BLOCK_RECIPE = null;
    public static JsonObject GOLD_INGOT_A_RECIPE = null;
    public static JsonObject GOLD_INGOT_B_RECIPE = null;
    public static JsonObject IRON_INGOT_A_RECIPE = null;
    public static JsonObject IRON_INGOT_B_RECIPE = null;
    public static JsonObject LAPIS_BLOCK_A_RECIPE = null;
    public static JsonObject LAPIS_BLOCK_B_RECIPE = null;
    public static JsonObject REDSTONE_BLOCK_A_RECIPE = null;
    public static JsonObject REDSTONE_BLOCK_B_RECIPE = null;
}
