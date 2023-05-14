package net.liyze.mod.uapi.rrp.json;

import com.google.gson.JsonObject;

import java.nio.charset.StandardCharsets;

public interface UJson {
    JsonObject json = new JsonObject();

    @SuppressWarnings("unused")
    default byte[] build() {
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}
