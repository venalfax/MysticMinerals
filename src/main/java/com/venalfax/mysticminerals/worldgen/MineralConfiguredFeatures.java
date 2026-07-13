package com.venalfax.mysticminerals.worldgen;

import java.util.List;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class MineralConfiguredFeatures {
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_OVERWORLD_ORES_KEY = registerKey("ruby_overeworld_key");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_OVERWORLD_ORES_KEY = registerKey("sapphire_overeworld_key");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_GEODE_KEY = registerKey("citrine_geode_key");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> ONYX_BERRY_BUSH_KEY = registerKey("onyx_berry_bush_key"); 

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		
		List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(
				OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.RUBY_ORE.get().defaultBlockState()),
				OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(
				OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), MineralBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
				OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
		
		register(context, RUBY_OVERWORLD_ORES_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 8));
		register(context, SAPPHIRE_OVERWORLD_ORES_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 8));
		
		register(context, CITRINE_GEODE_KEY, Feature.GEODE, 
				new GeodeConfiguration(new GeodeBlockSettings(
						BlockStateProvider.simple(Blocks.AIR),
						BlockStateProvider.simple(MineralBlocks.CITRINE_BLOCK.get()),
						BlockStateProvider.simple(MineralBlocks.BUDDING_CITRINE.get()),
						BlockStateProvider.simple(Blocks.CALCITE),
	                    BlockStateProvider.simple(Blocks.SMOOTH_BASALT), 
						List.of(
								MineralBlocks.CITRINE_CLUSTER.get().defaultBlockState(),
								MineralBlocks.LARGE_CITRINE_BUD.get().defaultBlockState(),
								MineralBlocks.MEDIUM_CITRINE_BUD.get().defaultBlockState(),
								MineralBlocks.SMALL_CITRINE_BUD.get().defaultBlockState()
						),
						BlockTags.FEATURES_CANNOT_REPLACE,
						BlockTags.GEODE_INVALID_BLOCKS
				),
				new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, 2.0, 2),
                0.35,
                0.083,
                true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2),
                -16,
                16,
                0.05,
                1));
		
		register(context, ONYX_BERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,
				new SimpleRandomFeatureConfiguration(
						HolderSet.direct(PlacementUtils.inlinePlaced(
								Feature.SIMPLE_BLOCK, 
								new SimpleBlockConfiguration(BlockStateProvider.simple(MineralBlocks.ONYX_BERRY_BUSH.get()
										.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))),
								CountPlacement.of(32),
								RandomOffsetPlacement.ofTriangle(6, 3),
								BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)))));
		
	}
	
	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, MysticMinerals.id(name));
	}
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> 
					void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}
	
}
