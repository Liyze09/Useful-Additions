package net.liyze.uapi.builders;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UBlockItem extends BlockItem {
    public UBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public UBlockItem(Block block, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(block, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
