package net.liyze.mod.uapi.ub.builders;

import net.liyze.mod.uapi.ub.UB;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UBaseItem extends Item implements UB {
    public UBaseItem(Settings settings) {
        super(settings);
    }

    public UBaseItem(Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
        id = identifier.toString();
    }

    private String id;

    @Override
    public String getNamespace() {
        return id;
    }
}
