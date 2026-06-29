package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

public class ModDataMapProvider extends DataMapProvider {

	public ModDataMapProvider(PackOutput packOutput, CompletableFuture<Provider> lookupProvider) {
		super(packOutput, lookupProvider);

	}

	@Override
	protected void gather(Provider provider) {
		builder(NeoForgeDataMaps.FURNACE_FUELS)
			.add(MineralItems.GARNET_SHARD.getId(), new FurnaceFuel(3200), false)
			.add(MineralBlocks.GARNET_BLOCK.getId(), new FurnaceFuel(12800), false);
	}

}
