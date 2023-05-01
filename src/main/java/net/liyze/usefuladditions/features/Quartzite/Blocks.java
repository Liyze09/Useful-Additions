package net.liyze.usefuladditions.features.Quartzite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.liyze.usefuladditions.api.builders.UBlock;
import net.liyze.usefuladditions.api.builders.UBlockItem;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;

import static net.liyze.usefuladditions.UsefulAdditions.*;

@SuppressWarnings("unused")
public abstract class Blocks {
    public static final Block QUARTZITE_BLOCK = new UBlock(FabricBlockSettings.of(Material.STONE).strength(1.25F, 9).requiresTool(), new Identifier(ID, "quartzite"), cfg.enableQuartzite);
    public static final BlockItem QUARTZITE_ITEM = new UBlockItem(QUARTZITE_BLOCK, new FabricItemSettings().group(ITEM_GROUP), new Identifier(ID, "quartzite"), cfg.enableQuartzite);
}
