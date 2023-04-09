package net.liyze.usefuladditions.register;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;

import static net.liyze.usefuladditions.UsefulAdditions.CONFIG;
import static net.liyze.usefuladditions.UsefulAdditions.ID;
import static net.liyze.usefuladditions.block.WorldgenConfiguration.OVERWORLD_QUARTZITE_CONFIGURED_FEATURE;
import static net.liyze.usefuladditions.block.WorldgenConfiguration.OVERWORLD_QUARTZITE_PLACED_FEATURE;


public class WorldgenRegister {
    public static void registerFeatures() {
        if (CONFIG.isEnableQuartzite()) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                    new Identifier(ID, "overworld_quartzite"), OVERWORLD_QUARTZITE_CONFIGURED_FEATURE);
            Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ID, "overworld_quartzite"),
                    OVERWORLD_QUARTZITE_PLACED_FEATURE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(ID, "overworld_quartzite")));
        }
    }
}


