package net.liyze.usefuladditions.datagen.generator;

import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tags extends FabricTagProvider<Item> {
    public Tags(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    private static final TagKey<Item> PICKAXES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "pickaxes"));
    private static final TagKey<Item> AXES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "axes"));
    private static final TagKey<Item> HOES = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "hoes"));
    private static final TagKey<Item> SHOVELS = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "shovels"));
    private static final TagKey<Item> SWORDS = TagKey.of(Registry.ITEM_KEY, new Identifier("fabric", "swords"));
    @Override
    protected void generateTags() {
    }
}

