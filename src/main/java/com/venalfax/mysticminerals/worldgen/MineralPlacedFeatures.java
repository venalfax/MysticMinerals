package com.venalfax.mysticminerals.worldgen;

import java.util.List;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class MineralPlacedFeatures {
	
	public static final ResourceKey<PlacedFeature> RUBY_OVERWORLD_ORES_PLACED_KEY = registerKey("ruby_overworld_ores_placed");
	public static final ResourceKey<PlacedFeature> SAPPHIRE_OVERWORLD_ORES_PLACED_KEY = registerKey("sapphire_overworld_ores_placed");
	
	public static final ResourceKey<PlacedFeature> CITRINE_GEODE_PLACED_KEY = registerKey("citrine_geode_placed");
	
	public static final ResourceKey<PlacedFeature> ONYX_BERRY_BUSH_PLACED_KEY = registerKey("onyx_berry_bush_placed_key");
	
	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		
		var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
		
		register(context, RUBY_OVERWORLD_ORES_PLACED_KEY, configuredFeatures.getOrThrow(MineralConfiguredFeatures.RUBY_OVERWORLD_ORES_KEY),
				MineralOrePlacements.commonOrePlacement(8, 
						HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
		register(context, SAPPHIRE_OVERWORLD_ORES_PLACED_KEY, configuredFeatures.getOrThrow(MineralConfiguredFeatures.SAPPHIRE_OVERWORLD_ORES_KEY),
				MineralOrePlacements.commonOrePlacement(8, 
						HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
		
		register(context, CITRINE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(MineralConfiguredFeatures.CITRINE_GEODE_KEY),
				List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
		
		register(context, ONYX_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(MineralConfiguredFeatures.ONYX_BERRY_BUSH_KEY),
				List.of(RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		
	}
	
	private static ResourceKey<PlacedFeature> registerKey(String name) {
		return ResourceKey.create(Registries.PLACED_FEATURE, MysticMinerals.id(name));
	}
	
	private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
								Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

}
