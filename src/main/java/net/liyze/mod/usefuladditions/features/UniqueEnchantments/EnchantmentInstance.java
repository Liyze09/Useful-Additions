package net.liyze.mod.usefuladditions.features.UniqueEnchantments;

import net.minecraft.enchantment.Enchantment;

public abstract class EnchantmentInstance {
    public static Enchantment WITHER_ENCHANTMENT = new WitherEnchantment();
    public static Enchantment SCULK_ENCHANTMENT = new SculkEnchantment();
    public static Enchantment FROST_ENCHANTMENT = new FrostEnchantment();
}
