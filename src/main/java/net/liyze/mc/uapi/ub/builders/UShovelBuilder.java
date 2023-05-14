package net.liyze.mc.uapi.ub.builders;

import net.liyze.mc.uapi.ub.UB;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class UShovelBuilder extends ShovelItem implements UB {
    public UShovelBuilder(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public UShovelBuilder(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
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
