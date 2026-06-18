package com.venalfax.mineralcraft.datagen;

import com.venalfax.mineralcraft.MineralCraft;
import com.venalfax.mineralcraft.items.Mineralitems;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

	public ModModelProvider(PackOutput output) {
		super(output, MineralCraft.MOD_ID);
	}
	
	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		itemModels.generateFlatItem(Mineralitems.RUBY.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(Mineralitems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(Mineralitems.SHARPENED_FLINT.get(), ModelTemplates.FLAT_ITEM);
		itemModels.generateFlatItem(Mineralitems.TEMPERED_FLINT.get(), ModelTemplates.FLAT_ITEM);
	}
	
	
	
}
