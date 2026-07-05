package com.venalfax.mysticminerals.worldgen;

import com.mojang.serialization.MapCodec;
import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.worldgen.features.MineralsFeatures;
import com.venalfax.mysticminerals.worldgen.modifiers.RubyOreModifier;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeGen {
	
	public static void bootstrap(BootstrapContext<BiomeModifier> context) {		
		MineralsFeatures.GARNET_GEODE.setupBiomeModifier(context, BiomeTags.IS_OVERWORLD, "garnet");
	}
	
	public static ResourceKey<BiomeModifier> createModifierKey(String name){
		return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MysticMinerals.id(name));
	}
	
	public static final DeferredRegister<MapCodec<? extends BiomeModifier>> REGISTRY = DeferredRegister.create(NeoForgeRegistries.BIOME_MODIFIER_SERIALIZERS, MysticMinerals.MOD_ID);
	
	public static final DeferredHolder<MapCodec<? extends BiomeModifier>, MapCodec<RubyOreModifier>> RUBY_ORE = REGISTRY.register("ruby_ore", () -> RubyOreModifier.MAP_CODEC);
}
