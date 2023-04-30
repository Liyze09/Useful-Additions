package net.liyze.usefuladditions.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.UsefulAdditions.*;

public abstract class EnchantmentRegister {
    public static Enchantment WITHER_ENCHANTMENT = new WitherEnchantment();
    public static Enchantment SCULK_ENCHANTMENT = new SculkEnchantment();
    public static Enchantment FROST_ENCHANTMENT = new FrostEnchantment();

    public static void registerEnchantments() {
        if (cfg.enableUniqueEnchantment) {
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "wither"), WITHER_ENCHANTMENT);
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "shulk"), SCULK_ENCHANTMENT);
            Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "frost"), FROST_ENCHANTMENT);
        }
    }
}
