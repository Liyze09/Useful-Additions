package net.liyze.mc.uapi.rrp.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class ULootTable implements UJson {
    String type = "minecraft:generic";
    JsonArray pools = new JsonArray();

    public ULootTable setType(String type) {
        this.type = type;
        return this;
    }

    public ULootTable addPool(Pool pool) {
        pools.add(pool.toJson());
        return this;
    }

    @Override
    public byte[] build() {
        json.add("pools", pools);
        return json.toString().getBytes(StandardCharsets.UTF_8);
    }
}

class Pool {
    JsonObject pool = new JsonObject();
    JsonArray conditions = new JsonArray();
    JsonArray entries = new JsonArray();
    int roll = 1;
    float bonus_roll = 0.0F;

    public JsonObject toJson() {
        return this.pool;
    }

    public Pool setRoll(int roll, float bonus_roll) {
        this.roll = roll;
        this.bonus_roll = bonus_roll;
        return this;
    }

    public Pool addEntry(String type, Identifier name) {
        JsonObject object = new JsonObject();
        object.addProperty("type", type);
        object.addProperty("name", name.toString());
        this.entries.add(object);
        return this;
    }
}
