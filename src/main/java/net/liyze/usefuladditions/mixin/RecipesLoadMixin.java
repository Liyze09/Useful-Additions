package net.liyze.usefuladditions.mixin;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ShapedRecipe.class)
public class RecipesLoadMixin {
    /**
     * @author Liyze
     * @reason Disable error output when load recipe
     */
    @Overwrite
    public static Item getItem(JsonObject json) {
        try {
            String string = JsonHelper.getString(json, "item");
            Item item = Registry.ITEM.getOrEmpty(new Identifier(string)).orElseThrow(() -> new JsonSyntaxException(""));
            if (item == Items.AIR) {
                throw new JsonSyntaxException("Invalid item: " + string);
            }
            return item;
        } catch (JsonSyntaxException ignored) {
        }
        return null;
    }
}
