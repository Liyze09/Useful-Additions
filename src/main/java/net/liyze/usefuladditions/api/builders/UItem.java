package net.liyze.usefuladditions.api.builders;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UItem extends Item {
    public UItem(Settings settings) {
        super(settings);
    }

    public UItem(Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
