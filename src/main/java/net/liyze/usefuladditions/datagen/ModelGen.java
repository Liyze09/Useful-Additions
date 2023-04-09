package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import static net.liyze.usefuladditions.item.ItemsConfiguration.*;
import static net.liyze.usefuladditions.block.BlocksConfiguration.*;
import static net.minecraft.data.client.Models.*;

class ModelGen extends FabricModelProvider {
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(QUARTZITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MINI_GOLD_INGOT, GENERATED);
        itemModelGenerator.register(MINI_IRON_INGOT, GENERATED);
        itemModelGenerator.register(MINI_LAPIS_BLOCK, GENERATED);
        itemModelGenerator.register(MINI_REDSTONE_BLOCK, GENERATED);

        itemModelGenerator.register(COPPER_AXE, HANDHELD);
        itemModelGenerator.register(COPPER_PICKAXE, HANDHELD);
        itemModelGenerator.register(COPPER_HOE, HANDHELD);
        itemModelGenerator.register(COPPER_SHOVEL, HANDHELD);
        itemModelGenerator.register(COPPER_SWORD, HANDHELD);


        itemModelGenerator.register(COPPER_HELMET, GENERATED);
        itemModelGenerator.register(COPPER_CHESTPLATE, GENERATED);
        itemModelGenerator.register(COPPER_LEGGINGS, GENERATED);
        itemModelGenerator.register(COPPER_BOOTS, GENERATED);

        itemModelGenerator.register(ICE_AXE, HANDHELD);
        itemModelGenerator.register(ICE_PICKAXE, HANDHELD);
        itemModelGenerator.register(ICE_HOE, HANDHELD);
        itemModelGenerator.register(ICE_SHOVEL, HANDHELD);
        itemModelGenerator.register(ICE_SWORD, HANDHELD);
    }

    public ModelGen(FabricDataGenerator generator) {
        super(generator);
    }
}
