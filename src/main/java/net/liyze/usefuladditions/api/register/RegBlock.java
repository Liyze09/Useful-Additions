package net.liyze.usefuladditions.api.register;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("NotNullFieldNotInitialized")
public class RegBlock {
    @NotNull
    public Identifier id;
    @NotNull
    public Block regBlock;
    public boolean doEnable;
}
