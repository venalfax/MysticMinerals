package com.venalfax.mysticminerals.items;

import java.util.function.Consumer;

import com.venalfax.mysticminerals.MysticMinerals;
import com.venalfax.mysticminerals.foods.MineralFoods;
import com.venalfax.mysticminerals.items.custom.GemDetectorItem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
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
	
	public static final DeferredItem<Item> GARNET_SHARD = ITEMS.registerItem("garnet_shard", 
			properties -> new Item(properties.fireResistant()) {
				@Override
				public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
					builder.accept(Component.translatable("tooltip.mysticminerals.garnet_shard.tooltip"));
					super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
				}
			});
	
	/* TOOLS */
	
	public static final DeferredItem<Item> CRYSTAL_RESONATOR = ITEMS.registerItem("crystal_resonator", 
			properties -> new GemDetectorItem(properties.durability(250).enchantable(25).repairable(Items.AMETHYST_SHARD)));
	
	public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword", 
			properties -> new Item(properties.sword(ModToolTiers.RUBY, 3.0f, -2.4f)));
	public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe", 
			properties -> new Item(properties.pickaxe(ModToolTiers.RUBY, 1.0f, -2.8f)));
	public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerItem("ruby_axe", 
			properties -> new AxeItem(ModToolTiers.RUBY, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel", 
			properties -> new ShovelItem(ModToolTiers.RUBY, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerItem("ruby_hoe", 
			properties -> new HoeItem(ModToolTiers.RUBY, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> RUBY_SPEAR =  ITEMS.registerItem("ruby_spear", 
			properties -> new Item(properties.spear(ModToolTiers.RUBY, 1.1f, 1.15f, 0.425f, 2.75f, 9.5f, 6.0f, 5.1f, 9.25f, 4.6f)));
	
	public static final DeferredItem<Item> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword", 
			properties -> new Item(properties.sword(ModToolTiers.SAPPHIRE, 3.0f, -2.4f)));
	public static final DeferredItem<Item> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe", 
			properties -> new Item(properties.pickaxe(ModToolTiers.SAPPHIRE, 1.0f, -2.8f)));
	public static final DeferredItem<Item> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe", 
			properties -> new AxeItem(ModToolTiers.SAPPHIRE, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel", 
			properties -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe", 
			properties -> new HoeItem(ModToolTiers.SAPPHIRE, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> SAPPHIRE_SPEAR =  ITEMS.registerItem("sapphire_spear", 
			properties -> new Item(properties.spear(ModToolTiers.SAPPHIRE, 1.1f, 1.0f, 0.55f, 3.0f, 9.75f, 7.25f, 5.1f, 11.0f, 4.6f)));
	
	public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem("emerald_sword", 
			properties -> new Item(properties.sword(ModToolTiers.EMERALD, 3.0f, -2.4f)));
	public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem("emerald_pickaxe", 
			properties -> new Item(properties.pickaxe(ModToolTiers.EMERALD, 1.0f, -2.8f)));
	public static final DeferredItem<Item> EMERALD_AXE = ITEMS.registerItem("emerald_axe", 
			properties -> new AxeItem(ModToolTiers.EMERALD, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.registerItem("emerald_shovel", 
			properties -> new ShovelItem(ModToolTiers.EMERALD, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> EMERALD_HOE = ITEMS.registerItem("emerald_hoe", 
			properties -> new HoeItem(ModToolTiers.EMERALD, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> EMERALD_SPEAR =  ITEMS.registerItem("emerald_spear", 
			properties -> new Item(properties.spear(ModToolTiers.EMERALD, 1.1f, 1.1f, 0.5f, 3.0f, 9.75f, 6.5f, 5.1f, 10.0f, 4.6f)));
	
	public static final DeferredItem<Item> FLINT_SWORD = ITEMS.registerItem("flint_sword", 
			properties -> new Item(properties.sword(ModToolTiers.FLINT, 3.0f, -2.4f)));
	public static final DeferredItem<Item> FLINT_PICKAXE = ITEMS.registerItem("flint_pickaxe", 
			properties -> new Item(properties.pickaxe(ModToolTiers.FLINT, 1.0f, -2.8f)));
	public static final DeferredItem<Item> FLINT_AXE = ITEMS.registerItem("flint_axe", 
			properties -> new AxeItem(ModToolTiers.FLINT, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> FLINT_SHOVEL = ITEMS.registerItem("flint_shovel", 
			properties -> new ShovelItem(ModToolTiers.FLINT, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> FLINT_HOE = ITEMS.registerItem("flint_hoe", 
			properties -> new HoeItem(ModToolTiers.FLINT, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> FLINT_SPEAR =  ITEMS.registerItem("flint_spear", 
			properties -> new Item(properties.spear(ModToolTiers.FLINT, 0.7f, 0.76f, 0.725f, 4.75f, 13.5f, 9.5f, 5.1f, 14.25f, 4.6f)));
	
	public static final DeferredItem<Item> SHARPENED_FLINT_SWORD = ITEMS.registerItem("sharpened_flint_sword", 
			properties -> new Item(properties.sword(ModToolTiers.SHARPENED_FLINT, 3.0f, -2.4f)));
	public static final DeferredItem<Item> SHARPENED_FLINT_PICKAXE = ITEMS.registerItem("sharpened_flint_pickaxe", 
			properties -> new Item(properties.pickaxe(ModToolTiers.SHARPENED_FLINT, 1.0f, -2.8f)));
	public static final DeferredItem<Item> SHARPENED_FLINT_AXE = ITEMS.registerItem("sharpened_flint_axe", 
			properties -> new AxeItem(ModToolTiers.SHARPENED_FLINT, 5.0f, -3.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_SHOVEL = ITEMS.registerItem("sharpened_flint_shovel", 
			properties -> new ShovelItem(ModToolTiers.SHARPENED_FLINT, 1.5f, -3.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_HOE = ITEMS.registerItem("sharpened_flint_hoe", 
			properties -> new HoeItem(ModToolTiers.SHARPENED_FLINT, -3.0f, 0.0f, properties));
	public static final DeferredItem<Item> SHARPENED_FLINT_SPEAR =  ITEMS.registerItem("sharpened_flint_spear", 
			properties -> new Item(properties.spear(ModToolTiers.SHARPENED_FLINT, 0.9f, 0.9f, 0.65f, 3.5f, 12.25f, 7.75f, 5.1f, 11.865f, 4.6f)));

	/* ARMOR */
	
	public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem("emerald_helmet", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem("emerald_chestplate", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem("emerald_leggings", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem("emerald_boots", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> FLINT_HELMET = ITEMS.registerItem("flint_helmet", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> FLINT_CHESTPLATE = ITEMS.registerItem("flint_chestplate", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> FLINT_LEGGINGS = ITEMS.registerItem("flint_leggings", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> FLINT_BOOTS = ITEMS.registerItem("flint_boots", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLINT_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	public static final DeferredItem<Item> TEMPERED_FLINT_HELMET = ITEMS.registerItem("tempered_flint_helmet", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.HELMET)));
	public static final DeferredItem<Item> TEMPERED_FLINT_CHESTPLATE = ITEMS.registerItem("tempered_flint_chestplate", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
	public static final DeferredItem<Item> TEMPERED_FLINT_LEGGINGS = ITEMS.registerItem("tempered_flint_leggings", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
	public static final DeferredItem<Item> TEMPERED_FLINT_BOOTS = ITEMS.registerItem("tempered_flint_boots", 
			properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TEMPERED_FLINT_ARMOR_MATERIAL, ArmorType.BOOTS)));
	
	/* FOOD */
	
	public static final DeferredItem<Item> RUBY_POTATO = ITEMS.registerItem("ruby_potato", 
			properties -> new Item(properties.food(MineralFoods.RUBY_POTATO, MineralFoods.RUBY_POTATO_CONSUMABLE)));
	public static final DeferredItem<Item> SAPPHIRE_STEW = ITEMS.registerItem("sapphire_stew", 
			properties -> new Item(properties.food(MineralFoods.SAPPHIRE_STEW, MineralFoods.SAPPHIRE_STEW_CONSUMABLE)));
	public static final DeferredItem<Item> EMERALD_HONEY = ITEMS.registerItem("emerald_honey", 
			properties -> new Item(properties.food(MineralFoods.EMERALD_HONEY, MineralFoods.EMERALD_HONEY_CONSUMABLE)));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
	 
}
