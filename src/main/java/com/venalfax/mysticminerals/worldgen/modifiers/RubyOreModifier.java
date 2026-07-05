package com.venalfax.mysticminerals.worldgen.modifiers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo.BiomeInfo.Builder;

public record RubyOreModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> feature) implements BiomeModifier {
	public static final MapCodec<RubyOreModifier> MAP_CODEC = RecordCodecBuilder.mapCodec(builder ->
			builder.group(
					Biome.LIST_CODEC.fieldOf("biomes").forGetter(RubyOreModifier::biomes),
					PlacedFeature.CODEC.fieldOf("feature").forGetter(RubyOreModifier::feature)
			).apply(builder, RubyOreModifier::new)
	);

	@Override
	public void modify(Holder<Biome> biome, Phase phase, Builder builder) {
		if(phase == Phase.ADD && this.biomes.contains(biome)) {
			builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, this.feature);
		}
	}

	@Override
	public MapCodec<? extends BiomeModifier> codec() {
		return MAP_CODEC;
	}
	
}
