package net.liyze.usefuladditions.api.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class UBlockItem extends BlockItem {
    public UBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public UBlockItem(Block block, Settings settings, Identifier identifier, Boolean isEnable) {
        super(block, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
