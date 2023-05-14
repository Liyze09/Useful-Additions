package net.liyze.mc.uapi.ub.builders;

import net.liyze.mc.uapi.ub.UB;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class USwordBuilder extends SwordItem implements UB {
    public USwordBuilder(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public USwordBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(material, attackDamage, attackSpeed, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
        id = identifier.toString();
    }

    private String id;

    @Override
    public String getNamespace() {
        return id;
    }
}
