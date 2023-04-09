package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.liyze.usefuladditions.item.ItemsConfiguration.*;

class TagGen extends FabricTagProvider<Item> {
    public TagGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    private static final TagKey<Item> PICKAXES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "pickaxes"));
    private static final TagKey<Item> AXES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "axes"));
    private static final TagKey<Item> HOES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "hoes"));
    private static final TagKey<Item> SHOVELS = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "shovels"));
    private static final TagKey<Item> SWORDS = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "swords"));

    @Override
    public void generateTags() {
        getOrCreateTagBuilder(PICKAXES)
                .add(COPPER_PICKAXE)
                .add(ICE_PICKAXE);
        getOrCreateTagBuilder(AXES)
                .add(COPPER_AXE)
                .add(ICE_AXE);
        getOrCreateTagBuilder(SWORDS)
                .add(COPPER_SWORD)
                .add(ICE_SWORD);
        getOrCreateTagBuilder(HOES)
                .add(COPPER_HOE)
                .add(ICE_HOE);
        getOrCreateTagBuilder(SHOVELS)
                .add(COPPER_SHOVEL)
                .add(ICE_SHOVEL);
    }
}

