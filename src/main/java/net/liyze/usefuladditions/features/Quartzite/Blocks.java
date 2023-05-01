package net.liyze.usefuladditions.features.Quartzite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;

public abstract class Blocks {
    public static final Block QUARTZITE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.25F, 9).requiresTool());
    public static final BlockItem QUARTZITE_ITEM = new BlockItem(QUARTZITE_BLOCK, new FabricItemSettings().group(ITEM_GROUP));
}
