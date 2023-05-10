package net.liyze.mod.usefuladditions.features.CopperArmors;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.mod.uapi.ub.builders.UArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;

import static net.liyze.mod.usefuladditions.UsefulAdditions.*;

public abstract class Items {
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    public static final ArmorItem COPPER_HELMET = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_helmet"), cfg.enableCopperArmors);
    public static final ArmorItem COPPER_CHESTPLATE = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_chestplate"), cfg.enableCopperArmors);
    public static final ArmorItem COPPER_LEGGINGS = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_leggings"), cfg.enableCopperArmors);
    public static final ArmorItem COPPER_BOOTS = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_boots"), cfg.enableCopperArmors);
}
