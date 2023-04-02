package net.liyze.usefuladditions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.util.CustomHoeItem;
import net.minecraft.item.*;

public class Items {
    /*Mini Items*/
    public static final Item MINI_GOLD_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_IRON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_REDSTONE_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_LAPIS_LAZULI_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    /*Copper Tools*/
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE,0,1.2F,new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE,6,1.5F,new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ToolItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE,7,0.8F,new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_HOE = new CustomHoeItem(CopperToolMaterial.INSTANCE,2,1.0F,new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE,-2,2.5F,new Item.Settings().group(ItemGroup.TOOLS));
}
