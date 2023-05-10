package net.liyze.mod.usefuladditions.features.Quartzite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.mod.uapi.ub.builders.UBaseItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.liyze.mod.usefuladditions.UsefulAdditions.*;

public abstract class Items {
    public static final Item QUARTZITE_SCRAP = new UBaseItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "quartzite_scrap"), cfg.enableQuartzite);
}
