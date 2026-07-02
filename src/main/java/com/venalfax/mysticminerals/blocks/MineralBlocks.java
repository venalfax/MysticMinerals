package com.venalfax.mysticminerals.blocks;

import java.util.function.Function;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.custom.BuddingGarnetBlock;
import com.venalfax.mysticminerals.blocks.custom.GarnetBlock;
import com.venalfax.mysticminerals.blocks.custom.GarnetClusterBlock;
import com.venalfax.mysticminerals.blocks.custom.GemLampBlock;
import com.venalfax.mysticminerals.blocks.custom.ResonantConverterBlock;
import com.venalfax.mysticminerals.blocks.custom.SharpenerBlock;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MineralBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MysticMinerals.MOD_ID);
	
	public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block", 
			properties -> new Block(properties
					.strength(5f, 6f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.CRIMSON_NYLIUM)
					.sound(SoundType.METAL)));
	
	public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", 
			properties -> new Block(properties
					.strength(5f, 5f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_BLUE)
					.sound(SoundType.METAL)));
	
	public static final DeferredBlock<Block> GARNET_BLOCK = registerBlock("garnet_block", 
			properties -> new GarnetBlock(properties
					.strength(2f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.AMETHYST)));
	
	public static final DeferredBlock<Block> BUDDING_GARNET = registerBlock("budding_garnet",
			properties -> new BuddingGarnetBlock(properties
					.strength(2f)
					.randomTicks()
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.AMETHYST)
					.pushReaction(PushReaction.DESTROY)));
	
	public static final DeferredBlock<Block> GARNET_CLUSTER = registerBlock("garnet_cluster",
			properties -> new GarnetClusterBlock(7.0f, 10.0f, properties
					.strength(2f)
					.forceSolidOn()
					.noOcclusion()
					.lightLevel(statex -> 5)
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.AMETHYST_CLUSTER)
					.pushReaction(PushReaction.DESTROY)));
	
	public static final DeferredBlock<Block> LARGE_GARNET_BUD = registerBlock("large_garnet_bud",
			properties -> new GarnetClusterBlock(5.0f, 10.0f, properties
					.strength(2f)
					.forceSolidOn()
					.noOcclusion()
					.lightLevel(statex -> 4)
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.LARGE_AMETHYST_BUD)
					.pushReaction(PushReaction.DESTROY)));
	
	public static final DeferredBlock<Block> MEDIUM_GARNET_BUD = registerBlock("medium_garnet_bud",
			properties -> new GarnetClusterBlock(4.0f, 10.0f, properties
					.strength(2f)
					.forceSolidOn()
					.noOcclusion()
					.lightLevel(statex -> 2)
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.MEDIUM_AMETHYST_BUD)
					.pushReaction(PushReaction.DESTROY)));
	
	public static final DeferredBlock<Block> SMALL_GARNET_BUD = registerBlock("small_garnet_bud",
			properties -> new GarnetClusterBlock(3.0f, 8.0f, properties
					.strength(2f)
					.forceSolidOn()
					.noOcclusion()
					.lightLevel(statex -> 1)
					.mapColor(MapColor.COLOR_ORANGE)
					.sound(SoundType.SMALL_AMETHYST_BUD)
					.pushReaction(PushReaction.DESTROY)));
	
	public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore", 
			properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties
					.strength(3f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.STONE)
					.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", 
			properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties
					.strength(3f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.STONE)
					.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", 
			properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties
					.strength(4.5f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.DEEPSLATE)
					.sound(SoundType.DEEPSLATE)));
	
	public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", 
			properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties
					.strength(4.5f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.DEEPSLATE)
					.sound(SoundType.DEEPSLATE)));
	
	
	
	public static final DeferredBlock<Block> FLINT_BLOCK = registerBlock("flint_block", 
			properties -> new Block(properties
					.strength(2f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_GRAY)
					.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> SHARPENED_FLINT_BLOCK = registerBlock("sharpened_flint_block", 
			properties -> new Block(properties
					.strength(2.5f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_GRAY)
					.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> TEMPERED_FLINT_BLOCK = registerBlock("tempered_flint_block", 
			properties -> new Block(properties
					.strength(3f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_GRAY)
					.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> SHARPENER_BLOCK = registerBlock("sharpener_block", 
			properties -> new SharpenerBlock(properties
					.strength(2f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.COLOR_GRAY)
					.sound(SoundType.WOOD)), Component.translatable("tooltip.mysticminerals.sharpener_block.tooltip"));
	
	public static final DeferredBlock<Block> RESONANT_CONVERTER = registerBlock("resonant_converter",
			properties -> new ResonantConverterBlock(properties
					.strength(3.0f, 100.0f)
					.requiresCorrectToolForDrops()
					.mapColor(MapColor.GOLD)
					.sound(SoundType.AMETHYST)), Component.translatable("tooltip.mysticminerals.resonant_converter.tooltip"));
	
	public static final DeferredBlock<Block> GEM_LAMP = registerBlock("gem_lamp", 
			properties -> new GemLampBlock(properties
					.strength(1f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST_CLUSTER)
					.lightLevel(state -> state.getValue(GemLampBlock.CLICKED) ? 15 : 0)
					));

	public static final DeferredBlock<Block> AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate", 
			properties -> new PressurePlateBlock(BlockSetType.IRON, properties
					.mapColor(MapColor.COLOR_PURPLE)
					.requiresCorrectToolForDrops()
					.forceSolidOn()
					.noCollision()
					.strength(0.5F)
					.pushReaction(PushReaction.DESTROY)));
	
	
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function, Component... components){
		DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
		//registerBlockItem(name, toReturn, components);
		return toReturn;
	}
	
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function){
		DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
		//registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
