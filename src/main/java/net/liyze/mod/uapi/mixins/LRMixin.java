package net.liyze.mod.uapi.mixins;

import net.liyze.mod.uapi.rrp.RRP;
import net.minecraft.resource.LifecycledResourceManagerImpl;
import net.minecraft.resource.ResourcePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.List;

@Mixin(LifecycledResourceManagerImpl.class)
public abstract class LRMixin {
    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static List<ResourcePack> registerARRPs(List<ResourcePack> packs) {
        packs.addAll(RRP.rrps);
        return packs;
    }
}
