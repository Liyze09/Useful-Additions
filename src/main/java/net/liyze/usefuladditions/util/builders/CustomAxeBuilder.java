package net.liyze.usefuladditions.util.builders;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomAxeBuilder extends PickaxeItem {
    public CustomAxeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
