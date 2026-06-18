package com.venalfax.mineralcraft.creativemodetab;

import java.util.function.Supplier;

import com.venalfax.mineralcraft.MineralCraft;
import com.venalfax.mineralcraft.items.Mineralitems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTab {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineralCraft.MOD_ID);
	
	public static final Supplier<CreativeModeTab> MINERAL_CRAFT = CREATIVE_MODE_TABS.register("mineral_craft_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(Mineralitems.SHARPENED_FLINT.get()))
					.title(Component.translatable("creativetab.mineralcraft.mineral_craft"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(Mineralitems.RUBY);
						output.accept(Mineralitems.SAPPHIRE);
					})
					.build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
