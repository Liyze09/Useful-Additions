package net.liyze.mc.uapi.ub.builders;

import net.liyze.mc.uapi.ub.UB;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UBlock extends Block implements UB {
    public UBlock(Settings settings) {
        super(settings);
    }

    public UBlock(Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.BLOCK, identifier, this.asBlock());
        id = identifier.toString();
    }

    private String id;

    @Override
    public String getNamespace() {
        return id;
    }
}
