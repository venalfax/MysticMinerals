package com.venalfax.mysticminerals.worldgen.features;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class MineralsConfiguredFeatures {
	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		MineralsFeatures.GARNET_GEODE.setupConfigured(context);
	}
	
	public static ResourceKey<ConfiguredFeature<?, ?>> createConfiguredKey(String path) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, MysticMinerals.id(path));
	}
}
