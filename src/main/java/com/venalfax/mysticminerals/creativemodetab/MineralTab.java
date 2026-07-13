package com.venalfax.mysticminerals.creativemodetab;

import java.util.function.Supplier;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MineralTab {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticMinerals.MOD_ID);
	
	public static final Supplier<CreativeModeTab> MYSTIC_MINERALS = CREATIVE_MODE_TABS.register("mystic_minerals_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(MineralItems.SHARPENED_FLINT.get()))
					.title(Component.translatable("creativetab.mysticminerals.mystic_minerals"))
					.displayItems((itemDisplayParameters, output) -> {
						
						/* ITEMS */
						
						output.accept(MineralItems.RUBY);
						output.accept(MineralItems.SAPPHIRE);
						output.accept(MineralItems.CITRINE_SHARD);
						output.accept(MineralItems.SHARPENED_FLINT);
						output.accept(MineralItems.TEMPERED_FLINT);
						
						/* CROPS */
						
						output.accept(MineralItems.IOLITE_BULB);
						output.accept(MineralItems.JASPEROOT);
						output.accept(MineralItems.SODALITE_LEAVES);
						output.accept(MineralItems.SODALITE_SEEDS);
						output.accept(MineralItems.ONYX_BERRIES);
						
						/* FOODS */
						
						output.accept(MineralItems.ROASTED_JASPEROOT);
						output.accept(MineralItems.CRYSTAL_DINNER);
						output.accept(MineralItems.RUBY_POTATO);
						output.accept(MineralItems.SAPPHIRE_STEW);
						output.accept(MineralItems.EMERALD_HONEY);

						/* TOOLS */

						output.accept(MineralItems.CRYSTAL_RESONATOR);
						output.accept(MineralItems.CRYSTAL_SCEPTER);
						
						output.accept(MineralItems.CRYSTAL_BOW);
						
						output.accept(MineralItems.RUBY_SWORD);
						output.accept(MineralItems.RUBY_PICKAXE);
						output.accept(MineralItems.RUBY_AXE);
						output.accept(MineralItems.RUBY_SHOVEL);
						output.accept(MineralItems.RUBY_HOE);
						output.accept(MineralItems.RUBY_SPEAR);	
						
						output.accept(MineralItems.SAPPHIRE_SWORD);
						output.accept(MineralItems.SAPPHIRE_PICKAXE);
						output.accept(MineralItems.SAPPHIRE_AXE);
						output.accept(MineralItems.SAPPHIRE_SHOVEL);
						output.accept(MineralItems.SAPPHIRE_HOE);
						output.accept(MineralItems.SAPPHIRE_SPEAR);	
						
						output.accept(MineralItems.EMERALD_SWORD);
						output.accept(MineralItems.EMERALD_PICKAXE);
						output.accept(MineralItems.EMERALD_AXE);
						output.accept(MineralItems.EMERALD_SHOVEL);
						output.accept(MineralItems.EMERALD_HOE);
						output.accept(MineralItems.EMERALD_SPEAR);	
						
						output.accept(MineralItems.FLINT_SWORD);
						output.accept(MineralItems.FLINT_PICKAXE);
						output.accept(MineralItems.FLINT_AXE);
						output.accept(MineralItems.FLINT_SHOVEL);
						output.accept(MineralItems.FLINT_HOE);
						output.accept(MineralItems.FLINT_SPEAR);
						
						output.accept(MineralItems.SHARPENED_FLINT_SWORD);
						output.accept(MineralItems.SHARPENED_FLINT_PICKAXE);
						output.accept(MineralItems.SHARPENED_FLINT_AXE);
						output.accept(MineralItems.SHARPENED_FLINT_SHOVEL);
						output.accept(MineralItems.SHARPENED_FLINT_HOE);
						output.accept(MineralItems.SHARPENED_FLINT_SPEAR);
						
						/* ARMOR */
						
						output.accept(MineralItems.RUBY_HELMET);
						output.accept(MineralItems.RUBY_CHESTPLATE);
						output.accept(MineralItems.RUBY_LEGGINGS);
						output.accept(MineralItems.RUBY_BOOTS);
						
						output.accept(MineralItems.SAPPHIRE_HELMET);
						output.accept(MineralItems.SAPPHIRE_CHESTPLATE);
						output.accept(MineralItems.SAPPHIRE_LEGGINGS);
						output.accept(MineralItems.SAPPHIRE_BOOTS);
						
						output.accept(MineralItems.EMERALD_HELMET);
						output.accept(MineralItems.EMERALD_CHESTPLATE);
						output.accept(MineralItems.EMERALD_LEGGINGS);
						output.accept(MineralItems.EMERALD_BOOTS);
						
						output.accept(MineralItems.FLINT_HELMET);
						output.accept(MineralItems.FLINT_CHESTPLATE);
						output.accept(MineralItems.FLINT_LEGGINGS);
						output.accept(MineralItems.FLINT_BOOTS);
						
						output.accept(MineralItems.TEMPERED_FLINT_HELMET);
						output.accept(MineralItems.TEMPERED_FLINT_CHESTPLATE);
						output.accept(MineralItems.TEMPERED_FLINT_LEGGINGS);
						output.accept(MineralItems.TEMPERED_FLINT_BOOTS);
						
						/* BLOCKS */
						
						output.accept(MineralBlocks.RUBY_BLOCK);
						output.accept(MineralBlocks.SAPPHIRE_BLOCK);
						output.accept(MineralBlocks.CITRINE_BLOCK);
						output.accept(MineralBlocks.BUDDING_CITRINE);
						output.accept(MineralBlocks.CITRINE_CLUSTER);
						output.accept(MineralBlocks.LARGE_CITRINE_BUD);
						output.accept(MineralBlocks.MEDIUM_CITRINE_BUD);
						output.accept(MineralBlocks.SMALL_CITRINE_BUD);
						output.accept(MineralBlocks.RUBY_ORE);
						output.accept(MineralBlocks.DEEPSLATE_RUBY_ORE);
						output.accept(MineralBlocks.SAPPHIRE_ORE);
						output.accept(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE);
						output.accept(MineralBlocks.FLINT_BLOCK);
						output.accept(MineralBlocks.SHARPENED_FLINT_BLOCK);
						output.accept(MineralBlocks.TEMPERED_FLINT_BLOCK);
						
						output.accept(MineralBlocks.CRYSTAL_RESEARCH_TABLE);
						output.accept(MineralBlocks.SHARPENER_BLOCK);
						output.accept(MineralBlocks.RESONANT_CONVERTER);
						output.accept(MineralBlocks.GEM_LAMP);
						output.accept(MineralBlocks.AMETHYST_PRESSURE_PLATE);
						
					})
					.build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
	
}
