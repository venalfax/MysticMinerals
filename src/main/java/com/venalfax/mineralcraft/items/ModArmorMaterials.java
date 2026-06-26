package com.venalfax.mineralcraft.items;

import java.util.Map;

import com.google.common.collect.Maps;
import com.venalfax.mineralcraft.MineralCraft;
import com.venalfax.mineralcraft.tags.ModTags;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
	public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
	
	public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "ruby"));
	public static final ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "sapphire"));
	public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "emerald"));
	public static final ResourceKey<EquipmentAsset> FLINT_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "flint"));
	public static final ResourceKey<EquipmentAsset> TEMPERED_FLINT_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "tempered_flint"));

	public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(35, 
			makeDefense(3, 7, 9, 4, 17), 23, SoundEvents.ARMOR_EQUIP_DIAMOND,
			2.5f, 0.0f, ModTags.Items.RUBY_REPAIRABLE, RUBY_KEY);
	
	public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(33, 
			makeDefense(3, 6, 7, 3, 13), 18, SoundEvents.ARMOR_EQUIP_DIAMOND,
			2.0f, 0.0f, ModTags.Items.SAPPHIRE_REPAIRABLE, SAPPHIRE_KEY);
	
	public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(38, 
			makeDefense(3, 6, 8, 4, 15), 30, SoundEvents.ARMOR_EQUIP_DIAMOND,
			2.75f, 0.2f, ModTags.Items.EMERALD_REPAIRABLE, EMERALD_KEY);
	
	public static final ArmorMaterial FLINT_ARMOR_MATERIAL = new ArmorMaterial(13, 
			makeDefense(1, 3, 4, 2, 4), 10, SoundEvents.ARMOR_EQUIP_GENERIC,
			0.0f, 0.0f, ModTags.Items.FLINT_REPAIRABLE, FLINT_KEY);
	
	public static final ArmorMaterial TEMPERED_FLINT_ARMOR_MATERIAL = new ArmorMaterial(19, 
			makeDefense(2, 5, 5, 2, 5), 15, SoundEvents.ARMOR_EQUIP_IRON,
			1.0f, 0.0f, ModTags.Items.TEMPERED_FLINT_REPAIRABLE, TEMPERED_FLINT_KEY);
	
	private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
            Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }

}
