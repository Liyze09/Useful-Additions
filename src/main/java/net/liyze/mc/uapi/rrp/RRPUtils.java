package net.liyze.mc.uapi.rrp;

import net.liyze.mc.uapi.rrp.json.UItemModel;
import net.liyze.mc.uapi.rrp.json.ULootTable;
import net.liyze.mc.uapi.rrp.json.URecipe;
import net.liyze.mc.uapi.rrp.json.UTag;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class RRPUtils {
    public static RRP rrp = RRP.create(10, new Identifier("uapi", "pack"));

    public static void addRecipe(@NotNull URecipe recipe, String name) {
        rrp.addData(new Identifier(rrp.identifier.getNamespace(), "recipes" + fix(name)), recipe.build());
    }

    public static void addModel(@NotNull UItemModel model, String name) {
        rrp.addAsset(new Identifier(rrp.identifier.getNamespace(), "models/item" + fix(name)), model.build());
    }

    public static void addTag(@NotNull UTag tag, String name, String type) {
        rrp.addData(new Identifier(rrp.identifier.getNamespace(), "tags/" + type + "/" + fix(name)), tag.build());
    }

    public static void addLoot(@NotNull ULootTable lootTable, String name, String type) {
        rrp.addData(new Identifier(rrp.identifier.getNamespace(), "loot_tables/" + type + "/" + fix(name)), lootTable.build());
    }

    @Contract(pure = true)
    private static @NotNull String fix(String name) {
        return name + ".json";
    }

}
