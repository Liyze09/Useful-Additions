package net.liyze.usefuladditions.register;

import net.liyze.usefuladditions.enchantments.FrostEnchantment;
import net.liyze.usefuladditions.enchantments.SculkEnchantment;
import net.liyze.usefuladditions.enchantments.WitherEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;

public class EnchantmentRegister {
    public static Enchantment WITHER_ENCHANTMENT = new WitherEnchantment();
    public static Enchantment SHULK_ENCHANTMENT = new SculkEnchantment();
    public static Enchantment FROST_ENCHANTMENT = new FrostEnchantment();

    public static void registerEnchantments() {
        if (CONFIG.isEnableUniqueEnchantment()) {
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "wither"), WITHER_ENCHANTMENT);
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "shulk"), SHULK_ENCHANTMENT);
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "frost"), FROST_ENCHANTMENT);
        }
    }
}
