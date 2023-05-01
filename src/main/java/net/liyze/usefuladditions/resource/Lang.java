package net.liyze.usefuladditions.resource;

import net.minecraft.util.Identifier;
import pers.solid.brrp.v1.api.LanguageProvider;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.features.CopperArmors.Items.*;
import static net.liyze.usefuladditions.features.CopperTools.Items.*;
import static net.liyze.usefuladditions.features.IceTools.Items.*;
import static net.liyze.usefuladditions.features.MiniIngots.Items.*;
import static net.liyze.usefuladditions.features.Quartzite.Blocks.QUARTZITE_BLOCK;
import static net.liyze.usefuladditions.features.Quartzite.Items.QUARTZITE_SCRAP;
import static net.liyze.usefuladditions.register.EnchantmentRegister.*;

abstract class Lang {
    @SuppressWarnings("UnstableApiUsage")
    static void generateLang() {
        String keyA = "text.autoconfig." + ID + ".option.";
        /*English*/
        LanguageProvider enUS = LanguageProvider.create()
                .add(ITEM_GROUP, "Useful Additions")
                .add(keyA + "enableMiniIngots", "Mini Ingots")
                .add(keyA + "enableCopperTools", "Copper Tools")
                .add(keyA + "enableCopperArmors", "Copper Armors")
                .add(keyA + "enableIceTools", "Ice Tools")
                .add(keyA + "enableQuartzite", "Quaritzite")
                .add(keyA + "enableUniqueEnchantment", "UniqueEnchantment")
                .add(keyA + "enableBigOre", "Big Ore");
        if (cfg.enableMiniIngots)
            enUS
                    .add(MINI_GOLD_INGOT, "Mini Gold Ingot")
                    .add(MINI_IRON_INGOT, "Mini Iron Ingot")
                    .add(MINI_LAPIS_BLOCK, "Mini Lapis Block")
                    .add(MINI_REDSTONE_BLOCK, "Mini Redstone Block");

        if (cfg.enableCopperTools)
            enUS
                    .add(COPPER_AXE, "Copper Axe")
                    .add(COPPER_HOE, "Copper Hoe")
                    .add(COPPER_SHOVEL, "Copper Shovel")
                    .add(COPPER_SWORD, "Copper Sword")
                    .add(COPPER_PICKAXE, "Copper Pickaxe");

        if (cfg.enableCopperArmors)
            enUS
                    .add(COPPER_HELMET, "Copper Helmet")
                    .add(COPPER_CHESTPLATE, "Copper Chestplate")
                    .add(COPPER_LEGGINGS, "Copper Leggings")
                    .add(COPPER_BOOTS, "Copper Boots");

        if (cfg.enableIceTools)
            enUS
                    .add(ICE_AXE, "Ice Axe")
                    .add(ICE_HOE, "Ice Hoe")
                    .add(ICE_PICKAXE, "Ice Pickaxe")
                    .add(ICE_SHOVEL, "Ice Shovel")
                    .add(ICE_SWORD, "Ice Sword");

        if (cfg.enableQuartzite)
            enUS
                    .add(QUARTZITE_BLOCK, "Quartzite")
                    .add(QUARTZITE_SCRAP, "Quartzite Scrap");
        if (cfg.enableUniqueEnchantment)
            enUS
                    .add(FROST_ENCHANTMENT, "Frost")
                    .add(WITHER_ENCHANTMENT, "Wither")
                    .add(SCULK_ENCHANTMENT, "Sculk");
        /*Simplified Chinese*/
        LanguageProvider zhCN = LanguageProvider.create()
                .add(ITEM_GROUP, "Useful Additions")
                .add(keyA + "enableMiniIngots", "迷你锭")
                .add(keyA + "enableCopperTools", "铜质工具")
                .add(keyA + "enableCopperArmors", "铜质盔甲")
                .add(keyA + "enableIceTools", "冰制工具")
                .add(keyA + "enableQuartzite", "石英石")
                .add(keyA + "enableUniqueEnchantment", "独特附魔")
                .add(keyA + "enableBigOre", "大型矿群");
        if (cfg.enableMiniIngots)
            enUS
                    .add(MINI_GOLD_INGOT, "Mini Gold Ingot")
                    .add(MINI_IRON_INGOT, "Mini Iron Ingot")
                    .add(MINI_LAPIS_BLOCK, "Mini Lapis Block")
                    .add(MINI_REDSTONE_BLOCK, "Mini Redstone Block");

        if (cfg.enableCopperTools)
            enUS
                    .add(COPPER_AXE, "Copper Axe")
                    .add(COPPER_HOE, "Copper Hoe")
                    .add(COPPER_SHOVEL, "Copper Shovel")
                    .add(COPPER_SWORD, "Copper Sword")
                    .add(COPPER_PICKAXE, "Copper Pickaxe");

        if (cfg.enableCopperArmors)
            enUS
                    .add(COPPER_HELMET, "Copper Helmet")
                    .add(COPPER_CHESTPLATE, "Copper Chestplate")
                    .add(COPPER_LEGGINGS, "Copper Leggings")
                    .add(COPPER_BOOTS, "Copper Boots");

        if (cfg.enableIceTools)
            enUS
                    .add(ICE_AXE, "Ice Axe")
                    .add(ICE_HOE, "Ice Hoe")
                    .add(ICE_PICKAXE, "Ice Pickaxe")
                    .add(ICE_SHOVEL, "Ice Shovel")
                    .add(ICE_SWORD, "Ice Sword");

        if (cfg.enableQuartzite)
            enUS
                    .add(QUARTZITE_BLOCK, "Quartzite")
                    .add(QUARTZITE_SCRAP, "Quartzite Scrap");
        if (cfg.enableUniqueEnchantment)
            enUS
                    .add(FROST_ENCHANTMENT, "Frost")
                    .add(WITHER_ENCHANTMENT, "Wither")
                    .add(SCULK_ENCHANTMENT, "Sculk");
        pack.addLang(new Identifier(ID, "en_us"), enUS);
        pack.addLang(new Identifier(ID, "zh_cn"), zhCN);
    }
}
