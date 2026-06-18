package com.venalfax.mineralcraft;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.venalfax.mineralcraft.creativemodetab.ModTab;
import com.venalfax.mineralcraft.items.Mineralitems;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;



// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MineralCraft.MOD_ID)
public class MineralCraft {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mineralcraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MineralCraft(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        ModTab.register(modEventBus);
        
        Mineralitems.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    	if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
    		event.accept(Mineralitems.RUBY);
    		event.accept(Mineralitems.SAPPHIRE);
    		event.accept(Mineralitems.SHARPENED_FLINT);
    		event.accept(Mineralitems.TEMPERED_FLINT);
    	}
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        
    }
}