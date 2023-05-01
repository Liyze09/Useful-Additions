package net.liyze.usefuladditions.features.MiniIngots;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liyze.uapi.builders.UItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.*;

public abstract class Items {
    public static final Item MINI_GOLD_INGOT = new UItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "mini_gold_ingot"), cfg.enableMiniIngots);
    public static final Item MINI_IRON_INGOT = new UItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "mini_iron_ingot"), cfg.enableMiniIngots);
    public static final Item MINI_REDSTONE_BLOCK = new UItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "mini_redstone_block"), cfg.enableMiniIngots);
    public static final Item MINI_LAPIS_BLOCK = new UItem(new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "mini_lapis_block"), cfg.enableMiniIngots);
}

