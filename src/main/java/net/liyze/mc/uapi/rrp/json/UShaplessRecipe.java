package net.liyze.mc.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mc.uapi.ub.UB;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class UShaplessRecipe extends URecipe {
    JsonArray ingredients = new JsonArray();
    JsonArray optional_ingredients = new JsonArray();
    JsonObject result = new JsonObject();
    String type = "crafting_shapless";

    @Override
    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("group", group);
        ingredients.add(optional_ingredients);
        json.add("ingredients", ingredients);
        json.add("result", result);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    //Optional Ingredints
    public UShaplessRecipe addOptionalIngredint(@NotNull UB i) {
        optional_ingredients.add(i.getNamespace());
        return this;
    }

    public UShaplessRecipe addOptionalIngredint(@NotNull UB i, int count) {
        ats(count, optional_ingredients, i.getNamespace());
        return this;
    }

    public UShaplessRecipe addOptionalIngredint(@NotNull Identifier id) {
        optional_ingredients.add(id.toString());
        return this;
    }

    public UShaplessRecipe addOptionalIngredint(@NotNull Identifier id, int count) {
        ats(count, optional_ingredients, id.toString());
        return this;
    }

    public UShaplessRecipe addOptionalIngredint(@NotNull Item item) {
        optional_ingredients.add(Registry.ITEM.getId(item).toString());
        return this;
    }

    public UShaplessRecipe addOptionIngredint(@NotNull Item item, int count) {
        ats(count, optional_ingredients, Registry.ITEM.getId(item).toString());
        return this;
    }

    //Ingredints
    public UShaplessRecipe addIngredint(@NotNull UB i) {
        ingredients.add(i.getNamespace());
        return this;
    }

    public UShaplessRecipe addIngredint(@NotNull UB i, int count) {
        ats(count, ingredients, i.getNamespace());
        return this;
    }

    public UShaplessRecipe addIngredint(@NotNull Identifier id) {
        ingredients.add(id.toString());
        return this;
    }

    public UShaplessRecipe addIngredint(@NotNull Identifier id, int count) {
        ats(count, ingredients, id.toString());
        return this;
    }

    public UShaplessRecipe addIngredint(@NotNull Item item) {
        ingredients.add(Registry.ITEM.getId(item).toString());
        return this;
    }

    //Result
    public UShaplessRecipe addResult(@NotNull UB i, int count) {
        result.addProperty("item", i.getNamespace());
        result.addProperty("count", count);
        return this;
    }

    public UShaplessRecipe addResult(@NotNull UB i) {
        result.addProperty("item", i.getNamespace());
        result.addProperty("count", 1);
        return this;
    }

    public UShaplessRecipe addResult(@NotNull Identifier id, int count) {
        result.addProperty("item", id.toString());
        result.addProperty("count", count);
        return this;
    }

    public UShaplessRecipe addResult(@NotNull Identifier id) {
        result.addProperty("item", id.toString());
        result.addProperty("count", 1);
        return this;
    }

    public UShaplessRecipe addResult(@NotNull Item item) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
        return this;
    }

    public UShaplessRecipe addResult(@NotNull Item item, int count) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
        result.addProperty("count", count);
        return this;
    }

    private static void ats(int a, JsonArray b, String c) {
        for (int i = 0; i < a; ++i) {
            b.add(c);
        }
    }
}
