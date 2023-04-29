package net.liyze.usefuladditions.resource;

import net.minecraft.util.Identifier;
import pers.solid.brrp.v1.api.LanguageProvider;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.block.BlockItemsConfiguration.QUARTZITE_ITEM;
import static net.liyze.usefuladditions.enchantments.EnchantmentRegister.*;
import static net.liyze.usefuladditions.item.ItemsConfiguration.*;

public abstract class Lang {
    @SuppressWarnings("UnstableApiUsage")
    public static void generateLang() {
        String keyA = "text.autoconfig." + ID + ".option.";
        LanguageProvider enUS = LanguageProvider.create()
                .add(ITEM_GROUP, "Useful Additions")
                .add(keyA + "enableMiniIngots", "Mini Ingots")
                .add(keyA + "enableCopperTools", "Copper Tools")
                .add(keyA + "enableCopperArmors", "Copper Armors")
                .add(keyA + "enableIceTools", "Ice Tools")
                .add(keyA + "enableQuartzite", "Quaritzite")
                .add(keyA + "enableUniqueEnchantment", "UniqueEnchantment");
        if (config.enableMiniIngots)
            enUS
                    .add(MINI_GOLD_INGOT, "Mini Gold Ingot")
                    .add(MINI_IRON_INGOT, "Mini Iron Ingot")
                    .add(MINI_LAPIS_BLOCK, "Mini Lapis Block")
                    .add(MINI_REDSTONE_BLOCK, "Mini Redstone Block");

        if (config.enableCopperTools)
            enUS
                    .add(COPPER_AXE, "Copper Axe")
                    .add(COPPER_HOE, "Copper Hoe")
                    .add(COPPER_SHOVEL, "Copper Shovel")
                    .add(COPPER_SWORD, "Copper Sword")
                    .add(COPPER_PICKAXE, "Copper Pickaxe");

        if (config.enableCopperArmors)
            enUS
                    .add(COPPER_HELMET, "Copper Helmet")
                    .add(COPPER_CHESTPLATE, "Copper Chestplate")
                    .add(COPPER_LEGGINGS, "Copper Leggings")
                    .add(COPPER_BOOTS, "Copper Boots");

        if (config.enableIceTools)
            enUS
                    .add(ICE_AXE, "Ice Axe")
                    .add(ICE_HOE, "Ice Hoe")
                    .add(ICE_PICKAXE, "Ice Pickaxe")
                    .add(ICE_SHOVEL, "Ice Shovel")
                    .add(ICE_SWORD, "Ice Sword");

        if (config.enableQuartzite)
            enUS
                    .add(QUARTZITE_ITEM, "Quartzite")
                    .add(QUARTZITE_SCRAP, "Quartzite Scrap");
        if (config.enableUniqueEnchantment)
            enUS
                    .add(FROST_ENCHANTMENT, "Frost")
                    .add(WITHER_ENCHANTMENT, "Wither")
                    .add(SCULK_ENCHANTMENT, "Sculk");
        pack.addLang(new Identifier(ID, "en_us"), enUS);
    }
}
