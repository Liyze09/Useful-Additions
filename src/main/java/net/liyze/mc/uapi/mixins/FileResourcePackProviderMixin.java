package net.liyze.mc.uapi.mixins;

import com.google.common.base.Suppliers;
import net.liyze.mc.uapi.rrp.RRPCallback;
import net.minecraft.resource.FileResourcePackProvider;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourcePackProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pers.solid.brrp.v1.api.RuntimeResourcePack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static net.liyze.mc.usefuladditions.UsefulAdditions.LOGGER;

@Mixin(FileResourcePackProvider.class)
public class FileResourcePackProviderMixin {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    @Inject(method = "register", at = @At("HEAD"))
    public void register(Consumer<ResourcePackProfile> profileAdder, ResourcePackProfile.Factory factory, CallbackInfo ci) {
        List<ResourcePack> list = new ArrayList<>();
        RRPCallback.ADD_PACK.invoker().insert(list);
        for (ResourcePack pack : list) {
            profileAdder.accept(ResourcePackProfile.of(
                    pack.getName(),
                    false,
                    Suppliers.ofInstance(pack),
                    factory,
                    ResourcePackProfile.InsertionPosition.TOP,
                    RuntimeResourcePack.RUNTIME
            ));
        }
        LOGGER.info("UAPI RRPs registerd");
    }
}