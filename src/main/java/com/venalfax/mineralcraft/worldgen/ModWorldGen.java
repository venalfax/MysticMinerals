package com.venalfax.mineralcraft.worldgen;

import com.venalfax.mineralcraft.MineralCraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModWorldGen {

	public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE = configuredFeatureKey("ruby_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = configuredFeatureKey("sapphire_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GARNET_ORE = configuredFeatureKey("garnet_ore");
	
	public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED = placedFeatureKey("ruby_ore");
	public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED = placedFeatureKey("sapphire_ore");
	public static final ResourceKey<PlacedFeature> GARNET_ORE_PLACED = placedFeatureKey("garnet_ore");
	
	private ModWorldGen() {
		
		
	}
	
	public static void load() {
		
	}
	
	private static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, MineralCraft.id(name));
	}
	
	private static ResourceKey<PlacedFeature> placedFeatureKey(String name) {
		return ResourceKey.create(Registries.PLACED_FEATURE, MineralCraft.id(name));
	}
	
}
