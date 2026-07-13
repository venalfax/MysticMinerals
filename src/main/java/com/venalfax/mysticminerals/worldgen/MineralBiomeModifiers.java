package com.venalfax.mysticminerals.worldgen;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class MineralBiomeModifiers {
	
	public static final ResourceKey<BiomeModifier> ADD_RUBY_OVERWORLD_ORES = registerKey("add_ruby_overworld_ores");
	public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_OVERWORLD_ORES = registerKey("add_sapphire_overworld_ores");
	
	public static final ResourceKey<BiomeModifier> ADD_CITRINE_GEODE = registerKey("add_citrine_geode");
	
	public static final ResourceKey<BiomeModifier> ADD_ONYX_BERRY_BUSH = registerKey("add_onyx_beryy_bush");
	
	public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		var biomes = context.lookup(Registries.BIOME);
		
		context.register(ADD_RUBY_OVERWORLD_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
				HolderSet.direct(biomes.getOrThrow(Biomes.BADLANDS), biomes.getOrThrow(Biomes.WOODED_BADLANDS), biomes.getOrThrow(Biomes.ERODED_BADLANDS)), 
				HolderSet.direct(placedFeatures.getOrThrow(MineralPlacedFeatures.RUBY_OVERWORLD_ORES_PLACED_KEY)),
				GenerationStep.Decoration.UNDERGROUND_ORES));
		
		context.register(ADD_SAPPHIRE_OVERWORLD_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
				HolderSet.direct(biomes.getOrThrow(Biomes.OCEAN), biomes.getOrThrow(Biomes.COLD_OCEAN), biomes.getOrThrow(Biomes.LUKEWARM_OCEAN), 
						biomes.getOrThrow(Biomes.DEEP_OCEAN), biomes.getOrThrow(Biomes.DEEP_COLD_OCEAN), biomes.getOrThrow(Biomes.DEEP_LUKEWARM_OCEAN)), 
				HolderSet.direct(placedFeatures.getOrThrow(MineralPlacedFeatures.SAPPHIRE_OVERWORLD_ORES_PLACED_KEY)),
				GenerationStep.Decoration.UNDERGROUND_ORES));
		
		context.register(ADD_CITRINE_GEODE, new BiomeModifiers.AddFeaturesBiomeModifier(
				biomes.getOrThrow(BiomeTags.IS_OVERWORLD), 
				HolderSet.direct(placedFeatures.getOrThrow(MineralPlacedFeatures.CITRINE_GEODE_PLACED_KEY)), 
				GenerationStep.Decoration.UNDERGROUND_ORES));
		
		context.register(ADD_ONYX_BERRY_BUSH, new BiomeModifiers.AddFeaturesBiomeModifier(
				HolderSet.direct(biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.BIRCH_FOREST), biomes.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST)), 
				HolderSet.direct(placedFeatures.getOrThrow(MineralPlacedFeatures.ONYX_BERRY_BUSH_PLACED_KEY)),
				GenerationStep.Decoration.VEGETAL_DECORATION));
		
	}
	
	 private static ResourceKey<BiomeModifier> registerKey(String name) {
	        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MysticMinerals.id(name));
	    }

}
