package com.venalfax.mysticminerals.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.datagen.villager.ModTradeSets;
import com.venalfax.mysticminerals.datagen.villager.ModVillagerTrades;
import com.venalfax.mysticminerals.worldgen.MineralBiomeModifiers;
import com.venalfax.mysticminerals.worldgen.MineralConfiguredFeatures;
import com.venalfax.mysticminerals.worldgen.MineralPlacedFeatures;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {

	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap)
			.add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap)
			.add(Registries.TRADE_SET, ModTradeSets::bootstrap)
			.add(Registries.CONFIGURED_FEATURE, MineralConfiguredFeatures::bootstrap)
			.add(Registries.PLACED_FEATURE, MineralPlacedFeatures::bootstrap)
			.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MineralBiomeModifiers::bootstrap);
	
	
	public ModDatapackProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries, BUILDER, Set.of(MysticMinerals.MOD_ID));
	}

}
