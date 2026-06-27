package com.venalfax.mysticminerals.datagen;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.blocks.custom.GemLampBlock;
import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.items.ModArmorMaterials;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends ModelProvider {

	public ModModelProvider(PackOutput output) {
		super(output, MysticMinerals.MOD_ID);
	}
	
	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		
		/* ITEMS */
		
		itemModels.generateFlatItem(MineralItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.GARNET.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.TEMPERED_FLINT.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.CRYSTAL_RESONATOR.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.RUBY_POTATO.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_STEW.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(MineralItems.EMERALD_HONEY.get(), ModelTemplates.FLAT_ITEM);
		
		/* TOOLS */
		
		itemModels.generateFlatItem(MineralItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateSpear(MineralItems.RUBY_SPEAR.get());
		
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateSpear(MineralItems.SAPPHIRE_SPEAR.get());
		
		itemModels.generateFlatItem(MineralItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateSpear(MineralItems.EMERALD_SPEAR.get());
		
		itemModels.generateFlatItem(MineralItems.FLINT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.FLINT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.FLINT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.FLINT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.FLINT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateSpear(MineralItems.FLINT_SPEAR.get());
		
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateFlatItem(MineralItems.SHARPENED_FLINT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModels.generateSpear(MineralItems.SHARPENED_FLINT_SPEAR.get());
		
		/* ARMOR */
		
		itemModels.generateTrimmableItem(MineralItems.RUBY_HELMET.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
		itemModels.generateTrimmableItem(MineralItems.RUBY_CHESTPLATE.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
		itemModels.generateTrimmableItem(MineralItems.RUBY_LEGGINGS.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
		itemModels.generateTrimmableItem(MineralItems.RUBY_BOOTS.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

		itemModels.generateTrimmableItem(MineralItems.SAPPHIRE_HELMET.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
		itemModels.generateTrimmableItem(MineralItems.SAPPHIRE_CHESTPLATE.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
		itemModels.generateTrimmableItem(MineralItems.SAPPHIRE_LEGGINGS.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
		itemModels.generateTrimmableItem(MineralItems.SAPPHIRE_BOOTS.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
		
		itemModels.generateTrimmableItem(MineralItems.EMERALD_HELMET.get(), ModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
		itemModels.generateTrimmableItem(MineralItems.EMERALD_CHESTPLATE.get(), ModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
		itemModels.generateTrimmableItem(MineralItems.EMERALD_LEGGINGS.get(), ModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
		itemModels.generateTrimmableItem(MineralItems.EMERALD_BOOTS.get(), ModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
		
		itemModels.generateTrimmableItem(MineralItems.FLINT_HELMET.get(), ModArmorMaterials.FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
		itemModels.generateTrimmableItem(MineralItems.FLINT_CHESTPLATE.get(), ModArmorMaterials.FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
		itemModels.generateTrimmableItem(MineralItems.FLINT_LEGGINGS.get(), ModArmorMaterials.FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
		itemModels.generateTrimmableItem(MineralItems.FLINT_BOOTS.get(), ModArmorMaterials.FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
		
		itemModels.generateTrimmableItem(MineralItems.TEMPERED_FLINT_HELMET.get(), ModArmorMaterials.TEMPERED_FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
		itemModels.generateTrimmableItem(MineralItems.TEMPERED_FLINT_CHESTPLATE.get(), ModArmorMaterials.TEMPERED_FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
		itemModels.generateTrimmableItem(MineralItems.TEMPERED_FLINT_LEGGINGS.get(), ModArmorMaterials.TEMPERED_FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
		itemModels.generateTrimmableItem(MineralItems.TEMPERED_FLINT_BOOTS.get(), ModArmorMaterials.TEMPERED_FLINT_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
		
		/* BLOCKS */
		
		blockModels.createTrivialCube(MineralBlocks.RUBY_BLOCK.get());
		blockModels.createTrivialCube(MineralBlocks.SAPPHIRE_BLOCK.get());
		blockModels.createTrivialCube(MineralBlocks.GARNET_BLOCK.get());
		blockModels.createTrivialCube(MineralBlocks.RUBY_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.SAPPHIRE_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.GARNET_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.DEEPSLATE_RUBY_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.DEEPSLATE_GARNET_ORE.get());
		blockModels.createTrivialCube(MineralBlocks.FLINT_BLOCK.get());
		blockModels.createTrivialCube(MineralBlocks.SHARPENED_FLINT_BLOCK.get());
		blockModels.createTrivialCube(MineralBlocks.TEMPERED_FLINT_BLOCK.get());
		
		blockModels.createTrivialCube(MineralBlocks.SHARPENER_BLOCK.get());
		
		blockModels.blockStateOutput.accept(
				MultiVariantGenerator.dispatch(MineralBlocks.GEM_LAMP.get()).with(BlockModelGenerators.createBooleanModelDispatch(GemLampBlock.CLICKED,
						BlockModelGenerators.plainVariant(blockModels.createSuffixedVariant(MineralBlocks.GEM_LAMP.get(), "_on", ModelTemplates.CUBE_ALL, TextureMapping::cube)), 
						BlockModelGenerators.plainVariant(TexturedModel.CUBE.create(MineralBlocks.GEM_LAMP.get(), blockModels.modelOutput)))));
		
		blockModels.family(Blocks.AMETHYST_BLOCK)
			.pressurePlate(MineralBlocks.AMETHYST_PRESSURE_PLATE.get());
	}
	
	
	
}
