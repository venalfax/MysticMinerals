package com.venalfax.mysticminerals.stat;

import java.util.function.Supplier;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MineralStats{
	public static final DeferredRegister<Identifier> MINERAL_STATS = 
			DeferredRegister.create(BuiltInRegistries.CUSTOM_STAT, MysticMinerals.MOD_ID);
	
	public static final Supplier<Identifier> GEMS_RESONATED = makeCustomStat("gems_resonated");
	
	private static Supplier<Identifier> makeCustomStat(String key) {
		Identifier statIdentifier = Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, key);
		return MINERAL_STATS.register(key, () -> statIdentifier);
	}
	
	public static void register(IEventBus eventBus) {
		MINERAL_STATS.register(eventBus);
	}
}
