package net.liyze.usefuladditions.features.IceTools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.features.CopperTools.CopperToolMaterial;
import net.liyze.usefuladditions.util.builders.CustomAxeBuilder;
import net.liyze.usefuladditions.util.builders.CustomHoeBuilder;
import net.liyze.usefuladditions.util.builders.CustomPickaxeBuilder;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public class Items {
    public static final ToolItem ICE_SWORD = new SwordItem(IceToolMaterial.INSTANCE, 10, -2.2F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_PICKAXE = new CustomPickaxeBuilder(IceToolMaterial.INSTANCE, 7, -2.6F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_AXE = new CustomAxeBuilder(CopperToolMaterial.INSTANCE, 14, -2.9F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_SHOVEL = new CustomHoeBuilder(CopperToolMaterial.INSTANCE, 9, -3, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem ICE_HOE = new ShovelItem(CopperToolMaterial.INSTANCE, 2, -0.5F, new FabricItemSettings().group(ITEM_GROUP));
}
