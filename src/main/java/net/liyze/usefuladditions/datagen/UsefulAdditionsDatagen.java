package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UsefulAdditionsDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ModelGen::new);
        fabricDataGenerator.addProvider(TagGen::new);
        fabricDataGenerator.addProvider(EnglishLanguageGen::new);
    }
}
