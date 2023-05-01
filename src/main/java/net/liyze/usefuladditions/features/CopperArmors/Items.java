package net.liyze.usefuladditions.features.CopperArmors;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.api.items.UArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class Items {
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    public static final ArmorItem COPPER_HELMET = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_CHESTPLATE = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_LEGGINGS = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_BOOTS = new UArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ITEM_GROUP));
}
