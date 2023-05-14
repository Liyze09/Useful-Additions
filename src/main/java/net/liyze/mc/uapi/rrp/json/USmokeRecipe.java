package net.liyze.mc.uapi.rrp.json;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class USmokeRecipe extends UCookingRecipe {
    public String type = "smoking";

    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("experience", exp);
        json.addProperty("group", group);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}
