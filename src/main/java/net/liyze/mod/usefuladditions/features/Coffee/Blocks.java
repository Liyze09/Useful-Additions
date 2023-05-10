package net.liyze.mod.usefuladditions.features.Coffee;

import net.liyze.mod.uapi.ub.builders.UAliasedBlockItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.liyze.mod.usefuladditions.UsefulAdditions.*;

@SuppressWarnings("unused")
public class Blocks {
    public static final CropBlock COFFEE_CROP_BLOCK = new CoffeeCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item COFFEE_SEED = new UAliasedBlockItem(COFFEE_CROP_BLOCK, new Item.Settings().group(ITEM_GROUP), new Identifier(ID, "coffee_seed"), cfg.enableCoffee);
}
