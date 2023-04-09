package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static net.liyze.usefuladditions.UsefulAdditions.ITEM_GROUP;
import static net.liyze.usefuladditions.block.BlockItemsConfiguration.QUARTZITE_ITEM;
import static net.liyze.usefuladditions.item.ItemsConfiguration.*;

class EnglishLanguageGen extends FabricLanguageProvider {
    public EnglishLanguageGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ITEM_GROUP, "Useful Additions");
        translationBuilder.add(MINI_GOLD_INGOT, "Mini Gold Ingot");
        translationBuilder.add(MINI_IRON_INGOT, "Mini Iron Ingot");
        translationBuilder.add(MINI_LAPIS_BLOCK, "Mini Lapis Block");
        translationBuilder.add(MINI_REDSTONE_BLOCK, "Mini Redstone Block");

        translationBuilder.add(COPPER_AXE, "Copper Axe");
        translationBuilder.add(COPPER_HOE, "Copper Hoe");
        translationBuilder.add(COPPER_SHOVEL, "Copper Shovel");
        translationBuilder.add(COPPER_SWORD, "Copper Sword");
        translationBuilder.add(COPPER_PICKAXE, "Copper Pickaxe");

        translationBuilder.add(COPPER_HELMET, "Copper Helmet");
        translationBuilder.add(COPPER_CHESTPLATE, "Copper Chestplate");
        translationBuilder.add(COPPER_LEGGINGS, "Copper Leggings");
        translationBuilder.add(COPPER_BOOTS, "Copper Boots");

        translationBuilder.add(ICE_AXE, "Ice Axe");
        translationBuilder.add(ICE_HOE, "Ice Hoe");
        translationBuilder.add(ICE_PICKAXE, "Ice Pickaxe");
        translationBuilder.add(ICE_SHOVEL, "Ice Shovel");
        translationBuilder.add(ICE_SWORD, "Ice Sword");

        translationBuilder.add(QUARTZITE_ITEM, "Quartzite");
    }
}
