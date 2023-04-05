package net.liyze.usefuladditions.datagen.generator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import static net.liyze.usefuladditions.item.Items.*;
import static net.minecraft.data.client.Models.*;
import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;

public class Models extends FabricModelProvider {
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        if (CONFIG.isEnableMiniIngots()) {
            itemModelGenerator.register(MINI_GOLD_INGOT, GENERATED);
            itemModelGenerator.register(MINI_IRON_INGOT, GENERATED);
            itemModelGenerator.register(MINI_LAPIS_LAZULI_BLOCK, GENERATED);
            itemModelGenerator.register(MINI_REDSTONE_BLOCK, GENERATED);
        }
        if (CONFIG.isEnableCopperTools()) {
            itemModelGenerator.register(COPPER_AXE, HANDHELD);
            itemModelGenerator.register(COPPER_PICKAXE, HANDHELD);
            itemModelGenerator.register(COPPER_HOE, HANDHELD);
            itemModelGenerator.register(COPPER_SHOVEL, HANDHELD);
            itemModelGenerator.register(COPPER_SWORD, HANDHELD);
        }
        if (CONFIG.isEnableCopperArmors()){
            itemModelGenerator.register(COPPER_HELMET, GENERATED);
            itemModelGenerator.register(COPPER_CHESTPLATE, GENERATED);
            itemModelGenerator.register(COPPER_LEGGINGS, GENERATED);
            itemModelGenerator.register(COPPER_BOOTS, GENERATED);
        }
    }
    public Models(FabricDataGenerator generator) {
        super(generator);
    }
}
