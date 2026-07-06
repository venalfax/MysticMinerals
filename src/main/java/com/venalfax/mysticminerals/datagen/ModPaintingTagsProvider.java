package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.tags.TagEntry;

public class ModPaintingTagsProvider extends PaintingVariantTagsProvider {

	public ModPaintingTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
		super(output, lookupProvider, MysticMinerals.MOD_ID);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider registries) {
		getOrCreateRawBuilder(PaintingVariantTags.PLACEABLE)
			.add(TagEntry.optionalElement(ModPaintings.CRYSTAL_FORGE_KEY.identifier()));
	}
	
}
