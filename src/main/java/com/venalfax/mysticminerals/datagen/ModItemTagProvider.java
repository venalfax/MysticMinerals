package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

public class ModItemTagProvider extends ItemTagsProvider {

	public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider, MysticMinerals.MOD_ID);

	}

	@Override
	protected void addTags(HolderLookup.Provider registries) {
		tag(MineralTags.Items.SHARPENABLE) 
			.add(ItemIds.FLINT)
			.add(MineralItems.getRK(MineralItems.TEMPERED_FLINT.get()));
		
		tag(MineralTags.Items.EMERALD_CONVERTABLE)
			.add(ItemIds.EMERALD);
		tag(MineralTags.Items.RUBY_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.RUBY.get()));
		tag(MineralTags.Items.SAPPHIRE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.SAPPHIRE.get()));
		tag(MineralTags.Items.AMETHYST_CONVERTABLE)
			.add(ItemIds.AMETHYST_SHARD);
		tag(MineralTags.Items.CITRINE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.CITRINE_SHARD.get()));
		
		tag(MineralTags.Items.EMERALD_ORE_CONVERTABLE)
			.add(BlockItemIds.EMERALD_ORE.item());
		tag(MineralTags.Items.RUBY_ORE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.RUBY_ORE.get()));
		tag(MineralTags.Items.SAPPHIRE_ORE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.SAPPHIRE_ORE.get()));
		tag(MineralTags.Items.DEEPSLATE_EMERALD_ORE_CONVERTABLE)
			.add(BlockItemIds.DEEPSLATE_EMERALD_ORE.item());
		tag(MineralTags.Items.DEEPSLATE_RUBY_ORE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.DEEPSLATE_RUBY_ORE.get()));
		tag(MineralTags.Items.DEEPSLATE_SAPPHIRE_ORE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.DEEPSLATE_SAPPHIRE_ORE.get()));
		tag(MineralTags.Items.AMETHYST_BLOCK_CONVERTABLE)
			.add(BlockItemIds.AMETHYST_BLOCK.item());
		tag(MineralTags.Items.CITRINE_BLOCK_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.CITRINE_BLOCK.get()));
		tag(MineralTags.Items.BUDDING_AMETHYST_CONVERTABLE)
			.add(BlockItemIds.BUDDING_AMETHYST.item());
		tag(MineralTags.Items.BUDDING_CITRINE_CONVERTABLE)
			.add(MineralItems.getRK(MineralItems.BUDDING_CITRINE.get()));
		
		tag(MineralTags.Items.RUBY_REPAIRABLE)
			.add(MineralItems.getRK(MineralItems.RUBY.get()));
		tag(MineralTags.Items.SAPPHIRE_REPAIRABLE)
			.add(MineralItems.getRK(MineralItems.SAPPHIRE.get()));
		tag(MineralTags.Items.EMERALD_REPAIRABLE)
			.add(ItemIds.EMERALD);
		tag(MineralTags.Items.FLINT_REPAIRABLE)
			.add(ItemIds.FLINT);
		tag(MineralTags.Items.SHARPENED_FLINT_REPAIRABLE)
			.add(MineralItems.getRK(MineralItems.SHARPENED_FLINT.get()));
		tag(MineralTags.Items.TEMPERED_FLINT_REPAIRABLE)
			.add(MineralItems.getRK(MineralItems.TEMPERED_FLINT.get()));
		
		/* TOOLS */
		
		tag(ItemTags.DURABILITY_ENCHANTABLE).add(MineralItems.getRK(MineralItems.CRYSTAL_RESONATOR.get()));
		tag(ItemTags.DURABILITY_ENCHANTABLE).add(MineralItems.getRK(MineralItems.RUBY_SCEPTER.get()));
		
		tag(ItemTags.BOW_ENCHANTABLE).add(MineralItems.getRK(MineralItems.CRYSTAL_BOW.get()));
		
		tag(ItemTags.BREWING_FUEL).add(MineralItems.getRK(MineralItems.CITRINE_SHARD.get()));
		tag(ItemTags.FURNACE_MINECART_FUEL).add(MineralItems.getRK(MineralItems.CITRINE_SHARD.get()));
		tag(ItemTags.DUPLICATES_ALLAYS).add(MineralItems.getRK(MineralItems.CITRINE_SHARD.get()));
		
		tag(ItemTags.SWORDS).add(MineralItems.getRK(MineralItems.RUBY_SWORD.get()));
		tag(ItemTags.PICKAXES).add(MineralItems.getRK(MineralItems.RUBY_PICKAXE.get()));
		tag(ItemTags.AXES).add(MineralItems.getRK(MineralItems.RUBY_AXE.get()));
		tag(ItemTags.SHOVELS).add(MineralItems.getRK(MineralItems.RUBY_SHOVEL.get()));
		tag(ItemTags.HOES).add(MineralItems.getRK(MineralItems.RUBY_HOE.get()));
		tag(ItemTags.SPEARS).add(MineralItems.getRK(MineralItems.RUBY_SPEAR.get()));
		
		tag(ItemTags.SWORDS).add(MineralItems.getRK(MineralItems.SAPPHIRE_SWORD.get()));
		tag(ItemTags.PICKAXES).add(MineralItems.getRK(MineralItems.SAPPHIRE_PICKAXE.get()));
		tag(ItemTags.AXES).add(MineralItems.getRK(MineralItems.SAPPHIRE_AXE.get()));
		tag(ItemTags.SHOVELS).add(MineralItems.getRK(MineralItems.SAPPHIRE_SHOVEL.get()));
		tag(ItemTags.HOES).add(MineralItems.getRK(MineralItems.SAPPHIRE_HOE.get()));
		tag(ItemTags.SPEARS).add(MineralItems.getRK(MineralItems.SAPPHIRE_SPEAR.get()));
		
		tag(ItemTags.SWORDS).add(MineralItems.getRK(MineralItems.EMERALD_SWORD.get()));
		tag(ItemTags.PICKAXES).add(MineralItems.getRK(MineralItems.EMERALD_PICKAXE.get()));
		tag(ItemTags.AXES).add(MineralItems.getRK(MineralItems.EMERALD_AXE.get()));
		tag(ItemTags.SHOVELS).add(MineralItems.getRK(MineralItems.EMERALD_SHOVEL.get()));
		tag(ItemTags.HOES).add(MineralItems.getRK(MineralItems.EMERALD_HOE.get()));
		tag(ItemTags.SPEARS).add(MineralItems.getRK(MineralItems.EMERALD_SPEAR.get()));
		
		tag(ItemTags.SWORDS).add(MineralItems.getRK(MineralItems.FLINT_SWORD.get()));
		tag(ItemTags.PICKAXES).add(MineralItems.getRK(MineralItems.FLINT_PICKAXE.get()));
		tag(ItemTags.AXES).add(MineralItems.getRK(MineralItems.FLINT_AXE.get()));
		tag(ItemTags.SHOVELS).add(MineralItems.getRK(MineralItems.FLINT_SHOVEL.get()));
		tag(ItemTags.HOES).add(MineralItems.getRK(MineralItems.FLINT_HOE.get()));
		tag(ItemTags.SPEARS).add(MineralItems.getRK(MineralItems.FLINT_SPEAR.get()));
		
		tag(ItemTags.SWORDS).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_SWORD.get()));
		tag(ItemTags.PICKAXES).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_PICKAXE.get()));
		tag(ItemTags.AXES).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_AXE.get()));
		tag(ItemTags.SHOVELS).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_SHOVEL.get()));
		tag(ItemTags.HOES).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_HOE.get()));
		tag(ItemTags.SPEARS).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_SPEAR.get()));
		
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(MineralItems.getRK(MineralItems.RUBY_PICKAXE.get()));
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(MineralItems.getRK(MineralItems.SAPPHIRE_PICKAXE.get()));
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(MineralItems.getRK(MineralItems.EMERALD_PICKAXE.get()));
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(MineralItems.getRK(MineralItems.FLINT_PICKAXE.get()));
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(MineralItems.getRK(MineralItems.SHARPENED_FLINT_PICKAXE.get()));
		
		/* ARMOR */
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.getRK(MineralItems.RUBY_HELMET.get()));
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.getRK(MineralItems.RUBY_CHESTPLATE.get()));
		tag(ItemTags.LEG_ARMOR).add(MineralItems.getRK(MineralItems.RUBY_LEGGINGS.get()));
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.getRK(MineralItems.RUBY_BOOTS.get()));
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.getRK(MineralItems.SAPPHIRE_HELMET.get()));
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.getRK(MineralItems.SAPPHIRE_CHESTPLATE.get()));
		tag(ItemTags.LEG_ARMOR).add(MineralItems.getRK(MineralItems.SAPPHIRE_LEGGINGS.get()));
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.getRK(MineralItems.SAPPHIRE_BOOTS.get()));
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.getRK(MineralItems.EMERALD_HELMET.get()));
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.getRK(MineralItems.EMERALD_CHESTPLATE.get()));
		tag(ItemTags.LEG_ARMOR).add(MineralItems.getRK(MineralItems.EMERALD_LEGGINGS.get()));
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.getRK(MineralItems.EMERALD_BOOTS.get()));
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.getRK(MineralItems.FLINT_HELMET.get()));
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.getRK(MineralItems.FLINT_CHESTPLATE.get()));
		tag(ItemTags.LEG_ARMOR).add(MineralItems.getRK(MineralItems.FLINT_LEGGINGS.get()));
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.getRK(MineralItems.FLINT_BOOTS.get()));
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.getRK(MineralItems.TEMPERED_FLINT_HELMET.get()));
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.getRK(MineralItems.TEMPERED_FLINT_CHESTPLATE.get()));
		tag(ItemTags.LEG_ARMOR).add(MineralItems.getRK(MineralItems.TEMPERED_FLINT_LEGGINGS.get()));
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.getRK(MineralItems.TEMPERED_FLINT_BOOTS.get()));
		
	}

}
