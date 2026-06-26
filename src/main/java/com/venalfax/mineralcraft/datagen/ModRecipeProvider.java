package com.venalfax.mineralcraft.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.venalfax.mineralcraft.MineralCraft;
import com.venalfax.mineralcraft.blocks.MineralBlocks;
import com.venalfax.mineralcraft.items.MineralItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public class ModRecipeProvider extends RecipeProvider {

	public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
		super(registries, output);
	}

	public static class Runner extends RecipeProvider.Runner{

		public Runner(PackOutput packOutput, CompletableFuture<Provider> registries) {
			super(packOutput, registries);
		}
		
		@Override
		protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
			return new ModRecipeProvider(registries, output);
		}

		@Override
		public String getName() {
			return "MineralCraft Recipes";
		}
		
	}
	
	@Override
	protected void buildRecipes() {
		
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.RUBY_BLOCK.get())
			.pattern("RRR")
			.pattern("RRR")
			.pattern("RRR")
			.define('R', MineralItems.RUBY.get())
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY))
			.group("gem_block")
			.save(output);
		
		shapeless(RecipeCategory.MISC ,MineralItems.RUBY.get(), 9)
			.requires(MineralBlocks.RUBY_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.RUBY_BLOCK.get()), has(MineralBlocks.RUBY_BLOCK))
			.group("gem")
			.save(output);
		
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.SAPPHIRE_BLOCK.get())
			.pattern("SSS")
			.pattern("SSS")
			.pattern("SSS")
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE))
			.group("gem_block")
			.save(output);
	
		shapeless(RecipeCategory.MISC ,MineralItems.SAPPHIRE.get(), 9)
			.requires(MineralBlocks.SAPPHIRE_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.SAPPHIRE_BLOCK.get()), has(MineralBlocks.SAPPHIRE_BLOCK))
			.group("gem")
			.save(output);
		
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.GARNET_BLOCK.get())
			.pattern("GGG")
			.pattern("GGG")
			.pattern("GGG")
			.define('G', MineralItems.GARNET.get())
			.unlockedBy(getHasName(MineralItems.GARNET.get()), has(MineralItems.GARNET))
			.group("gem_block")
			.save(output);

		shapeless(RecipeCategory.MISC, MineralItems.GARNET, 9)
			.requires(MineralBlocks.GARNET_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.GARNET_BLOCK.get()), has(MineralBlocks.GARNET_BLOCK))
			.group("gem")
			.save(output);
	
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.FLINT_BLOCK.get())
			.pattern("FFF")
			.pattern("FFF")
			.pattern("FFF")
			.define('F', Items.FLINT)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.group("flint_block")
			.save(output);

		shapeless(RecipeCategory.MISC, Items.FLINT, 9)
			.requires(MineralBlocks.FLINT_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.FLINT_BLOCK.get()), has(MineralBlocks.FLINT_BLOCK))
			.group("flint_item")
			.save(output, MineralCraft.MOD_ID + ":" + getSimpleRecipeName(Items.FLINT));
		
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.SHARPENED_FLINT_BLOCK.get())
			.pattern("SSS")
			.pattern("SSS")
			.pattern("SSS")
			.define('S', MineralItems.SHARPENED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT))
			.group("flint_block")
			.save(output);
	
		shapeless(RecipeCategory.MISC ,MineralItems.SHARPENED_FLINT.get(), 9)
			.requires(MineralBlocks.SHARPENED_FLINT_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.SHARPENED_FLINT_BLOCK.get()), has(MineralBlocks.SHARPENED_FLINT_BLOCK))
			.group("flint_item")
			.save(output);
	
		shaped(RecipeCategory.BUILDING_BLOCKS, MineralBlocks.TEMPERED_FLINT_BLOCK.get())
			.pattern("TTT")
			.pattern("TTT")
			.pattern("TTT")
			.define('T', MineralItems.TEMPERED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.TEMPERED_FLINT.get()), has(MineralItems.TEMPERED_FLINT))
			.group("flint_block")
			.save(output);

		shapeless(RecipeCategory.MISC ,MineralItems.TEMPERED_FLINT.get(), 9)
			.requires(MineralBlocks.TEMPERED_FLINT_BLOCK)
			.unlockedBy(getHasName(MineralBlocks.TEMPERED_FLINT_BLOCK.get()), has(MineralBlocks.TEMPERED_FLINT_BLOCK))
			.group("flint_item")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.CRYSTAL_RESONATOR.get())
			.pattern(" GS")
			.pattern("GRG")
			.pattern("AG ")
			.define('G', Items.GOLD_INGOT)
			.define('R', Items.REDSTONE)
			.define('A', Items.AMETHYST_SHARD)
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE))
			.unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
			.unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
			.group("tools")
			.save(output);
		
		shaped(RecipeCategory.MISC, MineralBlocks.SHARPENER_BLOCK.get())
			.pattern("P P")
			.pattern("G G")
			.pattern("PIP")
			.define('P', ItemTags.PLANKS)
			.define('G', Blocks.GRINDSTONE)
			.define('I', Items.IRON_INGOT)
			.unlockedBy(getHasName(Blocks.GRINDSTONE), has(Blocks.GRINDSTONE))
			.unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
			.group("utility")
			.save(output);
		
		shaped(RecipeCategory.FOOD, MineralItems.RUBY_POTATO.get())
			.pattern(" R ")
			.pattern("RPR")
			.pattern(" R ")
			.define('R', MineralItems.RUBY.get())
			.define('P', Items.BAKED_POTATO)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("food")
			.save(output);

		shaped(RecipeCategory.FOOD, MineralItems.SAPPHIRE_STEW.get())
			.pattern(" S ")
			.pattern("SMS")
			.pattern(" S ")
			.define('S', MineralItems.SAPPHIRE.get())
			.define('M', Items.MUSHROOM_STEW)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.group("food")
			.save(output);

		shaped(RecipeCategory.FOOD, MineralItems.EMERALD_HONEY.get())
			.pattern(" E ")
			.pattern("EHE")
			.pattern(" E ")
			.define('E', Items.EMERALD)
			.define('H', Items.HONEY_BOTTLE)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("food")
			.save(output);
		
		shaped(RecipeCategory.REDSTONE, MineralBlocks.AMETHYST_PRESSURE_PLATE.get())
			.pattern("AA")
			.define('A', Blocks.AMETHYST_BLOCK)
			.unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
			.group("amethyst")
			.save(output);
		
		/* TOOLS */
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_SWORD.get())
			.pattern("R")
			.pattern("R")
			.pattern("S")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.RUBY_PICKAXE.get())
			.pattern("RRR")
			.pattern(" S ")
			.pattern(" S ")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.RUBY_AXE.get())
			.pattern("RR")
			.pattern("RS")
			.pattern(" S")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.RUBY_SHOVEL.get())
			.pattern("R")
			.pattern("S")
			.pattern("S")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
			
		shaped(RecipeCategory.TOOLS, MineralItems.RUBY_HOE.get())
			.pattern("RR")
			.pattern(" S")
			.pattern(" S")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_SPEAR.get())
			.pattern("  R")
			.pattern(" S ")
			.pattern("S  ")
			.define('R', MineralItems.RUBY.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("ruby")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_SWORD.get())
			.pattern("R")
			.pattern("R")
			.pattern("S")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.SAPPHIRE_PICKAXE.get())
			.pattern("RRR")
			.pattern(" S ")
			.pattern(" S ")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.SAPPHIRE_AXE.get())
			.pattern("RR")
			.pattern("RS")
			.pattern(" S")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.SAPPHIRE_SHOVEL.get())
			.pattern("R")
			.pattern("S")
			.pattern("S")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
			
		shaped(RecipeCategory.TOOLS, MineralItems.SAPPHIRE_HOE.get())
			.pattern("RR")
			.pattern(" S")
			.pattern(" S")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_SPEAR.get())
			.pattern("  R")
			.pattern(" S ")
			.pattern("S  ")
			.define('R', MineralItems.SAPPHIRE.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sapphire")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_SWORD.get())
			.pattern("F")
			.pattern("F")
			.pattern("S")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.EMERALD_PICKAXE.get())
			.pattern("FFF")
			.pattern(" S ")
			.pattern(" S ")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.EMERALD_AXE.get())
			.pattern("FF")
			.pattern("FS")
			.pattern(" S")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.EMERALD_SHOVEL.get())
			.pattern("F")
			.pattern("S")
			.pattern("S")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.EMERALD_HOE.get())
			.pattern("FF")
			.pattern(" S")
			.pattern(" S")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
	
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_SPEAR.get())
			.pattern("  F")
			.pattern(" S ")
			.pattern("S  ")
			.define('F', Items.EMERALD)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("emerald")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_SWORD.get())
			.pattern("F")
			.pattern("F")
			.pattern("S")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.FLINT_PICKAXE.get())
			.pattern("FFF")
			.pattern(" S ")
			.pattern(" S ")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.FLINT_AXE.get())
			.pattern("FF")
			.pattern("FS")
			.pattern(" S")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.FLINT_SHOVEL.get())
			.pattern("F")
			.pattern("S")
			.pattern("S")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.FLINT_HOE.get())
			.pattern("FF")
			.pattern(" S")
			.pattern(" S")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
	
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_SPEAR.get())
			.pattern("  F")
			.pattern(" S ")
			.pattern("S  ")
			.define('F', Items.FLINT)
			.define('S', Items.STICK)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("flint")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SHARPENED_FLINT_SWORD.get())
			.pattern("F")
			.pattern("F")
			.pattern("S")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.SHARPENED_FLINT_PICKAXE.get())
			.pattern("FFF")
			.pattern(" S ")
			.pattern(" S ")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.SHARPENED_FLINT_AXE.get())
			.pattern("FF")
			.pattern("FS")
			.pattern(" S")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
	
		shaped(RecipeCategory.TOOLS, MineralItems.SHARPENED_FLINT_SHOVEL.get())
			.pattern("F")
			.pattern("S")
			.pattern("S")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
		
		shaped(RecipeCategory.TOOLS, MineralItems.SHARPENED_FLINT_HOE.get())
			.pattern("FF")
			.pattern(" S")
			.pattern(" S")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
	
		shaped(RecipeCategory.COMBAT, MineralItems.SHARPENED_FLINT_SPEAR.get())
			.pattern("  F")
			.pattern(" S ")
			.pattern("S  ")
			.define('F', MineralItems.SHARPENED_FLINT.get())
			.define('S', Items.STICK)
			.unlockedBy(getHasName(MineralItems.SHARPENED_FLINT.get()), has(MineralItems.SHARPENED_FLINT.get()))
			.unlockedBy(getHasName(Items.STICK), has(Items.STICK))
			.group("sharpened_flint")
			.save(output);
		
		/* ARMOR */
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_HELMET.get())
			.pattern("RRR")
			.pattern("R R")
			.define('R', MineralItems.RUBY.get())
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("ruby_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_CHESTPLATE.get())
			.pattern("R R")
			.pattern("RRR")
			.pattern("RRR")
			.define('R', MineralItems.RUBY.get())
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("ruby_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_LEGGINGS.get())
			.pattern("RRR")
			.pattern("R R")
			.pattern("R R")
			.define('R', MineralItems.RUBY.get())
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("ruby_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.RUBY_BOOTS.get())
			.pattern("R R")
			.pattern("R R")
			.define('R', MineralItems.RUBY.get())
			.unlockedBy(getHasName(MineralItems.RUBY.get()), has(MineralItems.RUBY.get()))
			.group("ruby_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_HELMET.get())
			.pattern("SSS")
			.pattern("S S")
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.group("sapphire_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_CHESTPLATE.get())
			.pattern("S S")
			.pattern("SSS")
			.pattern("SSS")
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.group("sapphire_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_LEGGINGS.get())
			.pattern("SSS")
			.pattern("S S")
			.pattern("S S")
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.group("sapphire_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.SAPPHIRE_BOOTS.get())
			.pattern("S S")
			.pattern("S S")
			.define('S', MineralItems.SAPPHIRE.get())
			.unlockedBy(getHasName(MineralItems.SAPPHIRE.get()), has(MineralItems.SAPPHIRE.get()))
			.group("sapphire_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_HELMET.get())
			.pattern("EEE")
			.pattern("E E")
			.define('E', Items.EMERALD)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.group("emerald_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_CHESTPLATE.get())
			.pattern("E E")
			.pattern("EEE")
			.pattern("EEE")
			.define('E', Items.EMERALD)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.group("emerald_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_LEGGINGS.get())
			.pattern("EEE")
			.pattern("E E")
			.pattern("E E")
			.define('E', Items.EMERALD)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.group("emerald_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.EMERALD_BOOTS.get())
			.pattern("E E")
			.pattern("E E")
			.define('E', Items.EMERALD)
			.unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
			.group("emerald_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_HELMET.get())
			.pattern("FFF")
			.pattern("F F")
			.define('F', Items.FLINT)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.group("flint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_CHESTPLATE.get())
			.pattern("F F")
			.pattern("FFF")
			.pattern("FFF")
			.define('F', Items.FLINT)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.group("flint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_LEGGINGS.get())
			.pattern("FFF")
			.pattern("F F")
			.pattern("F F")
			.define('F', Items.FLINT)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.group("flint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.FLINT_BOOTS.get())
			.pattern("F F")
			.pattern("F F")
			.define('F', Items.FLINT)
			.unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
			.group("flint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.TEMPERED_FLINT_HELMET.get())
			.pattern("FFF")
			.pattern("F F")
			.define('F', MineralItems.TEMPERED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.TEMPERED_FLINT.get()), has(MineralItems.TEMPERED_FLINT.get()))
			.group("tflint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.TEMPERED_FLINT_CHESTPLATE.get())
			.pattern("F F")
			.pattern("FFF")
			.pattern("FFF")
			.define('F', MineralItems.TEMPERED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.TEMPERED_FLINT.get()), has(MineralItems.TEMPERED_FLINT.get()))
			.group("tflint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.TEMPERED_FLINT_LEGGINGS.get())
			.pattern("FFF")
			.pattern("F F")
			.pattern("F F")
			.define('F', MineralItems.TEMPERED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.TEMPERED_FLINT.get()), has(MineralItems.TEMPERED_FLINT.get()))
			.group("tflint_armor")
			.save(output);
		
		shaped(RecipeCategory.COMBAT, MineralItems.TEMPERED_FLINT_BOOTS.get())
			.pattern("F F")
			.pattern("F F")
			.define('F', MineralItems.TEMPERED_FLINT.get())
			.unlockedBy(getHasName(MineralItems.TEMPERED_FLINT.get()), has(MineralItems.TEMPERED_FLINT.get()))
			.group("tflint_armor")
			.save(output);
		
		/* Possible compacting drawer compatibility further testing needed
		nineBlockStorageRecipes(RecipeCategory.MISC, MineralItems.RUBY, RecipeCategory.BUILDING_BLOCKS, MineralBlocks.RUBY_BLOCK, 
			getSimpleRecipeName(MineralBlocks.RUBY_BLOCK), MineralCraft.MOD_ID + ":" + getSimpleRecipeName(MineralBlocks.RUBY_BLOCK), 
			getSimpleRecipeName(MineralItems.RUBY), MineralCraft.MOD_ID + ":" + getSimpleRecipeName(MineralItems.RUBY));
		*/
		
		List<ItemLike> RUBY_SMELTABLES = List.of(MineralBlocks.RUBY_ORE, MineralBlocks.DEEPSLATE_RUBY_ORE);
		List<ItemLike> SAPPHIRE_SMELTABLES = List.of(MineralBlocks.SAPPHIRE_ORE, MineralBlocks.DEEPSLATE_SAPPHIRE_ORE);
		List<ItemLike> FLINT_SMELTABLES = List.of(Items.FLINT);
		
		oreSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, MineralItems.RUBY, 0.25f, 200, "ruby");
		oreBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, MineralItems.RUBY, 0.25f, 100, "ruby");
		oreSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, MineralItems.SAPPHIRE, 0.25f, 200, "sapphire");
		oreBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, MineralItems.SAPPHIRE, 0.25f, 100, "sapphire");
		oreSmelting(FLINT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, MineralItems.TEMPERED_FLINT, 0.25f, 200, "tempered_flint");
	}
	
	 @Override
	 protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
			 														RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
	                                                                float experience, int cookingTime, String group, String fromDesc) {
	        for(ItemLike itemlike : smeltables) {
	            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
	                    .save(output, MineralCraft.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
	        }
	    }

}
