package net.liyze.mod.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.liyze.mod.uapi.ub.UB;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

public class UTag {
    JsonObject json = new JsonObject();
    JsonArray included = new JsonArray();

    public byte[] build() {
        json.addProperty("replace", false);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public void add(@NotNull UB i) {
        included.add(i.getNamespace());
    }

    public void add(@NotNull Identifier identifier) {
        included.add(identifier.toString());
    }
}
