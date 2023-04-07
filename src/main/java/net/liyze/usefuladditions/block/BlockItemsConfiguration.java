package net.liyze.usefuladditions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;
import static net.liyze.usefuladditions.block.BlocksConfiguration.QUARTZITE_BLOCK;

public class BlockItemsConfiguration {
    public static final BlockItem QUARTZITE_ITEM = new BlockItem(QUARTZITE_BLOCK, new FabricItemSettings().group(ITEM_GROUP));
}
