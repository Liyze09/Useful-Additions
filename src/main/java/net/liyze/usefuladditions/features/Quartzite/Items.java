package net.liyze.usefuladditions.features.Quartzite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.usefuladditions.api.items.UItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.*;

public abstract class Items {
    public static final Item QUARTZITE_SCRAP = new UItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "quartzite_scrap"), cfg.enableQuartzite);
}
