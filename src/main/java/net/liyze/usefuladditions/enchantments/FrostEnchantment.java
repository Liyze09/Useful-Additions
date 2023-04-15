package net.liyze.usefuladditions.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import static net.liyze.usefuladditions.UsefulAdditions.random;

public class FrostEnchantment extends Enchantment {
    public FrostEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND,EquipmentSlot.OFFHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, level + random.nextInt(1), level + 4 + random.nextInt(1)));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, level * 2 + random.nextInt(2), level + random.nextInt(1)));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, level * 2 + random.nextInt(2), 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, level * 2 + random.nextInt(2), level + random.nextInt(1)));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, level + random.nextInt(1), 0));
        }

        super.onTargetDamaged(user, target, level);
    }
}
