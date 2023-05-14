package net.liyze.mod.uapi.rrp.json;

import java.nio.charset.StandardCharsets;

public class USpecialRecipe extends URecipe {
    public String type;

    public byte[] build() {
        json.addProperty("type", type);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public void setType(String type) {
        this.type = type;
    }
}
