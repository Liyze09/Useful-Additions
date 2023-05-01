package net.liyze.uapi.builders;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UToolItem extends ToolItem {
    public UToolItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    public UToolItem(ToolMaterial material, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(material, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
