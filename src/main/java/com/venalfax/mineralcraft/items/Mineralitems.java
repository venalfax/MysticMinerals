package com.venalfax.mineralcraft.items;

import com.venalfax.mineralcraft.MineralCraft;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Mineralitems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MineralCraft.MOD_ID);
	
	public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
	public static final DeferredItem<Item> SAPPHIRE = ITEMS.registerSimpleItem("sapphire");
	public static final DeferredItem<Item> SHARPENED_FLINT = ITEMS.registerSimpleItem("sharpened_flint");
	public static final DeferredItem<Item> TEMPERED_FLINT = ITEMS.registerSimpleItem("tempered_flint");
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
