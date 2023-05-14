package net.liyze.mc.usefuladditions.features.BigOre;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public abstract class Worldgen {
    public static ConfiguredFeature<?, ?> OVERWORLD_BIG_DIAMOND_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState(),
                    10));

    public static PlacedFeature OVERWORLD_BIG_DIAMOND_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_BIG_DIAMOND_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(2),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(5))
            ));
}
