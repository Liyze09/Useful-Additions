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
                new Identifier("useful_additions:copper_pickaxe")
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
                new Identifier("useful_additions:copper_sword")
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
                    new Identifier("useful_additions:copper_axe")
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
                    new Identifier("useful_additions:copper_hoe")
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
                    new Identifier("useful_additions:copper_shovel")
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
                    new Identifier("useful_additions:ice_pickaxe")
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
                    new Identifier("useful_additions:ice_sword")
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
                    new Identifier("useful_additions:ice_axe")
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
                    new Identifier("useful_additions:ice_hoe")
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
                    new Identifier("useful_additions:ice_shovel")
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
