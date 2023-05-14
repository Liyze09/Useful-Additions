package net.liyze.mc.uapi.rrp;

import net.fabricmc.fabric.api.event.Event;
import net.minecraft.resource.ResourcePack;

import java.util.List;
import java.util.function.Function;

public interface RRPCallback {
    Function<RRPCallback, SidedRRPCallback> FORWARDING_FUNCTION = rrpCallback -> (type, resources) -> rrpCallback.insert(resources);
    Function<SidedRRPCallback, RRPCallback> INVOKER_FUNCTION = sidedRRPCallback -> resources -> sidedRRPCallback.insert(null, resources);
    Event<RRPCallback> ADD_PACK = new ForwardingEvent<>(FORWARDING_FUNCTION, SidedRRPCallback.ADD_PACK, INVOKER_FUNCTION);

    void insert(List<ResourcePack> resources);
}
