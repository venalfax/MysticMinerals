package com.venalfax.mineralcraft;

import com.venalfax.mineralcraft.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MineralCraft.MOD_ID)
public class MineralCraftDataGen {
	@SubscribeEvent
	public static void gatherClientData(GatherDataEvent.Client event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		
		generator.addProvider(true, new ModModelProvider(packOutput));
		
		
		
	}
	
}
