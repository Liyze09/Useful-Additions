package net.liyze.usefuladditions.features.CopperTools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.api.items.UAxeBuilder;
import net.liyze.usefuladditions.api.items.UHoeBuilder;
import net.liyze.usefuladditions.api.items.UPickaxeBuilder;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class Items {
    public static final ToolItem COPPER_PICKAXE = new UPickaxeBuilder(CopperToolMaterial.INSTANCE, 0, -2.8F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.6F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_AXE = new UAxeBuilder(CopperToolMaterial.INSTANCE, 5, -3.2F, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_SHOVEL = new UHoeBuilder(CopperToolMaterial.INSTANCE, 1, -3, new FabricItemSettings().group(ITEM_GROUP));
    public static final ToolItem COPPER_HOE = new ShovelItem(CopperToolMaterial.INSTANCE, -3, -1.5F, new FabricItemSettings().group(ITEM_GROUP));
}
