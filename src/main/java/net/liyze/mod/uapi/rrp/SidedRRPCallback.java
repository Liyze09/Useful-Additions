package net.liyze.mod.uapi.rrp;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourceType;
import pers.solid.brrp.v1.RRPEventHelper;

import java.util.List;
import java.util.function.Function;

/**
 * Similar to {@link RRPCallback} but can specify resource types. It is also supported by {@link RRPEventHelper}.
 *
 * @author Deman Kervan
 * @since 0.6.4 of ARRP
 */
public interface SidedRRPCallback {
    Function<SidedRRPCallback[], SidedRRPCallback> CALLBACK_FUNCTION = callbacks -> (type, resourcePacks) -> {
        for (SidedRRPCallback callback : callbacks) {
            callback.insert(type, resourcePacks);
        }
    };
    Event<SidedRRPCallback> ADD_PACK = EventFactory.createArrayBacked(SidedRRPCallback.class, CALLBACK_FUNCTION);

    void insert(ResourceType type, List<ResourcePack> resources);
}