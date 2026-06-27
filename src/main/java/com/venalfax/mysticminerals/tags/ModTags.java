package com.venalfax.mysticminerals.tags;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
	
	public static class Blocks{
		public static final TagKey<Block> CRYSTAL_RESONATORS = createTag("crystal_resonators");
		
		public static final TagKey<Block> NEEDS_MINERAL_TOOL = createTag("needs_mineral_tool");
		public static final TagKey<Block> INCORRECT_FOR_MINERAL_TOOL = createTag("incorrect_for_mineral_tool");
		public static final TagKey<Block> NEEDS_FLINT_TOOL = createTag("needs_flint_tool");
		public static final TagKey<Block> INCORRECT_FOR_FLINT_TOOL = createTag("incorrect_for_flint_tool");
		public static final TagKey<Block> NEEDS_SHARPENED_FLINT_TOOL = createTag("needs_sharpened_flint_tool");
		public static final TagKey<Block> INCORRECT_FOR_SHARPENED_FLINT_TOOL = createTag("incorrect_for_sharpened_flint_tool");
		
		private static TagKey<Block> createTag(String name) {
			return BlockTags.create(Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, name));
		}
	}
	
	public static class Items{
		public static final TagKey<Item> SHARPENABLE = createTag("sharpenable");
		
		public static final TagKey<Item> RUBY_REPAIRABLE = createTag("ruby_repairable");
		public static final TagKey<Item> SAPPHIRE_REPAIRABLE = createTag("sapphire_repairable");
		public static final TagKey<Item> EMERALD_REPAIRABLE = createTag("emerald_repairable");
		public static final TagKey<Item> FLINT_REPAIRABLE = createTag("flint_repairable");
		public static final TagKey<Item> SHARPENED_FLINT_REPAIRABLE = createTag("sharpened_flint_repairable");
		public static final TagKey<Item> TEMPERED_FLINT_REPAIRABLE = createTag("tempered_flint_repairable");
		
		private static TagKey<Item> createTag(String name) {
			return ItemTags.create(Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, name));
		}
	}
	
	
	
}
