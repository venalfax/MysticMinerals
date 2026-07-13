package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class ModBlockTagProvider extends BlockTagsProvider{

	public ModBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
		super(output, lookupProvider, MysticMinerals.MOD_ID);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider) {
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(MineralBlocks.RUBY_BLOCK.get())
			.add(MineralBlocks.RUBY_ORE.get())
			.add(MineralBlocks.DEEPSLATE_RUBY_ORE.get())
			.add(MineralBlocks.SAPPHIRE_BLOCK.get())
			.add(MineralBlocks.SAPPHIRE_ORE.get())
			.add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
			.add(MineralBlocks.CITRINE_BLOCK.get())
			.add(MineralBlocks.BUDDING_CITRINE.get())
			.add(MineralBlocks.CITRINE_CLUSTER.get())
			.add(MineralBlocks.LARGE_CITRINE_BUD.get())
			.add(MineralBlocks.MEDIUM_CITRINE_BUD.get())
			.add(MineralBlocks.SMALL_CITRINE_BUD.get())
			.add(MineralBlocks.FLINT_BLOCK.get())
			.add(MineralBlocks.SHARPENED_FLINT_BLOCK.get())
			.add(MineralBlocks.TEMPERED_FLINT_BLOCK.get())
			.add(MineralBlocks.GEM_LAMP.get())
			.add(MineralBlocks.RESONANT_CONVERTER.get())
			.add(MineralBlocks.AMETHYST_PRESSURE_PLATE.get());
		
		tag(BlockTags.MINEABLE_WITH_AXE)
			.add(MineralBlocks.CRYSTAL_RESEARCH_TABLE.get())
			.add(MineralBlocks.SHARPENER_BLOCK.get());
		
		tag(BlockTags.NEEDS_IRON_TOOL)
			.add(MineralBlocks.RUBY_BLOCK.get())
			.add(MineralBlocks.RUBY_ORE.get())
			.add(MineralBlocks.DEEPSLATE_RUBY_ORE.get())
			.add(MineralBlocks.SAPPHIRE_BLOCK.get())
			.add(MineralBlocks.SAPPHIRE_ORE.get())
			.add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
			.add(MineralBlocks.RESONANT_CONVERTER.get());
		
		tag(BlockTags.STONE_ORE_REPLACEABLES)
			.add(MineralBlocks.RUBY_ORE.get())
			.add(MineralBlocks.SAPPHIRE_ORE.get());
		
		tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
			.add(MineralBlocks.DEEPSLATE_RUBY_ORE.get())
			.add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
		
		tag(BlockTags.BEACON_BASE_BLOCKS)
			.add(MineralBlocks.RUBY_BLOCK.get())
			.add(MineralBlocks.SAPPHIRE_BLOCK.get());
		
		tag(MineralTags.Blocks.CRYSTAL_RESONATORS)
			.add(Blocks.EMERALD_BLOCK)
			.add(Blocks.EMERALD_ORE)
			.add(Blocks.DEEPSLATE_EMERALD_ORE)
			.add(Blocks.AMETHYST_BLOCK)
			.add(Blocks.BUDDING_AMETHYST)
			.add(Blocks.AMETHYST_CLUSTER)
			.add(Blocks.LARGE_AMETHYST_BUD)
			.add(Blocks.MEDIUM_AMETHYST_BUD)
			.add(Blocks.SMALL_AMETHYST_BUD)
			.add(Blocks.QUARTZ_BLOCK)
			.add(Blocks.NETHER_QUARTZ_ORE)
			.add(MineralBlocks.RUBY_BLOCK.get())
			.add(MineralBlocks.RUBY_ORE.get())
			.add(MineralBlocks.DEEPSLATE_RUBY_ORE.get())
			.add(MineralBlocks.SAPPHIRE_BLOCK.get())
			.add(MineralBlocks.SAPPHIRE_ORE.get())
			.add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
			.add(MineralBlocks.CITRINE_BLOCK.get())
			.add(MineralBlocks.BUDDING_CITRINE.get())
			.add(MineralBlocks.CITRINE_CLUSTER.get())
			.add(MineralBlocks.LARGE_CITRINE_BUD.get())
			.add(MineralBlocks.MEDIUM_CITRINE_BUD.get())
			.add(MineralBlocks.SMALL_CITRINE_BUD.get());
			
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
			.add(MineralBlocks.IOLITE_BULB_CROP.get())
			.add(MineralBlocks.JASPEROOT_CROP.get())
			.add(MineralBlocks.SODALITE_CROP.get());
			
	}

}
