package net.liyze.usefuladditions.api.register;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Register {
    private static ArrayList<RegBlock> regBlocks;

    public static void regBlocks() {
        for (RegBlock n : regBlocks) {
            if (n.doEnable) Registry.register(Registry.BLOCK, n.id, n.regBlock);
        }
    }

    public static void addBlock(Identifier identifier, Block block, boolean doEnable) {
        RegBlock regBlock = new RegBlock();
        regBlock.id = identifier;
        regBlock.regBlock = block;
        regBlock.doEnable = doEnable;
        regBlocks.add(regBlock);
    }

    private static ArrayList<RegItem> regItems;

    public static void regItems() {
        for (RegItem n : regItems) {
            if (n.doEnable) Registry.register(Registry.ITEM, n.id, n.regItem);
        }
    }

    public static void addItem(Identifier identifier, Item item, boolean doEnable) {
        RegItem regItem = new RegItem();
        regItem.id = identifier;
        regItem.regItem = item;
        regItem.doEnable = doEnable;
        regItems.add(regItem);
    }

    private static ArrayList<RegEnchantment> regEnchantments;

    public static void regEnchantments() {
        for (RegEnchantment n : regEnchantments) {
            if (n.doEnable) Registry.register(Registry.ENCHANTMENT, n.id, n.regEnchantment);
        }
    }

    public static void addEnchantment(Identifier identifier, Enchantment enchantment, boolean doEnable) {
        RegEnchantment regEnchantment = new RegEnchantment();
        regEnchantment.id = identifier;
        regEnchantment.regEnchantment = enchantment;
        regEnchantment.doEnable = doEnable;
        regEnchantments.add(regEnchantment);
    }
}
