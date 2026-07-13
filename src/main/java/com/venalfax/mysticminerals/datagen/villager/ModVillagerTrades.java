package com.venalfax.mysticminerals.datagen.villager;

import java.util.List;
import java.util.Optional;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;

public class ModVillagerTrades {
	
	public static final ResourceKey<VillagerTrade> FARMER_1_IOLITE_BULB_EMERALD = createKey("farmer/1/iolite_bulb_emerald");
	public static final ResourceKey<VillagerTrade> FARMER_1_JASPEROOT_EMERALD = createKey("farmer/1/jasperoot_emerald");
	public static final ResourceKey<VillagerTrade> FARMER_1_SODALITE_LEAVES_EMERALD = createKey("farmer/1/sodalite_leaves_emerald");
	
	public static final ResourceKey<VillagerTrade> GEOLOGIST_1_EMERALD_RUBY = createKey("geologist/1/emerald_ruby");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_1_EMERALD_SAPPHIRE = createKey("geologist/1/emerald_sapphire");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_1_AMETHYST_EMERALD = createKey("geologist/1/amethyst_emerald");
	
	public static final ResourceKey<VillagerTrade> GEOLOGIST_2_EMERALD_GEM_LAMP = createKey("geologist/2/emerald_gem_lamp");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_2_EMERALD_CITRINE_SHARD = createKey("geologist/2/emerald_citrine_shard");
	
	public static final ResourceKey<VillagerTrade> GEOLOGIST_3_EMERALD_CRYSTAL_RESONATOR = createKey("geologist/3/emerald_crystal_resonator");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_3_EMERALD_CRYSTAL_SCEPTER = createKey("geologist/3/emerald_crystal_scepter");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_3_EMERALD_CRYSTAL_BOW = createKey("geologist/3/emerald_crystal_bow");
	
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_BUDDING_AMETHYST = createKey("geologist/4/emerald_budding_amethyst");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_BUDDING_CITRINE = createKey("geologist/4/emerald_budding_citrine");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_RUBY_ORE = createKey("geologist/4/emerald_ruby_ore");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_SAPPHIRE_ORE = createKey("geologist/4/emerald_sapphire_ore");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_DEEPSLATE_RUBY_ORE = createKey("geologist/4/emerald_deepslate_ruby_ore");
	public static final ResourceKey<VillagerTrade> GEOLOGIST_4_EMERALD_DEEPSLATE_SAPPHIRE_ORE = createKey("geologist/4/emerald_deepslate_sapphire_ore");
	
	public static final ResourceKey<VillagerTrade> GEOLOGIST_5_EMERALD_CRYSTAL_RESONATOR = createKey("geologist/5/emerald_crystal_resonator");
	
	public static void bootstrap(BootstrapContext<VillagerTrade> context) {
		
		register(context, FARMER_1_IOLITE_BULB_EMERALD, new VillagerTrade(
				new TradeCost(MineralItems.IOLITE_BULB, 22),
				new ItemStackTemplate(Items.EMERALD, 1),
				16, 12, 0.02f, Optional.empty(), List.of()));
		register(context, FARMER_1_JASPEROOT_EMERALD, new VillagerTrade(
				new TradeCost(MineralItems.JASPEROOT, 26),
				new ItemStackTemplate(Items.EMERALD, 1),
				16, 12, 0.02f, Optional.empty(), List.of()));
		register(context, FARMER_1_SODALITE_LEAVES_EMERALD, new VillagerTrade(
				new TradeCost(MineralItems.SODALITE_LEAVES, 18),
				new ItemStackTemplate(Items.EMERALD, 1),
				16, 12, 0.02f, Optional.empty(), List.of()));
		
		register(context, GEOLOGIST_1_EMERALD_RUBY, new VillagerTrade(
				new TradeCost(Items.EMERALD, 3),
				new ItemStackTemplate(MineralItems.RUBY, 1),
				16, 12, 0.06f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_1_EMERALD_SAPPHIRE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 3),
				new ItemStackTemplate(MineralItems.SAPPHIRE, 1),
				16, 12, 0.06f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_1_AMETHYST_EMERALD, new VillagerTrade(
				new TradeCost(Items.AMETHYST_SHARD, 16),
				new ItemStackTemplate(Items.EMERALD, 1),
				16, 10, 0.06f, Optional.empty(), List.of()));
		
		register(context, GEOLOGIST_2_EMERALD_GEM_LAMP, new VillagerTrade(
				new TradeCost(Items.EMERALD, 15),
				new ItemStackTemplate(MineralItems.GEM_LAMP, 1),
				8, 15, 0.06f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_2_EMERALD_CITRINE_SHARD, new VillagerTrade(
				new TradeCost(Items.EMERALD, 5),
				new ItemStackTemplate(MineralItems.CITRINE_SHARD, 1),
				16, 12, 0.06f, Optional.empty(), List.of()));
		
		register(context, GEOLOGIST_3_EMERALD_CRYSTAL_RESONATOR, new VillagerTrade(
				new TradeCost(Items.EMERALD, 24),
				new ItemStackTemplate(MineralItems.CRYSTAL_RESONATOR, 1),
				4, 16, 0.06f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_3_EMERALD_CRYSTAL_SCEPTER, new VillagerTrade(
				new TradeCost(Items.EMERALD, 24),
				new ItemStackTemplate(MineralItems.CRYSTAL_SCEPTER, 1),
				4, 16, 0.06f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_3_EMERALD_CRYSTAL_BOW, new VillagerTrade(
				new TradeCost(Items.EMERALD, 18),
				new ItemStackTemplate(MineralItems.CRYSTAL_BOW, 1),
				4, 16, 0.06f, Optional.empty(), List.of()));
		
		register(context, GEOLOGIST_4_EMERALD_BUDDING_AMETHYST, new VillagerTrade(
				new TradeCost(Items.EMERALD, 32),
				new ItemStackTemplate(Items.BUDDING_AMETHYST, 1),
				4, 16, 0.07f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_4_EMERALD_BUDDING_CITRINE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 32),
				new ItemStackTemplate(MineralItems.BUDDING_CITRINE, 1),
				4, 16, 0.07f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_4_EMERALD_RUBY_ORE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 10),
				new ItemStackTemplate(MineralItems.RUBY_ORE, 1),
				10, 16, 0.07f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_4_EMERALD_SAPPHIRE_ORE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 10),
				new ItemStackTemplate(MineralItems.SAPPHIRE_ORE, 1),
				10, 16, 0.07f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_4_EMERALD_DEEPSLATE_RUBY_ORE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 10),
				new ItemStackTemplate(MineralItems.DEEPSLATE_RUBY_ORE, 1),
				10, 16, 0.07f, Optional.empty(), List.of()));
		register(context, GEOLOGIST_4_EMERALD_DEEPSLATE_SAPPHIRE_ORE, new VillagerTrade(
				new TradeCost(Items.EMERALD, 10),
				new ItemStackTemplate(MineralItems.DEEPSLATE_SAPPHIRE_ORE, 1),
				10, 16, 0.07f, Optional.empty(), List.of()));
		
		register(context, GEOLOGIST_5_EMERALD_CRYSTAL_RESONATOR, new VillagerTrade(
				new TradeCost(Items.EMERALD, 48),
				new ItemStackTemplate(MineralItems.RESONANT_CONVERTER, 1),
				5, 16, 0.1f, Optional.empty(), List.of()));
		
	}
	
	private static ResourceKey<VillagerTrade> createKey(String id) {
		return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, id));
	}
	
	private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> key, VillagerTrade trade) {
        context.register(key, trade);
    }

}
