package com.venalfax.mysticminerals.registry;

import java.util.function.Supplier;


import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.worldgen.modifiers.MineralsFeatureBiomeModifier;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class MineralsModifier {
	public static final DeferredRegister<MapCodec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MysticMinerals.MOD_ID);
	
	public static final Supplier<MapCodec<MineralsFeatureBiomeModifier>> MINERALS_FEATURES_BIOME_MODIFIER_TYPE = BIOME_MODIFIER_SERIALIZERS.register("add_config_features", () ->
			RecordCodecBuilder.mapCodec(builder -> builder.group(
					Biome.LIST_CODEC.fieldOf("biomes").forGetter(MineralsFeatureBiomeModifier::biomes),
					PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(MineralsFeatureBiomeModifier::features),
					Decoration.CODEC.fieldOf("step").forGetter(MineralsFeatureBiomeModifier::step)
			).apply(builder, MineralsFeatureBiomeModifier::new))
	);
}
