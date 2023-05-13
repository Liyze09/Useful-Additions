package net.liyze.mod.uapi.rrp.json;

import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class ULang {
    JsonObject json = new JsonObject();

    public byte[] build() {
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public void add(String key, String value) {
        json.addProperty(key, value);
    }

    public void add(@NotNull Item item, String name) {
        json.addProperty(item.getTranslationKey(), name);
    }

    public void add(@NotNull Block block, String name) {
        json.addProperty(block.getTranslationKey(), name);
    }

    public void add(@NotNull Enchantment enchantment, String name) {
        json.addProperty(enchantment.getTranslationKey(), name);
    }

    public void add(@NotNull StatusEffect effect, String name) {
        json.addProperty(effect.getTranslationKey(), name);
    }

    public void add(@NotNull EntityType<?> entity, String name) {
        json.addProperty(entity.getTranslationKey(), name);
    }

    public void add(@NotNull EntityAttribute entity, String name) {
        json.addProperty(entity.getTranslationKey(), name);
    }
}
