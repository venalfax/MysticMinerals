package com.venalfax.mysticminerals.datagen.bootstrap;

import java.util.List;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.worldgen.ModWorldGen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModWorldgenBootstrapper {
	private ModWorldgenBootstrapper() {
		
	}
	
	/* Ore Generation testing
	
	public static void bootConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		context.register(ModWorldGen.GARNET_ORE, new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(
						OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.RUBY_ORE.get().defaultBlockState())
						OreConfiguration.target(new TagMAtchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())),
						9, 0.0F)
				));
		context.register(ModWorldGen.GARNET_ORE, new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(
						OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.SAPPHIRE_ORE.get().defaultBlockState())
						OreConfiguration.target(new TagMAtchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())),
						9, 0.0F)
				));
		context.register(ModWorldGen.GARNET_ORE, new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(
						OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.GARNET_ORE.get().defaultBlockState())
						OreConfiguration.target(new TagMAtchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_GARNET_ORE.get().defaultBlockState())),
						9, 0.0F)
				));
	}
	*/
	public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context) {
		HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
		
		context.register(ModWorldGen.RUBY_ORE_PLACED, new PlacedFeature(
				configuredFeatures.getOrThrow(ModWorldGen.RUBY_ORE),
				List.of(
						CountPlacement.of(ConstantInt.of(18)),
						InSquarePlacement.spread(),
						HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
						BiomeFilter.biome()
						)
				));
	}
}
