package net.liyze.usefuladditions.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

public class CopperToolMaterial implements ToolMaterial {
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();
    @Override
    public int getDurability() {
        return 400;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.5F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
