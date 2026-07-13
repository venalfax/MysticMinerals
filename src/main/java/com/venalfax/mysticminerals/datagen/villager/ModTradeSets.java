package com.venalfax.mysticminerals.datagen.villager;

import java.util.Optional;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;

public class ModTradeSets {
	
	public static final ResourceKey<TradeSet> GEOLOGIST_LEVEL_1 = create("geologist/level_1");
	public static final ResourceKey<TradeSet> GEOLOGIST_LEVEL_2 = create("geologist/level_2");
	public static final ResourceKey<TradeSet> GEOLOGIST_LEVEL_3 = create("geologist/level_3");
	public static final ResourceKey<TradeSet> GEOLOGIST_LEVEL_4 = create("geologist/level_4");
	public static final ResourceKey<TradeSet> GEOLOGIST_LEVEL_5 = create("geologist/level_5");
	
	public static void bootstrap(BootstrapContext<TradeSet> context) {
		register(context, GEOLOGIST_LEVEL_1, MineralTags.Trades.GEOLOGIST_LEVEL_1);
		register(context, GEOLOGIST_LEVEL_2, MineralTags.Trades.GEOLOGIST_LEVEL_2);
		register(context, GEOLOGIST_LEVEL_3, MineralTags.Trades.GEOLOGIST_LEVEL_3);
		register(context, GEOLOGIST_LEVEL_4, MineralTags.Trades.GEOLOGIST_LEVEL_4);
		register(context, GEOLOGIST_LEVEL_5, MineralTags.Trades.GEOLOGIST_LEVEL_5);
	}
	
	private static ResourceKey<TradeSet> create(final String id) {
        return ResourceKey.create(Registries.TRADE_SET, Identifier.fromNamespaceAndPath(MysticMinerals.MOD_ID, id));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context,
                                                      final ResourceKey<TradeSet> resourceKey, final TagKey<VillagerTrade> tradeTag) {
        return register(context, resourceKey, tradeTag, ConstantValue.exactly(2.0F));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context, final ResourceKey<TradeSet> resourceKey,
                                                      final TagKey<VillagerTrade> tradeTag, final NumberProvider numberProvider) {
        return context.register(resourceKey, new TradeSet(context.lookup(Registries.VILLAGER_TRADE).getOrThrow(tradeTag),
                numberProvider, false, Optional.of(resourceKey.identifier().withPrefix("trade_set/"))));
    }

}
