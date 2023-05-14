package net.liyze.mc.uapi.rrp.json;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class UBlastRecipe extends UCookingRecipe {
    public String type = "blasting";

    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("experience", exp);
        json.addProperty("group", group);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}
