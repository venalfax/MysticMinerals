package com.venalfax.mysticminerals.datagen;

import java.util.function.Predicate;

import com.venalfax.mysticminerals.MysticMinerals;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;

public class ModProfessions {

	public static final ResourceKey<VillagerProfession> GEOLOGIST_KEY = create("geologist");
	/* *
	public static void bootstrap(BootstrapContext<VillagerProfession> context) {
		register(context, GEOLOGIST_KEY);
	}
	/* */
	private static ResourceKey<VillagerProfession> create(final String id) {
		return ResourceKey.create(Registries.VILLAGER_PROFESSION, Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, id));
	}
	/* *
	private static void register(final BootstrapContext<VillagerProfession> context, final ResourceKey<VillagerProfession> name, Registry<VillagerProfession> registry, 
								Predicate<Holder<PoiType>> acquirableJobSite) {
		return Registry.register(
				registry, 
				name,
				new VillagerProfession(
						Component.translatable("entity." + name.identifier().getNamespace() +  ".villager." + name.identifier().getPath()),
						acquirableJobSite));
	}
	/* *
	public static VillagerProfession bootstrap(Registry<VillagerProfession> registry) {
		register(
			registry,
			GEOLOGIST_KEY,
			ModPoiTypesProvider.GEOLOGIST);
	}
	/* */
}
