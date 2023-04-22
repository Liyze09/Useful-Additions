package net.liyze.usefuladditions.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

import static net.liyze.usefuladditions.block.BlocksConfiguration.QUARTZITE_BLOCK;

public class WorldgenConfiguration {
    public static ConfiguredFeature<?, ?> OVERWORLD_QUARTZITE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    QUARTZITE_BLOCK.getDefaultState(),
                    12));

    public static PlacedFeature OVERWORLD_QUARTZITE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_QUARTZITE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-5), YOffset.fixed(128))
            ));

    public static ConfiguredFeature<?, ?> END_QUARTZITE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    QUARTZITE_BLOCK.getDefaultState(),
                    16));

    public static PlacedFeature END_QUARTZITE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_QUARTZITE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(8),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())
            ));
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
