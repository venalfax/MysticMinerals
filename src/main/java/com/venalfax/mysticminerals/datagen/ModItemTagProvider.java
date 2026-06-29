package com.venalfax.mysticminerals.datagen;

import java.util.concurrent.CompletableFuture;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.tags.ModTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

public class ModItemTagProvider extends ItemTagsProvider {

	public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider, MysticMinerals.MOD_ID);

	}

	@Override
	protected void addTags(HolderLookup.Provider registries) {
		tag(ModTags.Items.SHARPENABLE) 
			.add(Items.FLINT)
			.add(MineralItems.TEMPERED_FLINT.get());
		
		tag(ModTags.Items.EMERALD_CONVERTABLE)
			.add(Items.EMERALD);
		tag(ModTags.Items.RUBY_CONVERTABLE)
			.add(MineralItems.RUBY.get());
		tag(ModTags.Items.SAPPHIRE_CONVERTABLE)
			.add(MineralItems.SAPPHIRE.get());
		tag(ModTags.Items.AMETHYST_CONVERTABLE)
			.add(Items.AMETHYST_SHARD);
		tag(ModTags.Items.GARNET_CONVERTABLE)
			.add(MineralItems.GARNET_SHARD.get());
			
		
		tag(ModTags.Items.RUBY_REPAIRABLE)
			.add(MineralItems.RUBY.get());
		tag(ModTags.Items.SAPPHIRE_REPAIRABLE)
			.add(MineralItems.SAPPHIRE.get());
		tag(ModTags.Items.EMERALD_REPAIRABLE)
			.add(Items.EMERALD);
		tag(ModTags.Items.FLINT_REPAIRABLE)
			.add(Items.FLINT);
		tag(ModTags.Items.SHARPENED_FLINT_REPAIRABLE)
			.add(MineralItems.SHARPENED_FLINT.get());
		tag(ModTags.Items.TEMPERED_FLINT_REPAIRABLE)
			.add(MineralItems.TEMPERED_FLINT.get());
		
		/* TOOLS */
		
		tag(ItemTags.DURABILITY_ENCHANTABLE).add(MineralItems.CRYSTAL_RESONATOR.get());
				
		tag(ItemTags.SWORDS).add(MineralItems.RUBY_SWORD.get());
		tag(ItemTags.PICKAXES).add(MineralItems.RUBY_PICKAXE.get());
		tag(ItemTags.AXES).add(MineralItems.RUBY_AXE.get());
		tag(ItemTags.SHOVELS).add(MineralItems.RUBY_SHOVEL.get());
		tag(ItemTags.HOES).add(MineralItems.RUBY_HOE.get());
		tag(ItemTags.SPEARS).add(MineralItems.RUBY_SPEAR.get());
		
		tag(ItemTags.SWORDS).add(MineralItems.SAPPHIRE_SWORD.get());
		tag(ItemTags.PICKAXES).add(MineralItems.SAPPHIRE_PICKAXE.get());
		tag(ItemTags.AXES).add(MineralItems.SAPPHIRE_AXE.get());
		tag(ItemTags.SHOVELS).add(MineralItems.SAPPHIRE_SHOVEL.get());
		tag(ItemTags.HOES).add(MineralItems.SAPPHIRE_HOE.get());
		tag(ItemTags.SPEARS).add(MineralItems.SAPPHIRE_SPEAR.get());
		
		tag(ItemTags.SWORDS).add(MineralItems.EMERALD_SWORD.get());
		tag(ItemTags.PICKAXES).add(MineralItems.EMERALD_PICKAXE.get());
		tag(ItemTags.AXES).add(MineralItems.EMERALD_AXE.get());
		tag(ItemTags.SHOVELS).add(MineralItems.EMERALD_SHOVEL.get());
		tag(ItemTags.HOES).add(MineralItems.EMERALD_HOE.get());
		tag(ItemTags.SPEARS).add(MineralItems.EMERALD_SPEAR.get());
		
		tag(ItemTags.SWORDS).add(MineralItems.FLINT_SWORD.get());
		tag(ItemTags.PICKAXES).add(MineralItems.FLINT_PICKAXE.get());
		tag(ItemTags.AXES).add(MineralItems.FLINT_AXE.get());
		tag(ItemTags.SHOVELS).add(MineralItems.FLINT_SHOVEL.get());
		tag(ItemTags.HOES).add(MineralItems.FLINT_HOE.get());
		tag(ItemTags.SPEARS).add(MineralItems.FLINT_SPEAR.get());
		
		tag(ItemTags.SWORDS).add(MineralItems.SHARPENED_FLINT_SWORD.get());
		tag(ItemTags.PICKAXES).add(MineralItems.SHARPENED_FLINT_PICKAXE.get());
		tag(ItemTags.AXES).add(MineralItems.SHARPENED_FLINT_AXE.get());
		tag(ItemTags.SHOVELS).add(MineralItems.SHARPENED_FLINT_SHOVEL.get());
		tag(ItemTags.HOES).add(MineralItems.SHARPENED_FLINT_HOE.get());
		tag(ItemTags.SPEARS).add(MineralItems.SHARPENED_FLINT_SPEAR.get());
		
		/* ARMOR */
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.RUBY_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.RUBY_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(MineralItems.RUBY_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.RUBY_BOOTS.get());
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.SAPPHIRE_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.SAPPHIRE_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(MineralItems.SAPPHIRE_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.SAPPHIRE_BOOTS.get());
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.EMERALD_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.EMERALD_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(MineralItems.EMERALD_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.EMERALD_BOOTS.get());
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.FLINT_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.FLINT_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(MineralItems.FLINT_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.FLINT_BOOTS.get());
		
		tag(ItemTags.HEAD_ARMOR).add(MineralItems.TEMPERED_FLINT_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(MineralItems.TEMPERED_FLINT_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(MineralItems.TEMPERED_FLINT_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(MineralItems.TEMPERED_FLINT_BOOTS.get());
		
	}

}
