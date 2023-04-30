package net.liyze.usefuladditions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class ItemsConfiguration {

    /*Mini Items*/
    public static final Item MINI_GOLD_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_IRON_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_REDSTONE_BLOCK = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_LAPIS_BLOCK = new Item(new FabricItemSettings().group(ITEM_GROUP));
    /*Copper Tools*/
    public static final ToolItem COPPER_PICKAXE = new CustomPickaxeBuilder(CopperToolMaterial.INSTANCE, 0, -2.8F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.6F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_AXE = new CustomAxeBuilder(CopperToolMaterial.INSTANCE, 5, -3.2F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_SHOVEL = new CustomHoeBuilder(CopperToolMaterial.INSTANCE, 1, -3, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_HOE = new ShovelItem(CopperToolMaterial.INSTANCE, -3, -1.5F, new FabricItemSettings().group(ITEM_GROUP));
    /*Copper Armors*/
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    public static final ArmorItem COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ITEM_GROUP));
    public static final ArmorItem COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ITEM_GROUP));
    /*Ice Tools*/
    public static final ToolItem ICE_SWORD = new SwordItem(IceToolMaterial.INSTANCE, 10, -2.2F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_PICKAXE = new CustomPickaxeBuilder(IceToolMaterial.INSTANCE, 7, -2.6F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_AXE = new CustomAxeBuilder(CopperToolMaterial.INSTANCE, 14, -2.9F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_SHOVEL = new CustomHoeBuilder(CopperToolMaterial.INSTANCE, 9, -3, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_HOE = new ShovelItem(CopperToolMaterial.INSTANCE, 2, -0.5F, new FabricItemSettings().group(ITEM_GROUP));
    public static final Item QUARTZITE_SCRAP = new Item(new FabricItemSettings().group(ITEM_GROUP));
}

class CustomAxeBuilder extends PickaxeItem {
    public CustomAxeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

class CustomHoeBuilder extends PickaxeItem {
    public CustomHoeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

class CustomPickaxeBuilder extends PickaxeItem {
    public CustomPickaxeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}