package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UsefulAdditionsDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(Models::new);
        fabricDataGenerator.addProvider(Tags::new);
        fabricDataGenerator.addProvider(EnglishLanguage::new);
    }
}
