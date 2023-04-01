package net.liyze.usefuladditions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.UsefulAdditions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Items extends UsefulAdditions {
    public static final Item MINI_GOLD_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_IRON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_REDSTONE_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item MINI_LAPIS_LAZULI_BLOCK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
}
