package net.liyze.mod.uapi.ub.builders;

import net.liyze.mod.uapi.ub.UB;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UBlockItem extends BlockItem implements UB {
    public UBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public UBlockItem(Block block, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(block, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
        id = identifier.toString();
    }

    private String id;

    @Override
    public String getNamespace() {
        return id;
    }
}
