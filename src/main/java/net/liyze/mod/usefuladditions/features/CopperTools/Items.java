package net.liyze.mod.usefuladditions.features.CopperTools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.mod.uapi.ub.builders.*;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;

import static net.liyze.mod.usefuladditions.UsefulAdditions.*;

public abstract class Items {
    public static final ToolItem COPPER_PICKAXE = new UPickaxeBuilder(CopperToolMaterial.INSTANCE, 4, -2.8F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_pickaxe"), cfg.enableCopperTools);
    public static final ToolItem COPPER_SWORD = new USwordBuilder(CopperToolMaterial.INSTANCE, 7, -2.6F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_sword"), cfg.enableCopperTools);
    public static final ToolItem COPPER_AXE = new UAxeBuilder(CopperToolMaterial.INSTANCE, 9, -3.2F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_axe"), cfg.enableCopperTools);
    public static final ToolItem COPPER_SHOVEL = new UShovelBuilder(CopperToolMaterial.INSTANCE, 5, -3, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_shovel"), cfg.enableCopperTools);
    public static final ToolItem COPPER_HOE = new UHoeBuilder(CopperToolMaterial.INSTANCE, 1, -1.5F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "copper_hoe"), cfg.enableCopperTools);
}
