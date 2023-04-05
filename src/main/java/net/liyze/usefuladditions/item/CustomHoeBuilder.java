package net.liyze.usefuladditions.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoeBuilder extends PickaxeItem {
    public CustomHoeBuilder(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
