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

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;
import static net.liyze.usefuladditions.item.RecipeConfigure.*;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {
    @Inject(method = "apply*", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        if (CONFIG.isEnableCopperTools()) {
            map.put(new Identifier(ID, "copper_pickaxe"), COPPER_PICKAXE_RECIPE);
            map.put(new Identifier(ID, "copper_hoe"), COPPER_HOE_RECIPE);
            map.put(new Identifier(ID, "copper_shovel"), COPPER_SHOVEL_RECIPE);
            map.put(new Identifier(ID, "copper_axe"), COPPER_AXE_RECIPE);
            map.put(new Identifier(ID, "copper_sword"), COPPER_SWORD_RECIPE);
        }
        if (CONFIG.isEnableIceTools()) {
            map.put(new Identifier(ID, "ice_pickaxe"), ICE_PICKAXE_RECIPE);
            map.put(new Identifier(ID, "ice_axe"), ICE_AXE_RECIPE);
            map.put(new Identifier(ID, "ice_hoe"), ICE_HOE_RECIPE);
            map.put(new Identifier(ID, "ice_shovel"), ICE_SHOVEL_RECIPE);
            map.put(new Identifier(ID, "ice_sword"), ICE_SWORD_RECIPE);
        }
        if (CONFIG.isEnableMiniIngots()) {
            map.put(new Identifier(ID, "mini_gold_ingot"), MINI_GOLD_INGOT_RECIPE);
            map.put(new Identifier(ID, "mini_iron_ingot"), MINI_IRON_INGOT_RECIPE);
            map.put(new Identifier(ID, "mini_lapis_block"), MINI_LAPIS_BLOCK_RECIPE);
            map.put(new Identifier(ID, "mini_redstone_block"), MINI_REDSTONE_BLOCK_RECIPE);
            map.put(new Identifier(ID, "gold_ingot_a"), GOLD_INGOT_A_RECIPE);
            map.put(new Identifier(ID, "gold_ingot_b"), GOLD_INGOT_B_RECIPE);
            map.put(new Identifier(ID, "iron_ingot_a"), IRON_INGOT_A_RECIPE);
            map.put(new Identifier(ID, "iron_ingot_b"), IRON_INGOT_B_RECIPE);
            map.put(new Identifier(ID, "lapis_block_a"), LAPIS_BLOCK_A_RECIPE);
            map.put(new Identifier(ID, "lapis_block_b"), LAPIS_BLOCK_B_RECIPE);
            map.put(new Identifier(ID, "redstone_block_a"), REDSTONE_BLOCK_A_RECIPE);
            map.put(new Identifier(ID, "redstone_block_b"), REDSTONE_BLOCK_B_RECIPE);
        }
        if (CONFIG.isEnableQuartzite()) {
            map.put(new Identifier(ID, "quartzite"), QUARTZITE_SCRAP_RECIPE);
        }
    }
}