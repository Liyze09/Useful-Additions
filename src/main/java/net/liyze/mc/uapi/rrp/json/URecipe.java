package net.liyze.mc.uapi.rrp.json;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public abstract class URecipe implements UJson {
    String group;
    String type;

    public URecipe setGroup(String group) {
        this.group = group;
        return this;
    }

    @Override
    public byte[] build() {
        json.addProperty("type", type);
        json.addProperty("group", group);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}
