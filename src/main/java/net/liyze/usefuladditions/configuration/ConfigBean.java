package net.liyze.usefuladditions.configuration;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

import static net.liyze.usefuladditions.UsefulAdditions.ID;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
@Config(name = ID)
public class ConfigBean implements ConfigData {
    public boolean enableMiniIngots = true;
    public boolean enableCopperTools = true;
    public boolean enableCopperArmors = true;
    public boolean enableIceTools = true;
    public boolean enableQuartzite = true;
    public boolean enableUniqueEnchantment = true;
    public boolean enableBigOre = true;
    public boolean enableCoffee = true;
}