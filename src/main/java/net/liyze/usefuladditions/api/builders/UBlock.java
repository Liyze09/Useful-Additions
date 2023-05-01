package net.liyze.usefuladditions.api.builders;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UBlock extends Block {
    public UBlock(Settings settings) {
        super(settings);
    }

    public UBlock(Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.BLOCK, identifier, this.asBlock());
    }
}
