package net.liyze.mc.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mc.uapi.ub.UB;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class UTag implements UJson {
    JsonObject json = new JsonObject();
    JsonArray included = new JsonArray();
    boolean replace;

    @Override
    public byte[] build() {
        json.addProperty("replace", replace);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public void add(@NotNull UB i) {
        included.add(i.getNamespace());
    }

    public void add(@NotNull Identifier identifier) {
        included.add(identifier.toString());
    }

    public void add(@NotNull Item item) {
        included.add(Registry.ITEM.getId(item).toString());
    }

    public void add(@NotNull Block block) {
        included.add(Registry.BLOCK.getId(block).toString());
    }

    public void add(@NotNull Fluid fluid) {
        included.add(Registry.FLUID.getId(fluid).toString());
    }

    public void add(@NotNull EntityType<?> entity) {
        included.add(Registry.ENTITY_TYPE.getId(entity).toString());
    }

    public void replace() {
        replace = true;
    }
}
