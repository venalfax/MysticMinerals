package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

public class ModDataMapProvider extends DataMapProvider {

	public ModDataMapProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	@Override
	protected void gather(Provider provider) {
		
		builder(NeoForgeDataMaps.FURNACE_FUELS)
			.add(MineralItems.CITRINE_SHARD.getId(), new FurnaceFuel(3200), false)
			.add(MineralBlocks.CITRINE_BLOCK.getId(), new FurnaceFuel(12800), false);
		
		builder(NeoForgeDataMaps.COMPOSTABLES)
			.add(MineralItems.IOLITE_BULB.getId(), new Compostable(0.65f), false)
			.add(MineralItems.JASPEROOT.getId(), new Compostable(0.65f), false)
			.add(MineralItems.SODALITE_LEAVES.getId(), new Compostable(0.65f), false)
			.add(MineralItems.SODALITE_SEEDS.getId(), new Compostable(0.3f), false)
			.add(MineralItems.ONYX_BERRIES.getId(), new Compostable(0.3f), false);
		
	}

}
