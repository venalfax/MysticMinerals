package com.venalfax.mysticminerals;

import java.util.Collections;
import java.util.List;

import com.venalfax.mysticminerals.datagen.ModBlockLootTableProvider;
import com.venalfax.mysticminerals.datagen.ModBlockTagProvider;
import com.venalfax.mysticminerals.datagen.ModDataMapProvider;
import com.venalfax.mysticminerals.datagen.ModEquipmentAssetProvider;
import com.venalfax.mysticminerals.datagen.ModPaintingTagsProvider;
import com.venalfax.mysticminerals.datagen.ModDatapackProvider;
import com.venalfax.mysticminerals.datagen.ModItemTagProvider;
import com.venalfax.mysticminerals.datagen.ModModelProvider;
import com.venalfax.mysticminerals.datagen.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MysticMinerals.MOD_ID)
public class MysticMineralsDataGen {
	@SubscribeEvent
	public static void gatherClientData(GatherDataEvent.Client event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		
		var lookupProvider = event.getLookupProvider();
		
		generator.addProvider(true, new ModModelProvider(packOutput));
		generator.addProvider(true, new ModBlockTagProvider(packOutput, lookupProvider));
		generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
				List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
		
		generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
		generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));
		generator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider));
		
		generator.addProvider(true, new ModEquipmentAssetProvider(packOutput));
		generator.addProvider(true, new ModDatapackProvider(packOutput, lookupProvider));
		generator.addProvider(true, new ModPaintingTagsProvider(packOutput,lookupProvider));
		
	}
	
}
