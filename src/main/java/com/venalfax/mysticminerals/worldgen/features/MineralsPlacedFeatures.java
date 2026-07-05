package com.venalfax.mysticminerals.worldgen.features;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MineralsPlacedFeatures {
	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		MineralsFeatures.GARNET_GEODE.setupPlaced(context, 2, 6, 30);
	}
	
	public static ResourceKey<PlacedFeature> createPlacedKey(String path) {
		return ResourceKey.create(Registries.PLACED_FEATURE, MysticMinerals.id(path));
	}

}
