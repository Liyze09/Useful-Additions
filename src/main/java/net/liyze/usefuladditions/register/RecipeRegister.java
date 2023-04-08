package net.liyze.usefuladditions.register;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.util.RecipeLoad.createShapedRecipeJson;

public class RecipeRegister {

    public static void registerRecipes(){
        if(CONFIG.isEnableCopperTools()){
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
                new Identifier("useful_additions:copper_pickaxe"),1
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
                new Identifier("useful_additions:copper_sword"),1
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
                    new Identifier("useful_additions:copper_axe"),1
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
                    new Identifier("useful_additions:copper_hoe"),1
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
                    new Identifier("useful_additions:copper_shovel"),1
            );
        }if(CONFIG.isEnableIceTools()){
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
                    new Identifier("useful_additions:ice_pickaxe"),1
            );
            ICE_SWORD_RECIPE = createShapedRecipeJson(
                    Lists.newArrayList(
                            '#',
                            '|'
                    ),
                    Lists.newArrayList(new Identifier("c", "copper_ingots"), new Identifier("stick")),
                    Lists.newArrayList("item", "item"),
                    Lists.newArrayList(
                            "#",
                            "#",
                            "|"
                    ),
                    new Identifier("useful_additions:ice_sword"),1
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
                    new Identifier("useful_additions:ice_axe"),1
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
                    new Identifier("useful_additions:ice_hoe"),1
            );
            ICE_SHOVEL_RECIPE = createShapedRecipeJson(
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
                    new Identifier("useful_additions:ice_shovel"),1
            );
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
}
