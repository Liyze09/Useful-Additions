package net.liyze.usefuladditions.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

import static net.liyze.usefuladditions.register.RecipeRegister.*;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply*", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        if (COPPER_PICKAXE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "copper_pickaxe"), COPPER_PICKAXE_RECIPE);
        }if (COPPER_HOE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "copper_hoe"), COPPER_HOE_RECIPE);
        }if (COPPER_SHOVEL_RECIPE != null) {
            map.put(new Identifier("useful_additions", "copper_shovel"), COPPER_SHOVEL_RECIPE);
        }if (COPPER_AXE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "copper_axe"), COPPER_AXE_RECIPE);
        }if (COPPER_SWORD_RECIPE != null) {
            map.put(new Identifier("useful_additions", "copper_sword"), COPPER_SWORD_RECIPE);
        }if (ICE_PICKAXE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "ice_pickaxe"), ICE_PICKAXE_RECIPE);
        }if (ICE_AXE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "ice_axe"), ICE_AXE_RECIPE);
        }if (ICE_HOE_RECIPE != null) {
            map.put(new Identifier("useful_additions", "ice_hoe"), ICE_HOE_RECIPE);
        }if (ICE_SHOVEL_RECIPE != null) {
            map.put(new Identifier("useful_additions", "ice_shovel"), ICE_SHOVEL_RECIPE);
        }if (ICE_SWORD_RECIPE != null) {
            map.put(new Identifier("useful_additions", "ice_sword"), ICE_SWORD_RECIPE);
        }
    }

}