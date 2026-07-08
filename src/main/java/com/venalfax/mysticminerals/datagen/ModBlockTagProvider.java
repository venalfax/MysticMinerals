package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemIds;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class ModBlockTagProvider extends BlockTagsProvider{

	public ModBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
		super(output, lookupProvider, MysticMinerals.MOD_ID);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider) {
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.CITRINE_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.BUDDING_CITRINE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.CITRINE_CLUSTER.get()))
			.add(MineralBlocks.getRK(MineralBlocks.LARGE_CITRINE_BUD.get()))
			.add(MineralBlocks.getRK(MineralBlocks.MEDIUM_CITRINE_BUD.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SMALL_CITRINE_BUD.get()))
			.add(MineralBlocks.getRK(MineralBlocks.FLINT_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SHARPENED_FLINT_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.TEMPERED_FLINT_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.GEM_LAMP.get()))
			.add(MineralBlocks.getRK(MineralBlocks.RESONANT_CONVERTER.get()))
			.add(MineralBlocks.getRK(MineralBlocks.AMETHYST_PRESSURE_PLATE.get()));
		
		tag(BlockTags.MINEABLE_WITH_AXE)
			.add(MineralBlocks.getRK(MineralBlocks.SHARPENER_BLOCK.get()));
		
		tag(BlockTags.NEEDS_IRON_TOOL)
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.RESONANT_CONVERTER.get()));
		
		tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get()));
		
		tag(BlockTags.BEACON_BASE_BLOCKS)
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_BLOCK.get()));
		
		tag(MineralTags.Blocks.CRYSTAL_RESONATORS)
			.add(BlockItemIds.EMERALD_BLOCK.block())
			.add(BlockItemIds.EMERALD_ORE.block())
			.add(BlockItemIds.DEEPSLATE_EMERALD_ORE.block())
			.add(BlockItemIds.AMETHYST_BLOCK.block())
			.add(BlockItemIds.BUDDING_AMETHYST.block())
			.add(BlockItemIds.AMETHYST_CLUSTER.block())
			.add(BlockItemIds.LARGE_AMETHYST_BUD.block())
			.add(BlockItemIds.MEDIUM_AMETHYST_BUD.block())
			.add(BlockItemIds.SMALL_AMETHYST_BUD.block())
			.add(BlockItemIds.QUARTZ_BLOCK.block())
			.add(BlockItemIds.NETHER_QUARTZ_ORE.block())
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_RUBY_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.CITRINE_BLOCK.get()))
			.add(MineralBlocks.getRK(MineralBlocks.BUDDING_CITRINE.get()))
			.add(MineralBlocks.getRK(MineralBlocks.CITRINE_CLUSTER.get()))
			.add(MineralBlocks.getRK(MineralBlocks.LARGE_CITRINE_BUD.get()))
			.add(MineralBlocks.getRK(MineralBlocks.MEDIUM_CITRINE_BUD.get()))
			.add(MineralBlocks.getRK(MineralBlocks.SMALL_CITRINE_BUD.get()));
			
		tag(MineralTags.Blocks.NEEDS_MINERAL_TOOL)
			.addTag(BlockTags.NEEDS_DIAMOND_TOOL);
		
		tag(MineralTags.Blocks.INCORRECT_FOR_MINERAL_TOOL)
			.addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
			.remove(MineralTags.Blocks.NEEDS_MINERAL_TOOL);
		
		tag(MineralTags.Blocks.NEEDS_FLINT_TOOL)
			.addTag(BlockTags.NEEDS_STONE_TOOL);
	
		tag(MineralTags.Blocks.INCORRECT_FOR_FLINT_TOOL)
			.addTag(BlockTags.INCORRECT_FOR_STONE_TOOL)
			.remove(MineralTags.Blocks.NEEDS_FLINT_TOOL);
		
		tag(MineralTags.Blocks.NEEDS_SHARPENED_FLINT_TOOL)
			.addTag(BlockTags.NEEDS_IRON_TOOL);

		tag(MineralTags.Blocks.INCORRECT_FOR_SHARPENED_FLINT_TOOL)
			.addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
			.remove(MineralTags.Blocks.NEEDS_SHARPENED_FLINT_TOOL);
		
		tag(BlockTags.CROPS)
			.add(MineralBlocks.getRK(MineralBlocks.IOLITE_BULB_CROP.get()));
			
	}

}
