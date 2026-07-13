package com.venalfax.mysticminerals.worldgen;

import java.util.List;

import net.minecraft.world.level.levelgen.placement.*;

public class MineralOrePlacements {
	
	public static List<PlacementModifier> orePlacement(PlacementModifier frequencyModifier, PlacementModifier heightRange) {
        return List.of(frequencyModifier, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int rarity, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(rarity), heightRange);
    }

}
