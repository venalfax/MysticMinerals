package com.venalfax.mysticminerals.datagen.villager;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VillagerTradesTagsProvider;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;

public class ModVillagerTradeTags extends VillagerTradesTagsProvider {

	public ModVillagerTradeTags(PackOutput output, CompletableFuture<Provider> lookupProvider) {
		super(output, lookupProvider);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider registries) {
		getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_1)
			.add(TagEntry.element(ModVillagerTrades.FARMER_1_IOLITE_BULB_EMERALD.identifier()))
			.add(TagEntry.element(ModVillagerTrades.FARMER_1_JASPEROOT_EMERALD.identifier()))
			.add(TagEntry.element(ModVillagerTrades.FARMER_1_SODALITE_LEAVES_EMERALD.identifier()));
		
		getOrCreateRawBuilder(MineralTags.Trades.GEOLOGIST_LEVEL_1)
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_1_EMERALD_RUBY.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_1_EMERALD_SAPPHIRE.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_1_AMETHYST_EMERALD.identifier()));
		
		getOrCreateRawBuilder(MineralTags.Trades.GEOLOGIST_LEVEL_2)
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_2_EMERALD_GEM_LAMP.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_2_EMERALD_CITRINE_SHARD.identifier()));
		
		getOrCreateRawBuilder(MineralTags.Trades.GEOLOGIST_LEVEL_3)
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_3_EMERALD_CRYSTAL_RESONATOR.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_3_EMERALD_CRYSTAL_SCEPTER.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_3_EMERALD_CRYSTAL_BOW.identifier()));
		
		getOrCreateRawBuilder(MineralTags.Trades.GEOLOGIST_LEVEL_4)
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_BUDDING_AMETHYST.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_BUDDING_CITRINE.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_RUBY_ORE.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_SAPPHIRE_ORE.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_DEEPSLATE_RUBY_ORE.identifier()))
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_4_EMERALD_DEEPSLATE_SAPPHIRE_ORE.identifier()));
		
		getOrCreateRawBuilder(MineralTags.Trades.GEOLOGIST_LEVEL_5)
			.add(TagEntry.element(ModVillagerTrades.GEOLOGIST_5_EMERALD_CRYSTAL_RESONATOR.identifier()));
		
	}

}
