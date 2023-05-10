package net.liyze.mod.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mod.uapi.ub.UB;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

public class UShaplessRecipe {
    JsonObject json = new JsonObject();
    JsonArray ingredients = new JsonArray(9);
    JsonArray optional_ingredients = new JsonArray();
    JsonObject result = new JsonObject();

    public byte[] build() {
        ingredients.add(optional_ingredients);
        json.add("ingredients", ingredients);
        json.add("result", result);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    //Optional Ingredints
    public void addOptionalIngredint(@NotNull UB i) {
        optional_ingredients.add(i.getNamespace());
    }

    public void addOptionalIngredint(@NotNull UB i, int count) {
        for (int j = 0; j < count; j++) optional_ingredients.add(i.getNamespace());
    }

    public void addOptionalIngredint(@NotNull Identifier id) {
        optional_ingredients.add(id.toString());
    }

    public void addOptionalIngredint(@NotNull Identifier id, int count) {
        for (int j = 0; j < count; j++) optional_ingredients.add(id.toString());
    }

    //Ingredints
    public void addIngredint(@NotNull UB i) {
        ingredients.add(i.getNamespace());
    }

    public void addIngredint(@NotNull UB i, int count) {
        for (int j = 0; j < count; j++) ingredients.add(i.getNamespace());
    }

    public void addIngredint(@NotNull Identifier id) {
        ingredients.add(id.toString());
    }

    public void addIngredint(@NotNull Identifier id, int count) {
        for (int j = 0; j < count; j++) ingredients.add(id.toString());
    }

    //Result
    public void addResult(@NotNull UB i, int count) {
        result.addProperty("item", i.getNamespace());
        result.addProperty("count", count);
    }

    public void addResult(@NotNull UB i) {
        result.addProperty("item", i.getNamespace());
        result.addProperty("count", 1);
    }

    public void addResult(@NotNull Identifier id, int count) {
        result.addProperty("item", id.toString());
        result.addProperty("count", count);
    }

    public void addResult(@NotNull Identifier id) {
        result.addProperty("item", id.toString());
        result.addProperty("count", 1);
    }
}
