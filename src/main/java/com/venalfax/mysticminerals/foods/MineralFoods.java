package com.venalfax.mysticminerals.foods;

import java.util.List;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class MineralFoods {
	
	public static final FoodProperties IOLITE_BULB = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
	public static final FoodProperties ONYX_BERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
	public static final FoodProperties JASPEROOT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3f).build();
	
	public static final FoodProperties ROASTED_JASPEROOT = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6f).build();
	public static final FoodProperties CRYSTAL_DINNER = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).build();
	
	public static final FoodProperties RUBY_POTATO = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).alwaysEdible().build();
	public static final FoodProperties SAPPHIRE_STEW = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2f).alwaysEdible().build();
	public static final FoodProperties EMERALD_HONEY = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2f).alwaysEdible().build();

	public static final Consumable ONYX_BERRY_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0.8f).build();
	
	public static final Consumable RUBY_POTATO_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6f)
	        .onConsume(
	            new ApplyStatusEffectsConsumeEffect(
	                List.of(
	                    new MobEffectInstance(MobEffects.REGENERATION, 600, 1),
	                    new MobEffectInstance(MobEffects.STRENGTH, 3000, 0),
	                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0),
	                    new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2)
	                )
	            )
	        )
	        .build();
	
	public static final Consumable SAPPHIRE_STEW_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6f)
	        .onConsume(
	            new ApplyStatusEffectsConsumeEffect(
	                List.of(
	                    new MobEffectInstance(MobEffects.REGENERATION, 600, 1),
	                    new MobEffectInstance(MobEffects.SPEED, 3000, 0),
	                    new MobEffectInstance(MobEffects.HASTE, 3000, 0),
	                    new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2)
	                )
	            )
	        )
	        .build();
	
	public static final Consumable EMERALD_HONEY_CONSUMABLE = Consumables.defaultDrink().consumeSeconds(1.6f)
	        .onConsume(
	            new ApplyStatusEffectsConsumeEffect(
	                List.of(
	                    new MobEffectInstance(MobEffects.REGENERATION, 600, 1),
	                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3000, 0),
	                    new MobEffectInstance(MobEffects.LUCK, 3000, 0),
	                    new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2)
	                )
	            )
	        )
	        .build();
	
}
