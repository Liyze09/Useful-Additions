package net.liyze.mod.usefuladditions.misc;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.liyze.mod.usefuladditions.UsefulAdditions;
import net.liyze.mod.usefuladditions.features.BigOre.Worldgen;
import net.liyze.mod.usefuladditions.features.Quartzite.WorldgenConfiguration;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;


public abstract class WorldgenRegister {
    public static void registerFeatures() {
        if (UsefulAdditions.cfg.enableQuartzite) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(UsefulAdditions.ID, "overworld_quartzite"), WorldgenConfiguration.OVERWORLD_QUARTZITE_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(UsefulAdditions.ID, "overworld_quartzite"),
                    WorldgenConfiguration.OVERWORLD_QUARTZITE_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(UsefulAdditions.ID, "overworld_quartzite")));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(UsefulAdditions.ID, "end_quartzite"), WorldgenConfiguration.END_QUARTZITE_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(UsefulAdditions.ID, "end_quartzite"),
                    WorldgenConfiguration.END_QUARTZITE_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(UsefulAdditions.ID, "end_quartzite")));

        }
        if (UsefulAdditions.cfg.enableBigOre) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(UsefulAdditions.ID, "big_diamond"), Worldgen.OVERWORLD_BIG_DIAMOND_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(UsefulAdditions.ID, "big_diamond"),
                    Worldgen.OVERWORLD_BIG_DIAMOND_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(UsefulAdditions.ID, "big_diamond")));
        }
    }
}



