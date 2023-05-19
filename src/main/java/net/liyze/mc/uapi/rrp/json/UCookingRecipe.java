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
public abstract class UCookingRecipe extends URecipe {
    float exp = 0.5F;

    @Override
    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("experience", exp);
        json.addProperty("group", group);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public UCookingRecipe addIngredient(@NotNull UB i) {
        JsonObject object = new JsonObject();
        object.addProperty("item", i.getNamespace());
        json.add("ingredient", object);
        return this;
    }

    public UCookingRecipe addIngredient(Item item) {
        JsonObject object = new JsonObject();
        object.addProperty("item", Registry.ITEM.getId(item).toString());
        json.add("ingredient", object);
        return this;
    }

    public UCookingRecipe addIngredient(@NotNull Identifier id) {
        JsonObject object = new JsonObject();
        object.addProperty("item", id.toString());
        json.add("ingredient", object);
        return this;
    }

    public UCookingRecipe addIngredient(List<Item> items) {
        JsonArray array = new JsonArray();
        for (Item i : items) {
            array.add(Registry.ITEM.getId(i).toString());
        }
        json.add("ingredient", array);
        return this;
    }

    public UCookingRecipe addResult(UB i) {
        json.addProperty("result", i.getNamespace());
        return this;
    }

    public UCookingRecipe addResult(Item item) {
        json.addProperty("result", Registry.ITEM.getId(item).toString());
        return this;
    }

    public UCookingRecipe addResult(Identifier id) {
        json.addProperty("result", id.toString());
        return this;
    }

    public UCookingRecipe setExp(float exp) {
        this.exp = exp;
        return this;
    }

    public UCookingRecipe setTime(int time) {
        json.addProperty("cookingtime", time);
        return this;
    }
}
