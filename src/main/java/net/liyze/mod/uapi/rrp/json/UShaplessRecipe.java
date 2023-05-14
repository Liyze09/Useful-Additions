package net.liyze.mod.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mod.uapi.ub.UB;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class UShaplessRecipe implements UJson {
    JsonArray ingredients = new JsonArray();
    JsonArray optional_ingredients = new JsonArray();
    JsonObject result = new JsonObject();

    @Override
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
        ats(count, optional_ingredients, i.getNamespace());
    }

    public void addOptionalIngredint(@NotNull Identifier id) {
        optional_ingredients.add(id.toString());
    }

    public void addOptionalIngredint(@NotNull Identifier id, int count) {
        ats(count, optional_ingredients, id.toString());
    }

    public void addOptionalIngredint(@NotNull Item item) {
        optional_ingredients.add(Registry.ITEM.getId(item).toString());
    }

    public void addOptionIngredint(@NotNull Item item, int count) {
        ats(count, optional_ingredients, Registry.ITEM.getId(item).toString());
    }

    //Ingredints
    public void addIngredint(@NotNull UB i) {
        ingredients.add(i.getNamespace());
    }

    public void addIngredint(@NotNull UB i, int count) {
        ats(count, ingredients, i.getNamespace());
    }

    public void addIngredint(@NotNull Identifier id) {
        ingredients.add(id.toString());
    }

    public void addIngredint(@NotNull Identifier id, int count) {
        ats(count, ingredients, id.toString());
    }

    public void addIngredint(@NotNull Item item) {
        ingredients.add(Registry.ITEM.getId(item).toString());
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

    public void addResult(@NotNull Item item) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
    }

    public void addResult(@NotNull Item item, int count) {
        result.addProperty("item", Registry.ITEM.getId(item).toString());
        result.addProperty("count", count);
    }

    private static void ats(int a, JsonArray b, String c) {
        for (int i = 0; i < a; ++i) {
            b.add(c);
        }
    }
}
