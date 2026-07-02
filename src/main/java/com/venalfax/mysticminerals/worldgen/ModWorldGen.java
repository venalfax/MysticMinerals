package com.venalfax.mysticminerals.worldgen;

import java.util.List;

import com.venalfax.mysticminerals.blocks.MineralBlocks;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public final class ModWorldGen {

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE = FeatureUtils.createKey("ruby_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = FeatureUtils.createKey("sapphire_ore");
	
	public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.createKey("ruby_ore");
	public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.createKey("sapphire_ore");
	
	private ModWorldGen() {
		
		
	}
	
	public static void load() {
		
	}
	
	public static void bootConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		FeatureUtils.register(
			context,
			RUBY_ORE,
			Feature.ORE,
			new OreConfiguration(
					List.of(
							OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.RUBY_ORE.get().defaultBlockState()),
							OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
					),
					9
			)
		);
		FeatureUtils.register(
			context,
			SAPPHIRE_ORE,
			Feature.ORE,
			new OreConfiguration(
					List.of(
							OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
							OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())
					),
					9
			)
		);
		
	}
	
	private static List<PlacementModifier> orePlacement(PlacementModifier frequencyModifier, PlacementModifier heightRange) {
		return List.of(frequencyModifier, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
	}
	
	private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange){
		return orePlacement(CountPlacement.of(count), heightRange);
	}
	
	public static void bootPlacedFeatures(BootstrapContext<PlacedFeature> context) {
		HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
		Holder<ConfiguredFeature<?, ?>> rubyOre = configuredFeatures.getOrThrow(RUBY_ORE);
		Holder<ConfiguredFeature<?, ?>> sapphireOre = configuredFeatures.getOrThrow(SAPPHIRE_ORE);
		
		PlacementUtils.register(
			context,
			RUBY_ORE_PLACED,
			rubyOre,
			commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480)))
		);
		PlacementUtils.register(
			context,
			SAPPHIRE_ORE_PLACED,
			sapphireOre,
			commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480)))
		);
		
	}
	
	public static void addExtraRubies(BiomeGenerationSettings.Builder builder) {
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, RUBY_ORE_PLACED);
	}
	
	public static void addExtraSapphires(BiomeGenerationSettings.Builder builder) {
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SAPPHIRE_ORE_PLACED);
	}
	
}
