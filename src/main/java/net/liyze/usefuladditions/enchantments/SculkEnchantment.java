package net.liyze.usefuladditions.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class SculkEnchantment extends Enchantment {
    public SculkEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.OFFHAND,EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMinPower(int level) {
        return 1;
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof PlayerEntity) {
            ((PlayerEntity) target).addExperience(level*-2);
        }if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 4 * level, 1));
        }

        super.onTargetDamaged(user, target, level);
    }
}
