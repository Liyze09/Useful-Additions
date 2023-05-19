package net.liyze.mc.uapi.rrp.json;

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
public class ULang implements UJson {
    JsonObject json = new JsonObject();

    @Override
    public byte[] build() {
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public ULang add(String key, String value) {
        json.addProperty(key, value);
        return this;
    }

    public ULang add(@NotNull Item item, String name) {
        json.addProperty(item.getTranslationKey(), name);
        return this;
    }

    public ULang add(@NotNull Block block, String name) {
        json.addProperty(block.getTranslationKey(), name);
        return this;
    }

    public ULang add(@NotNull Enchantment enchantment, String name) {
        json.addProperty(enchantment.getTranslationKey(), name);
        return this;
    }

    public ULang add(@NotNull StatusEffect effect, String name) {
        json.addProperty(effect.getTranslationKey(), name);
        return this;
    }

    public ULang add(@NotNull EntityType<?> entity, String name) {
        json.addProperty(entity.getTranslationKey(), name);
        return this;
    }

    public ULang add(@NotNull EntityAttribute entity, String name) {
        json.addProperty(entity.getTranslationKey(), name);
        return this;
    }
}
