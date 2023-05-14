package net.liyze.mod.uapi.rrp.json;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class USmeltRecipe extends UCookingRecipe {
    public String type = "smelting";

    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("experience", exp);
        json.addProperty("group", group);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}