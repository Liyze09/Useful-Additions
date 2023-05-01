package net.liyze.usefuladditions.features.IceTools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.uapi.builders.*;
import net.liyze.usefuladditions.features.CopperTools.CopperToolMaterial;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.*;

public class Items {
    public static final ToolItem ICE_SWORD = new USwordBuilder(IceToolMaterial.INSTANCE, 10, -2.2F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "ice_sword"), cfg.enableIceTools);
    public static final ToolItem ICE_PICKAXE = new UPickaxeBuilder(IceToolMaterial.INSTANCE, 7, -2.6F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "ice_pickaxe"), cfg.enableIceTools);
    public static final ToolItem ICE_AXE = new UAxeBuilder(CopperToolMaterial.INSTANCE, 14, -2.9F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "ice_axe"), cfg.enableIceTools);
    public static final ToolItem ICE_SHOVEL = new UHoeBuilder(CopperToolMaterial.INSTANCE, 9, -3, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "ice_shovel"), cfg.enableIceTools);
    public static final ToolItem ICE_HOE = new UShovelBuilder(CopperToolMaterial.INSTANCE, 2, -0.5F, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "ice_hoe"), cfg.enableIceTools);
}
