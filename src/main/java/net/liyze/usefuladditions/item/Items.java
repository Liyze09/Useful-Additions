package net.liyze.usefuladditions.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.util.CustomHoeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.ID;

public class Items {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ID, "main"),
            () -> new ItemStack(net.minecraft.item.Items.BUCKET));

    /*Mini Items*/
    public static final Item MINI_GOLD_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_IRON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_REDSTONE_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_LAPIS_LAZULI_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    /*Copper Tools*/
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, 0, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.5F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ToolItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE, 5, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_HOE = new CustomHoeItem(CopperToolMaterial.INSTANCE, 1, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, -3, -1.5F, new Item.Settings().group(ItemGroup.TOOLS));
    /*Copper Armors*/
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    public static final ArmorItem COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
}