package net.liyze.usefuladditions.api.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class UItem extends Item {
    public UItem(Settings settings) {
        super(settings);
    }

    public UItem(Settings settings, Identifier identifier, Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
