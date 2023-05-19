package net.liyze.mc.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mc.uapi.ub.UB;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.util.List;

@SuppressWarnings("unused")
public class UShapedRecipe extends URecipe {
    JsonArray pattern = new JsonArray(3);
    JsonObject keys = new JsonObject();
    JsonObject result = new JsonObject();
    String type = "crafting_shaped";

    @Override
    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("group", group);
        json.add("pattern", pattern);
        json.add("key", keys);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public UShapedRecipe setPattern(String line1, String line2, String line3) {
        pattern.add(line1);
        pattern.add(line2);
        pattern.add(line3);
        json.add("pattern", pattern);
        return this;
    }

    public UShapedRecipe addKey(String key, @NotNull UB i) {
        JsonArray aKey = new JsonArray();
        aKey.add(i.getNamespace());
        keys.add("key", aKey);
        return this;
    }

    public UShapedRecipe addKey(String key, Item i) {
        JsonArray aKey = new JsonArray();
        aKey.add(Registry.ITEM.getId(i).toString());
        keys.add("key", aKey);
        return this;
    }

    public UShapedRecipe addKey(String key, @NotNull List<Item> items) {
        JsonArray keys = new JsonArray();
        for (Item item : items) {
            keys.add(Registry.ITEM.getId(item).toString());
        }
        return this;
    }

    public UShapedRecipe addKey(String key, @NotNull Identifier i) {
        JsonArray aKey = new JsonArray();
        aKey.add(i.toString());
        keys.add("key", aKey);
        return this;
    }

    public UShapedRecipe addResult(@NotNull Identifier item, int count) {
        result.addProperty("item", item.toString());
        result.addProperty("count", count);
        return this;
    }

    public UShapedRecipe addResult(@NotNull UB i, int count) {
        result.addProperty("item", i.getNamespace());
        result.addProperty("count", count);
        return this;
    }

    public UShapedRecipe addResult(Item item, int count) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
        result.addProperty("count", count);
        return this;
    }

    public UShapedRecipe addResult(@NotNull Identifier item) {
        result.addProperty("item", item.toString());
        return this;
    }

    public UShapedRecipe addResult(@NotNull UB i) {
        result.addProperty("item", i.getNamespace());
        return this;
    }

    public UShapedRecipe addResult(Item item) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
        return this;
    }
}