package net.liyze.usefuladditions.util;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoeItem extends PickaxeItem {
    public CustomHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
