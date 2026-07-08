package com.venalfax.mysticminerals.items;

import java.util.function.Consumer;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.foods.MineralFoods;
import com.venalfax.mysticminerals.items.custom.GemDetectorItem;
import com.venalfax.mysticminerals.items.custom.RubyCaster;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MineralItems extends Items {
	
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MysticMinerals.MOD_ID);
	
	/* ITEMS */
	
	public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
	public static final DeferredItem<Item> SAPPHIRE = ITEMS.registerSimpleItem("sapphire");
	public static final DeferredItem<Item> SHARPENED_FLINT = ITEMS.registerSimpleItem("sharpened_flint");
	public static final DeferredItem<Item> TEMPERED_FLINT = ITEMS.registerSimpleItem("tempered_flint");
	
	public static final DeferredItem<Item> CITRINE_SHARD = ITEMS.registerItem("citrine_shard", 
			properties -> new Item(properties.fireResistant()) {
				@Override
				public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
					builder.accept(Component.translatable("tooltip.mysticminerals.citrine_shard.tooltip"));
					super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
				}
			});
	
	/* TOOLS */
	
	public static final DeferredItem<Item> CRYSTAL_RESONATOR = ITEMS.registerItem("crystal_resonator", 
			properties -> new GemDetectorItem(properties.durability(500).enchantable(17).repairable(Items.AMETHYST_SHARD)));
	
	public static final DeferredItem<Item> RUBY_SCEPTER = ITEMS.registerItem("ruby_scepter", 
			properties -> new RubyCaster(properties.durability(500).enchantable(20).repairable(MineralItems.RUBY.get())));
	
	public static final DeferredItem<Item> CRYSTAL_BOW = ITEMS.registerItem("crystal_bow", 
			properties -> new BowItem(properties.durability(640).enchantable(20).repairable(MineralItems.CITRINE_SHARD.get())));
	
	public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword", 
			properties -> new Item(properties.sword(MineralToolTiers.RUBY, 3.0f, -2.4f)));
	public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe", 
			properties -> new Item(properties.pickaxe(MineralToolTiers.RUBY, 1.0f, -2.8f)));
	public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerItem("ruby_axe", 
			properties -> new AxeItem(MineralToolTiers.RUBY, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel", 
			properties -> new ShovelItem(MineralToolTiers.RUBY, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerItem("ruby_hoe", 
			properties -> new HoeItem(MineralToolTiers.RUBY, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> RUBY_SPEAR =  ITEMS.registerItem("ruby_spear", 
			properties -> new Item(properties.spear(MineralToolTiers.RUBY, 1.1f, 1.15f, 0.425f, 2.75f, 9.5f, 6.0f, 5.1f, 9.25f, 4.6f)));
	
	public static final DeferredItem<Item> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword", 
			properties -> new Item(properties.sword(MineralToolTiers.SAPPHIRE, 3.0f, -2.4f)));
	public static final DeferredItem<Item> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe", 
			properties -> new Item(properties.pickaxe(MineralToolTiers.SAPPHIRE, 1.0f, -2.8f)));
	public static final DeferredItem<Item> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe", 
			properties -> new AxeItem(MineralToolTiers.SAPPHIRE, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel", 
			properties -> new ShovelItem(MineralToolTiers.SAPPHIRE, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe", 
			properties -> new HoeItem(MineralToolTiers.SAPPHIRE, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_SPEAR =  ITEMS.registerItem("sapphire_spear", 
			properties -> new Item(properties.spear(MineralToolTiers.SAPPHIRE, 1.1f, 1.0f, 0.55f, 3.0f, 9.75f, 7.25f, 5.1f, 11.0f, 4.6f)));
	
	public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem("emerald_sword", 
			properties -> new Item(properties.sword(MineralToolTiers.EMERALD, 3.0f, -2.4f)));
	public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem("emerald_pickaxe", 
			properties -> new Item(properties.pickaxe(MineralToolTiers.EMERALD, 1.0f, -2.8f)));
	public static final DeferredItem<Item> EMERALD_AXE = ITEMS.registerItem("emerald_axe", 
			properties -> new AxeItem(MineralToolTiers.EMERALD, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.registerItem("emerald_shovel", 
			properties -> new ShovelItem(MineralToolTiers.EMERALD, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> EMERALD_HOE = ITEMS.registerItem("emerald_hoe", 
			properties -> new HoeItem(MineralToolTiers.EMERALD, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> EMERALD_SPEAR =  ITEMS.registerItem("emerald_spear", 
			properties -> new Item(properties.spear(MineralToolTiers.EMERALD, 1.1f, 1.1f, 0.5f, 3.0f, 9.75f, 6.5f, 5.1f, 10.0f, 4.6f)));
	
	public static final DeferredItem<Item> FLINT_SWORD = ITEMS.registerItem("flint_sword", 
			properties -> new Item(properties.sword(MineralToolTiers.FLINT, 3.0f, -2.4f)));
	public static final DeferredItem<Item> FLINT_PICKAXE = ITEMS.registerItem("flint_pickaxe", 
			properties -> new Item(properties.pickaxe(MineralToolTiers.FLINT, 1.0f, -2.8f)));
	public static final DeferredItem<Item> FLINT_AXE = ITEMS.registerItem("flint_axe", 
			properties -> new AxeItem(MineralToolTiers.FLINT, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> FLINT_SHOVEL = ITEMS.registerItem("flint_shovel", 
			properties -> new ShovelItem(MineralToolTiers.FLINT, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> FLINT_HOE = ITEMS.registerItem("flint_hoe", 
			properties -> new HoeItem(MineralToolTiers.FLINT, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> FLINT_SPEAR =  ITEMS.registerItem("flint_spear", 
			properties -> new Item(properties.spear(MineralToolTiers.FLINT, 0.7f, 0.76f, 0.725f, 4.75f, 13.5f, 9.5f, 5.1f, 14.25f, 4.6f)));
	
	public static final DeferredItem<Item> SHARPENED_FLINT_SWORD = ITEMS.registerItem("sharpened_flint_sword", 
			properties -> new Item(properties.sword(MineralToolTiers.SHARPENED_FLINT, 3.0f, -2.4f)));
	public static final DeferredItem<Item> SHARPENED_FLINT_PICKAXE = ITEMS.registerItem("sharpened_flint_pickaxe", 
			properties -> new Item(properties.pickaxe(MineralToolTiers.SHARPENED_FLINT, 1.0f, -2.8f)));
	public static final DeferredItem<Item> SHARPENED_FLINT_AXE = ITEMS.registerItem("sharpened_flint_axe", 
			properties -> new AxeItem(MineralToolTiers.SHARPENED_FLINT, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_SHOVEL = ITEMS.registerItem("sharpened_flint_shovel", 
			properties -> new ShovelItem(MineralToolTiers.SHARPENED_FLINT, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_HOE = ITEMS.registerItem("sharpened_flint_hoe", 
			properties -> new HoeItem(MineralToolTiers.SHARPENED_FLINT, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_SPEAR =  ITEMS.registerItem("sharpened_flint_spear", 
			properties -> new Item(properties.spear(MineralToolTiers.SHARPENED_FLINT, 0.9f, 0.9f, 0.65f, 3.5f, 12.25f, 7.75f, 5.1f, 11.865f, 4.6f)));

	/* ARMOR */
	
	public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem("emerald_helmet", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem("emerald_chestplate", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem("emerald_leggings", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem("emerald_boots", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> FLINT_HELMET = ITEMS.registerItem("flint_helmet", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> FLINT_CHESTPLATE = ITEMS.registerItem("flint_chestplate", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> FLINT_LEGGINGS = ITEMS.registerItem("flint_leggings", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> FLINT_BOOTS = ITEMS.registerItem("flint_boots", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> TEMPERED_FLINT_HELMET = ITEMS.registerItem("tempered_flint_helmet", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> TEMPERED_FLINT_CHESTPLATE = ITEMS.registerItem("tempered_flint_chestplate", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> TEMPERED_FLINT_LEGGINGS = ITEMS.registerItem("tempered_flint_leggings", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> TEMPERED_FLINT_BOOTS = ITEMS.registerItem("tempered_flint_boots", 
			properties -> new Item(properties.humanoidArmor(MineralArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	/* FOOD */
	
	public static final DeferredItem<Item> RUBY_POTATO = ITEMS.registerItem("ruby_potato", 
			properties -> new Item(properties.food(MineralFoods.RUBY_POTATO, MineralFoods.RUBY_POTATO_CONSUMABLE)));
	public static final DeferredItem<Item> SAPPHIRE_STEW = ITEMS.registerItem("sapphire_stew", 
			properties -> new Item(properties.food(MineralFoods.SAPPHIRE_STEW, MineralFoods.SAPPHIRE_STEW_CONSUMABLE)));
	public static final DeferredItem<Item> EMERALD_HONEY = ITEMS.registerItem("emerald_honey", 
			properties -> new Item(properties.food(MineralFoods.EMERALD_HONEY, MineralFoods.EMERALD_HONEY_CONSUMABLE)));
	
	/* CROPS */
	
	public static final DeferredItem<Item> IOLITE_BULB = ITEMS.registerItem("iolite_bulb",
			properties -> new BlockItem(MineralBlocks.IOLITE_BULB_CROP.get(), properties.food(MineralFoods.IOLITE_BULB)));
	
	/* BLOCKS */
	
	public static final DeferredItem<BlockItem> RUBY_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.RUBY_BLOCK);
	public static final DeferredItem<BlockItem> SAPPHIRE_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.SAPPHIRE_BLOCK);
	// Testing properties to make Garnet Block immune to fire
	public static final DeferredItem<BlockItem> CITRINE_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.CITRINE_BLOCK,
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> BUDDING_CITRINE = ITEMS.registerSimpleBlockItem(MineralBlocks.BUDDING_CITRINE, 
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> CITRINE_CLUSTER = ITEMS.registerSimpleBlockItem(MineralBlocks.CITRINE_CLUSTER, 
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> LARGE_CITRINE_BUD = ITEMS.registerSimpleBlockItem(MineralBlocks.LARGE_CITRINE_BUD, 
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> MEDIUM_CITRINE_BUD = ITEMS.registerSimpleBlockItem(MineralBlocks.MEDIUM_CITRINE_BUD, 
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> SMALL_CITRINE_BUD = ITEMS.registerSimpleBlockItem(MineralBlocks.SMALL_CITRINE_BUD, 
			properties -> new Item.Properties().fireResistant());
	public static final DeferredItem<BlockItem> RUBY_ORE = ITEMS.registerSimpleBlockItem(MineralBlocks.RUBY_ORE);
	public static final DeferredItem<BlockItem> SAPPHIRE_ORE = ITEMS.registerSimpleBlockItem(MineralBlocks.SAPPHIRE_ORE);
	public static final DeferredItem<BlockItem> DEEPSLATE_RUBY_ORE = ITEMS.registerSimpleBlockItem(MineralBlocks.DEEPSLATE_RUBY_ORE);
	public static final DeferredItem<BlockItem> DEEPSLATE_SAPPHIRE_ORE = ITEMS.registerSimpleBlockItem(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE);
	public static final DeferredItem<BlockItem> FLINT_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.FLINT_BLOCK);
	public static final DeferredItem<BlockItem> SHARPENED_FLINT_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.SHARPENED_FLINT_BLOCK);
	public static final DeferredItem<BlockItem> TEMPERED_FLINT_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.TEMPERED_FLINT_BLOCK);
	public static final DeferredItem<BlockItem> SHARPENER_BLOCK = ITEMS.registerSimpleBlockItem(MineralBlocks.SHARPENER_BLOCK);
	public static final DeferredItem<BlockItem> RESONANT_CONVERTER = ITEMS.registerSimpleBlockItem(MineralBlocks.RESONANT_CONVERTER);
	public static final DeferredItem<BlockItem> GEM_LAMP = ITEMS.registerSimpleBlockItem(MineralBlocks.GEM_LAMP);
	public static final DeferredItem<BlockItem> AMETHYST_PRESSURE_PLATE = ITEMS.registerSimpleBlockItem(MineralBlocks.AMETHYST_PRESSURE_PLATE);
	
	public static ResourceKey<Item> getRK(Item item) {
		return BuiltInRegistries.ITEM.getResourceKey(item).get()
;	}
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
	 
}
