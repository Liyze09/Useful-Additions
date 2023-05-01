package net.liyze.usefuladditions.features.MiniIngots;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class Items {
    public static final Item MINI_GOLD_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_IRON_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_REDSTONE_BLOCK = new Item(new FabricItemSettings().group(ITEM_GROUP));
    public static final Item MINI_LAPIS_BLOCK = new Item(new FabricItemSettings().group(ITEM_GROUP));
}

