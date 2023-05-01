package net.liyze.usefuladditions.api.builders;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

public class UAxeBuilder extends PickaxeItem {
    public UAxeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public UAxeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, Identifier identifier, @NotNull Boolean isEnable) {
        super(material, attackDamage, attackSpeed, settings);
        if (isEnable) Registry.register(Registry.ITEM, identifier, this.asItem());
    }
}
