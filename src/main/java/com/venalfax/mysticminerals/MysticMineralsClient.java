package com.venalfax.mysticminerals;

import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = MysticMinerals.MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = MysticMinerals.MOD_ID, value = Dist.CLIENT)
public class MysticMineralsClient {
    public MysticMineralsClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        MysticMinerals.LOGGER.info("HELLO FROM CLIENT SETUP");
        MysticMinerals.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
    
    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
    	if(event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == MineralItems.CRYSTAL_BOW.get()) {
    		float fovModifier = 0.8f;
    		int ticksUsingItem = event.getPlayer().getTicksUsingItem();
    		float deltaTicks = (float)ticksUsingItem / 20f;
    		if(deltaTicks > 1f) {
    			deltaTicks = 1f;
    		} else {
    			deltaTicks *= deltaTicks;
    		}
    		
    		fovModifier *= 1f - deltaTicks * 0.15f;
    		event.setNewFovModifier(fovModifier);
    	}
    }
    
}
