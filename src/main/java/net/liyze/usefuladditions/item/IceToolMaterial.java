package net.liyze.usefuladditions.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IceToolMaterial implements ToolMaterial {
    public static final IceToolMaterial INSTANCE = new IceToolMaterial();

    @Override
    public int getDurability() {
        return 10;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 18.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 32;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.ICE);
    }
}
