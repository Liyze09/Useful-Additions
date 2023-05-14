package net.liyze.mod.uapi.rrp;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourceType;

import java.util.List;
import java.util.function.Function;

public interface SidedRRPCallback {
    Function<SidedRRPCallback[], SidedRRPCallback> CALLBACK_FUNCTION = callbacks -> (type, resourcePacks) -> {
        for (SidedRRPCallback callback : callbacks) {
            callback.insert(type, resourcePacks);
        }
    };
    Event<SidedRRPCallback> ADD_PACK = EventFactory.createArrayBacked(SidedRRPCallback.class, CALLBACK_FUNCTION);

    void insert(ResourceType type, List<ResourcePack> resources);
}