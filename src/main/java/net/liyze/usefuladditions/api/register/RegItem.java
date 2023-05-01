package net.liyze.usefuladditions.api.register;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("NotNullFieldNotInitialized")
public class RegItem {
    @NotNull
    public Identifier id;
    @NotNull
    public Item regItem;
    public boolean doEnable;
}
