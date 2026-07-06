package com.venalfax.mysticminerals.datagen;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ModPoiTypesProvider {
	
	public static final ResourceKey<PoiType> GEOLOGIST = createKey("geologist");
	
	private static ResourceKey<PoiType> createKey(final String id) {
        return ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, id));
    }
	
	private static PoiType register(Registry<PoiType> registry, ResourceKey<PoiType> id, Set<BlockState> matchingStates, int maxTickets, int validRange) {
        PoiType value = new PoiType(matchingStates, maxTickets, validRange);
        Registry.register(registry, id, value);
        return value;
    }
	
	private static Set<BlockState> getBlockStates(Block block) {
        return ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates());
    }
	
	public static PoiType bootstrap(Registry<PoiType> registry) {
		register(registry, GEOLOGIST, getBlockStates(MineralBlocks.RESONANT_CONVERTER.get()), 1, 1);
		return register(registry, GEOLOGIST, null, 0, 0);
	}
	
}
