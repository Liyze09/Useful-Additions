package net.liyze.mod.usefuladditions.features.IceTools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.mod.uapi.ub.builders.*;
import net.liyze.mod.usefuladditions.UsefulAdditions;
import net.liyze.mod.usefuladditions.features.CopperTools.CopperToolMaterial;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;

public class Items {
    public static final ToolItem ICE_SWORD = new USwordBuilder(IceToolMaterial.INSTANCE, 10, -2.2F, new FabricItemSettings().group(UsefulAdditions.ITEM_GROUP), new Identifier(UsefulAdditions.ID, "ice_sword"), UsefulAdditions.cfg.enableIceTools);
    public static final ToolItem ICE_PICKAXE = new UPickaxeBuilder(IceToolMaterial.INSTANCE, 7, -2.6F, new FabricItemSettings().group(UsefulAdditions.ITEM_GROUP), new Identifier(UsefulAdditions.ID, "ice_pickaxe"), UsefulAdditions.cfg.enableIceTools);
    public static final ToolItem ICE_AXE = new UAxeBuilder(CopperToolMaterial.INSTANCE, 14, -2.9F, new FabricItemSettings().group(UsefulAdditions.ITEM_GROUP), new Identifier(UsefulAdditions.ID, "ice_axe"), UsefulAdditions.cfg.enableIceTools);
    public static final ToolItem ICE_SHOVEL = new UShovelBuilder(CopperToolMaterial.INSTANCE, 9, -3, new FabricItemSettings().group(UsefulAdditions.ITEM_GROUP), new Identifier(UsefulAdditions.ID, "ice_shovel"), UsefulAdditions.cfg.enableIceTools);
    public static final ToolItem ICE_HOE = new UHoeBuilder(CopperToolMaterial.INSTANCE, 2, -0.5F, new FabricItemSettings().group(UsefulAdditions.ITEM_GROUP), new Identifier(UsefulAdditions.ID, "ice_hoe"), UsefulAdditions.cfg.enableIceTools);
}
