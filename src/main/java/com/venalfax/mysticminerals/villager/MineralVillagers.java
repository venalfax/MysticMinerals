package com.venalfax.mysticminerals.villager;

import com.google.common.collect.ImmutableSet;
import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.datagen.villager.ModTradeSets;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MineralVillagers {
	
	public static final DeferredRegister<PoiType> POI_TYPES = 
			DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, MysticMinerals.MOD_ID);
	public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = 
			DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, MysticMinerals.MOD_ID);
	
	public static final Holder<PoiType> MINERALS_POI = POI_TYPES.register("minerals_poi",
			() -> new PoiType(ImmutableSet.copyOf(MineralBlocks.CRYSTAL_RESEARCH_TABLE.get().getStateDefinition().getPossibleStates()), 1, 1));
	/*
	public static final Holder<VillagerProfession> GEOLOGIST = VILLAGER_PROFESSIONS.register("geologist", 
			() -> new VillagerProfession(Component.literal("Geologist"), holder -> holder.is(MINERALS_POI),
					holder -> holder.is(MINERALS_POI), ImmutableSet.of(), ImmutableSet.of(),
					SoundType.AMETHYST_CLUSTER,  Int2ObjectMap.ofEntries(
							Int2ObjectMap.entry(1, ModTradeSets.GEOLOGIST_LEVEL_1),
							Int2ObjectMap.entry(2, ModTradeSets.GEOLOGIST_LEVEL_2),
							Int2ObjectMap.entry(3, ModTradeSets.GEOLOGIST_LEVEL_3),
							Int2ObjectMap.entry(4, ModTradeSets.GEOLOGIST_LEVEL_4),
							Int2ObjectMap.entry(5, ModTradeSets.GEOLOGIST_LEVEL_5))));
	*/
	
	public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
