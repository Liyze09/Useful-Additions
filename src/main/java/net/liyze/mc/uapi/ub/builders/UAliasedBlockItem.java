package net.liyze.mc.uapi.ub.builders;

import net.liyze.mc.uapi.ub.UB;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UAliasedBlockItem extends AliasedBlockItem implements UB {
    public UAliasedBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public UAliasedBlockItem(Block block, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
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
