package net.liyze.usefuladditions.register;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.features.CopperArmors.Items.*;
import static net.liyze.usefuladditions.features.CopperTools.Items.*;
import static net.liyze.usefuladditions.features.IceTools.Items.*;
import static net.liyze.usefuladditions.features.MiniIngots.Items.*;
import static net.liyze.usefuladditions.features.Quartzite.Items.QUARTZITE_SCRAP;

public abstract class ItemRegister {
    public static void registerItems() {
        if (cfg.enableMiniIngots) {
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_gold_ingot"), MINI_GOLD_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_iron_ingot"), MINI_IRON_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_redstone_block"), MINI_REDSTONE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_lapis_block"), MINI_LAPIS_BLOCK);
        }
        if (cfg.enableCopperTools) {
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_sword"), COPPER_SWORD);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_shovel"), COPPER_SHOVEL);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_pickaxe"), COPPER_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_axe"), COPPER_AXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_hoe"), COPPER_HOE);
        }
        if (cfg.enableCopperArmors) {
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_helmet"), COPPER_HELMET);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_chestplate"), COPPER_CHESTPLATE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_leggings"), COPPER_LEGGINGS);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_boots"), COPPER_BOOTS);
        }
        if (cfg.enableIceTools) {
            Registry.register(Registry.ITEM, new Identifier(ID, "ice_sword"), ICE_SWORD);
            Registry.register(Registry.ITEM, new Identifier(ID, "ice_shovel"), ICE_SHOVEL);
            Registry.register(Registry.ITEM, new Identifier(ID, "ice_pickaxe"), ICE_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "ice_axe"), ICE_AXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "ice_hoe"), ICE_HOE);
        }
        if (cfg.enableQuartzite) {
            Registry.register(Registry.ITEM, new Identifier(ID, "quartzite_scrap"), QUARTZITE_SCRAP);
        }
    }
}