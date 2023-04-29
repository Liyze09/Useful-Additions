package net.liyze.usefuladditions.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;

import static net.liyze.usefuladditions.UsefulAdditions.*;
import static net.liyze.usefuladditions.worldgen.WorldgenConfiguration.*;


public abstract class WorldgenRegister {
    public static void registerFeatures() {
        if (config.enableQuartzite) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(ID, "overworld_quartzite"), OVERWORLD_QUARTZITE_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ID, "overworld_quartzite"),
                    OVERWORLD_QUARTZITE_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(ID, "overworld_quartzite")));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(ID, "end_quartzite"), END_QUARTZITE_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ID, "end_quartzite"),
                    END_QUARTZITE_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(ID, "end_quartzite")));

        }
        if (config.enableBigOre) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(ID, "big_diamond"), OVERWORLD_BIG_DIAMOND_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ID, "big_diamond"),
                    OVERWORLD_BIG_DIAMOND_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(ID, "big_diamond")));
        }
    }
}



