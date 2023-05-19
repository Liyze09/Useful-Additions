package net.liyze.mc.uapi.rrp.json;

import com.google.gson.JsonObject;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class UItemModel implements UJson {
    String parent = "item/generated";
    JsonObject texture = new JsonObject();

    public byte[] build() {
        json.addProperty("parent", parent);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }

    public UItemModel addTexture(String path) {
        texture.addProperty("layer0", path);
        return this;
    }

    public UItemModel setParent(String parent) {
        this.parent = parent;
        return this;
    }
}
