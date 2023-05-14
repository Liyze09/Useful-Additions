package net.liyze.mc.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.liyze.mc.usefuladditions.features.MiniIngots.Items;
import net.liyze.mc.usefuladditions.features.Quartzite.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.state.property.Properties;

import static net.minecraft.data.client.Models.*;

class ModelGen extends FabricModelProvider {
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(Blocks.QUARTZITE_BLOCK);
        blockStateModelGenerator.registerCrop(net.liyze.mc.usefuladditions.features.Coffee.Blocks.COFFEE_CROP_BLOCK, Properties.AGE_7, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Items.MINI_GOLD_INGOT, GENERATED);
        itemModelGenerator.register(Items.MINI_IRON_INGOT, GENERATED);
        itemModelGenerator.register(Items.MINI_LAPIS_BLOCK, GENERATED);
        itemModelGenerator.register(Items.MINI_REDSTONE_BLOCK, GENERATED);

        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperTools.Items.COPPER_AXE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperTools.Items.COPPER_PICKAXE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperTools.Items.COPPER_HOE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperTools.Items.COPPER_SHOVEL, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperTools.Items.COPPER_SWORD, HANDHELD);


        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperArmors.Items.COPPER_HELMET, GENERATED);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperArmors.Items.COPPER_CHESTPLATE, GENERATED);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperArmors.Items.COPPER_LEGGINGS, GENERATED);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.CopperArmors.Items.COPPER_BOOTS, GENERATED);

        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.IceTools.Items.ICE_AXE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.IceTools.Items.ICE_PICKAXE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.IceTools.Items.ICE_HOE, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.IceTools.Items.ICE_SHOVEL, HANDHELD);
        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.IceTools.Items.ICE_SWORD, HANDHELD);

        itemModelGenerator.register(net.liyze.mc.usefuladditions.features.Quartzite.Items.QUARTZITE_SCRAP, GENERATED);
    }

    public ModelGen(FabricDataGenerator generator) {
        super(generator);
    }
}
