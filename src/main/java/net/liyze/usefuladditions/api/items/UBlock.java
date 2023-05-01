package net.liyze.usefuladditions.api.items;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class UBlock extends Block {
    public UBlock(Settings settings) {
        super(settings);
    }

    public UBlock(Settings settings, Identifier identifier, Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.BLOCK, identifier, this.asBlock());
    }
}
