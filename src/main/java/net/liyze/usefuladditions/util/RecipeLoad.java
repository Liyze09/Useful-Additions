package net.liyze.usefuladditions.util;

import com.google.gson.*;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class RecipeLoad {
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
        //创建新的json对象，我们在其中保存配方。
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
            individualKey.addProperty(type.get(i), items.get(i).toString()); //这会以 "type":"input"的形式创建键，其中type是"item"或者"tag"，input是输入的物品。
            keyList.add(String.valueOf(keys.get(i)), individualKey); //然后将这个键添加到主要的键对象。
        }
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", 1);
        json.add("result", result);

        return json;
    }
}
