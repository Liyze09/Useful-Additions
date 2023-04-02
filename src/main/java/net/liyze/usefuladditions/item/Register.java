package net.liyze.usefuladditions.item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;
import static net.liyze.usefuladditions.item.Items.*;

public class Register {
    public static void registerItems() {
        if (CONFIG.isEnableMiniIngots()) {
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_gold_ingot"), MINI_GOLD_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_iron_ingot"), MINI_IRON_INGOT);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_redstone_block"), MINI_REDSTONE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier(ID, "mini_lapis_lazuli_block"), MINI_LAPIS_LAZULI_BLOCK);
        }
        if (CONFIG.isEnableCopperTools()) {
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_pickaxe"), COPPER_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_sword"), COPPER_SWORD);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_axe"), COPPER_AXE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_hoe"), COPPER_HOE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_shovel"), COPPER_SHOVEL);
        }
        if (CONFIG.isEnableCopperArmors()) {
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_helmet"), COPPER_HELMET);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_chestplate"), COPPER_CHESTPLATE);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_leggings"), COPPER_LEGGINGS);
            Registry.register(Registry.ITEM, new Identifier(ID, "copper_boots"), COPPER_BOOTS);
        }
    }
}
