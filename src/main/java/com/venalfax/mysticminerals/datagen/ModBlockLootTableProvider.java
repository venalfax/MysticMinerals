package com.venalfax.mysticminerals.datagen;

import java.util.Set;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

	public ModBlockLootTableProvider(HolderLookup.Provider registries) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
	}

	@Override
	protected void generate() {
		dropSelf(MineralBlocks.RUBY_BLOCK.get());
		dropSelf(MineralBlocks.SAPPHIRE_BLOCK.get());
		dropSelf(MineralBlocks.GARNET_BLOCK.get());
		dropSelf(MineralBlocks.FLINT_BLOCK.get());
		dropSelf(MineralBlocks.SHARPENED_FLINT_BLOCK.get());
		dropSelf(MineralBlocks.TEMPERED_FLINT_BLOCK.get());
		dropSelf(MineralBlocks.SHARPENER_BLOCK.get());
		dropSelf(MineralBlocks.GEM_LAMP.get());
		dropSelf(MineralBlocks.RESONANT_CONVERTER.get());
		dropSelf(MineralBlocks.AMETHYST_PRESSURE_PLATE.get());
		
		add(MineralBlocks.RUBY_ORE.get(), 
				createOreDrop(MineralBlocks.RUBY_ORE.get(), MineralItems.RUBY.get()));
		add(MineralBlocks.SAPPHIRE_ORE.get(), 
				createOreDrop(MineralBlocks.SAPPHIRE_ORE.get(), MineralItems.SAPPHIRE.get()));
		add(MineralBlocks.DEEPSLATE_RUBY_ORE.get(), 
				createOreDrop(MineralBlocks.DEEPSLATE_RUBY_ORE.get(), MineralItems.RUBY.get()));
		add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), 
				createOreDrop(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), MineralItems.SAPPHIRE.get()));
		
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks(){
		return MineralBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}

}
