package com.venalfax.mysticminerals.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {

	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap);
	
	public ModDatapackProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries, BUILDER, Set.of(MysticMinerals.MOD_ID));
	}

}
