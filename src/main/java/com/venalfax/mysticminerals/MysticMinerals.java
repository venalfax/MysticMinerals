package com.venalfax.mysticminerals;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.creativemodetab.MineralTab;
import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.stat.MineralStats;

import net.minecraft.resources.Identifier;
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

@Mod(MysticMinerals.MOD_ID)
public class MysticMinerals {
    public static final String MOD_ID = "mysticminerals";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public static Identifier id(String name) {
		return Identifier.fromNamespaceAndPath(MOD_ID, name);    	
    }

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MysticMinerals(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        MineralTab.register(modEventBus);
        
        MineralItems.register(modEventBus);
        MineralBlocks.register(modEventBus);
        
        MineralStats.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    	
    	if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
    		event.accept(MineralItems.RUBY);
    		event.accept(MineralItems.SAPPHIRE);
    		event.accept(MineralItems.CITRINE_SHARD);
    		event.accept(MineralItems.SHARPENED_FLINT);
    		event.accept(MineralItems.TEMPERED_FLINT);
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
    		event.accept(MineralBlocks.RUBY_BLOCK);
    		event.accept(MineralBlocks.SAPPHIRE_BLOCK);
    		event.accept(MineralBlocks.CITRINE_BLOCK);
    		event.accept(MineralBlocks.FLINT_BLOCK);
    		event.accept(MineralBlocks.SHARPENED_FLINT_BLOCK);
    		event.accept(MineralBlocks.TEMPERED_FLINT_BLOCK);
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
    		event.accept(MineralBlocks.CITRINE_BLOCK);
    		event.accept(MineralBlocks.BUDDING_CITRINE);
    		event.accept(MineralBlocks.CITRINE_CLUSTER);
    		event.accept(MineralBlocks.LARGE_CITRINE_BUD);
    		event.accept(MineralBlocks.MEDIUM_CITRINE_BUD);
    		event.accept(MineralBlocks.SMALL_CITRINE_BUD);
    		event.accept(MineralBlocks.RUBY_ORE);
    		event.accept(MineralBlocks.SAPPHIRE_ORE);
    		event.accept(MineralBlocks.DEEPSLATE_RUBY_ORE);
    		event.accept(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE);
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
    		event.accept(MineralItems.CRYSTAL_RESONATOR);
    		event.accept(MineralItems.RUBY_SCEPTER);
    		
    		event.accept(MineralItems.RUBY_SHOVEL);
    		event.accept(MineralItems.RUBY_PICKAXE);
    		event.accept(MineralItems.RUBY_AXE);
    		event.accept(MineralItems.RUBY_HOE);
    		
    		event.accept(MineralItems.SAPPHIRE_SHOVEL);
    		event.accept(MineralItems.SAPPHIRE_PICKAXE);
    		event.accept(MineralItems.SAPPHIRE_AXE);
    		event.accept(MineralItems.SAPPHIRE_HOE);
    		
    		event.accept(MineralItems.EMERALD_SHOVEL);
    		event.accept(MineralItems.EMERALD_PICKAXE);
    		event.accept(MineralItems.EMERALD_AXE);
    		event.accept(MineralItems.EMERALD_HOE);
    		
    		event.accept(MineralItems.FLINT_SHOVEL);
    		event.accept(MineralItems.FLINT_PICKAXE);
    		event.accept(MineralItems.FLINT_AXE);
    		event.accept(MineralItems.FLINT_HOE);
    		
    		event.accept(MineralItems.SHARPENED_FLINT_SHOVEL);
    		event.accept(MineralItems.SHARPENED_FLINT_PICKAXE);
    		event.accept(MineralItems.SHARPENED_FLINT_AXE);
    		event.accept(MineralItems.SHARPENED_FLINT_HOE);    		
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.COMBAT) {
    		event.accept(MineralItems.RUBY_SWORD);
    		event.accept(MineralItems.SAPPHIRE_SWORD);
    		event.accept(MineralItems.EMERALD_SWORD);
    		event.accept(MineralItems.FLINT_SWORD);
    		event.accept(MineralItems.SHARPENED_FLINT_SWORD);
    		
    		event.accept(MineralItems.RUBY_SPEAR);
    		event.accept(MineralItems.SAPPHIRE_SPEAR);
    		event.accept(MineralItems.EMERALD_SPEAR);
    		event.accept(MineralItems.FLINT_SPEAR);
    		event.accept(MineralItems.SHARPENED_FLINT_SPEAR);
    		
    		event.accept(MineralItems.RUBY_AXE);
    		event.accept(MineralItems.SAPPHIRE_AXE);
    		event.accept(MineralItems.EMERALD_AXE);
    		event.accept(MineralItems.FLINT_AXE);
    		event.accept(MineralItems.SHARPENED_FLINT_AXE);
    		
    		event.accept(MineralItems.CRYSTAL_BOW);
    		
    		event.accept(MineralItems.RUBY_HELMET);
    		event.accept(MineralItems.RUBY_CHESTPLATE);
    		event.accept(MineralItems.RUBY_LEGGINGS);
    		event.accept(MineralItems.RUBY_BOOTS);
    		
    		event.accept(MineralItems.SAPPHIRE_HELMET);
    		event.accept(MineralItems.SAPPHIRE_CHESTPLATE);
    		event.accept(MineralItems.SAPPHIRE_LEGGINGS);
    		event.accept(MineralItems.SAPPHIRE_BOOTS);
    		
    		event.accept(MineralItems.EMERALD_HELMET);
    		event.accept(MineralItems.EMERALD_CHESTPLATE);
    		event.accept(MineralItems.EMERALD_LEGGINGS);
    		event.accept(MineralItems.EMERALD_BOOTS);
    		
    		event.accept(MineralItems.FLINT_HELMET);
    		event.accept(MineralItems.FLINT_CHESTPLATE);
    		event.accept(MineralItems.FLINT_LEGGINGS);
    		event.accept(MineralItems.FLINT_BOOTS);
    		
    		event.accept(MineralItems.TEMPERED_FLINT_HELMET);
    		event.accept(MineralItems.TEMPERED_FLINT_CHESTPLATE);
    		event.accept(MineralItems.TEMPERED_FLINT_LEGGINGS);
    		event.accept(MineralItems.TEMPERED_FLINT_BOOTS);
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
    		event.accept(MineralItems.IOLITE_BULB);
    		event.accept(MineralItems.RUBY_POTATO);
    		event.accept(MineralItems.SAPPHIRE_STEW);
    		event.accept(MineralItems.EMERALD_HONEY);
    	}
    	
    	if(event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
    		event.accept(MineralBlocks.GEM_LAMP);
    		event.accept(MineralBlocks.AMETHYST_PRESSURE_PLATE);
    	}
    	
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        
    }
}