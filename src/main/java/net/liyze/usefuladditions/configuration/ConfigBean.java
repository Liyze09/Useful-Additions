package net.liyze.usefuladditions.configuration;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

import static net.liyze.usefuladditions.UsefulAdditions.ID;

@SuppressWarnings({"FieldMayBeFinal", "FieldCanBeLocal", "unused"})
@Config(name = ID)
public class ConfigBean implements ConfigData {
    public boolean enableMiniIngots = true;
    public boolean enableCopperTools = true;
    public boolean enableCopperArmors = true;
    public boolean enableIceTools = true;
    public boolean enableQuartzite = true;
    public boolean enableUniqueEnchantment = true;
    public boolean enableBigOre = true;

    /*Methods to read settings*/
    public boolean isEnableMiniIngots() {
        return enableMiniIngots;
    }

    public boolean isEnableCopperTools() {
        return enableCopperTools;
    }

    public boolean isEnableCopperArmors() {
        return enableCopperArmors;
    }

    public boolean isEnableIceTools() {
        return enableIceTools;
    }

    public boolean isEnableQuartzite() {
        return enableQuartzite;
    }

    public boolean isEnableUniqueEnchantment() {
        return enableUniqueEnchantment;
    }

    public boolean isEnableBigOre() {
        return enableBigOre;
    }
    /*Method to edit settings*/

    public void setEnableMiniIngots(boolean enableMiniIngots1) {
        enableMiniIngots = enableMiniIngots1;
    }

    public void setEnableCopperTools(boolean enableCopperTools1) {
        enableCopperTools = enableCopperTools1;
    }

    public void setEnableCopperArmors(boolean enableCopperArmors1) {
        enableCopperArmors = enableCopperArmors1;
    }

    public void setEnableIceTools(boolean enableIceTools1) {
        enableIceTools = enableIceTools1;
    }

    public void setEnableQuartzite(boolean enableQuartzite1) {
        enableQuartzite = enableQuartzite1;
    }

    public void setEnableUniqueEnchantment(boolean enableUniqueEnchantment1) {
        enableUniqueEnchantment = enableUniqueEnchantment1;
    }
}
