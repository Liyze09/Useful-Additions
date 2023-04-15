package net.liyze.usefuladditions.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

import static net.liyze.usefuladditions.UsefulAdditions.LOGGER;

public class RecipeLoad {
    /* Shaped Crafting Recipes */
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int result_count) {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("type", "minecraft:crafting_shaped");

            JsonArray jsonArray = new JsonArray();
            jsonArray.add(pattern.get(0));
            jsonArray.add(pattern.get(1));
            jsonArray.add(pattern.get(2));
            json.add("pattern", jsonArray);

            JsonObject individualKey;
            JsonObject keyList = new JsonObject();
            for (int i = 0; i < keys.size(); ++i) {
                individualKey = new JsonObject();
                individualKey.addProperty(String.valueOf(type.get(i)), items.get(i).toString());
                keyList.add(String.valueOf(keys.get(i)), individualKey);
            }
            json.add("key", keyList);

            JsonObject result = new JsonObject();
            result.addProperty("item", output.toString());
            result.addProperty("count", result_count);
            json.add("result", result);

            return json;
        } catch (Exception e) {
            LOGGER.error("Failed to inject recipe.");
            e.printStackTrace();
        }
        return null;
    }

    /* Shapeless Crafting Recipes */
    public static JsonObject createShapelessRecipeJson(ArrayList<Identifier> inputs, ArrayList<String> type, Identifier output, int result_count) {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("type", "minecraft:crafting_shapeless");

            JsonArray jsonArray = new JsonArray();
            JsonObject individualItems;
            for (int i = 0; i < inputs.size(); ++i) {
                individualItems = new JsonObject();
                individualItems.addProperty(String.valueOf(type.get(i)), String.valueOf(inputs.get(i)));
                jsonArray.add(individualItems);
            }
            json.add("ingredients", jsonArray);

            JsonObject result = new JsonObject();
            result.addProperty("item", output.toString());
            result.addProperty("count", result_count);
            json.add("result", result);

            return json;
        } catch (Exception e) {
            LOGGER.error("Failed to inject recipe.");
            e.printStackTrace();
        }
        return null;
    }

    public static JsonObject createStackRecipeJson(ArrayList<Identifier> inputs, ArrayList<Integer> count, ArrayList<String> type, Identifier output, int result_count) {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("type", "minecraft:crafting_shapeless");

            JsonArray jsonArray = new JsonArray();
            JsonObject individualItems;
            for (int i = 0; i < inputs.size(); ++i) {
                individualItems = new JsonObject();
                individualItems.addProperty(String.valueOf(type.get(i)), String.valueOf(inputs.get(i)));
                for (int j = 0; j < count.get(i); ++j)
                    jsonArray.add(individualItems);
            }
            json.add("ingredients", jsonArray);

            JsonObject result = new JsonObject();
            result.addProperty("item", output.toString());
            result.addProperty("count", result_count);
            json.add("result", result);

            return json;
        } catch (Exception e) {
            LOGGER.error("Failed to inject recipe.");
            e.printStackTrace();
        }
        return null;
    }
}
