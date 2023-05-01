package net.liyze.usefuladditions.api.register;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("NotNullFieldNotInitialized")
public class RegEnchantment {
    @NotNull
    public Identifier id;
    @NotNull
    public Enchantment regEnchantment;
    public boolean doEnable;
}
