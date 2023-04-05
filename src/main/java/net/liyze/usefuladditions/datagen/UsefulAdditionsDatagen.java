package net.liyze.usefuladditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.*;
import net.liyze.usefuladditions.datagen.generator.Models;
import net.liyze.usefuladditions.datagen.generator.Tags;

public class UsefulAdditionsDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(Models::new);
        fabricDataGenerator.addProvider(Tags::new);
    }
}
