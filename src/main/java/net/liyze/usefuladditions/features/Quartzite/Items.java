package net.liyze.usefuladditions.features.Quartzite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class Items {
    public static final Item QUARTZITE_SCRAP = new Item(new FabricItemSettings().group(ITEM_GROUP));
}
