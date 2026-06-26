package com.venalfax.mineralcraft.datagen;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import com.venalfax.mineralcraft.MineralCraft;
import com.venalfax.mineralcraft.items.ModArmorMaterials;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModEquipmentAssetProvider implements DataProvider {
	
	private final PackOutput.PathProvider pathProvider;
	
	public ModEquipmentAssetProvider(PackOutput packOutput) {
		this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
	}

	private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> output) {
			output.accept(ModArmorMaterials.RUBY_KEY, EquipmentClientInfo.builder()
						.addHumanoidLayers(Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "ruby"), false)
						.build());
			output.accept(ModArmorMaterials.SAPPHIRE_KEY, EquipmentClientInfo.builder()
						.addHumanoidLayers(Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "sapphire"), false)
						.build());
			output.accept(ModArmorMaterials.EMERALD_KEY, EquipmentClientInfo.builder()
						.addHumanoidLayers(Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "emerald"), false)
						.build());
			output.accept(ModArmorMaterials.FLINT_KEY, EquipmentClientInfo.builder()
						.addHumanoidLayers(Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "flint"), false)
						.build());
			output.accept(ModArmorMaterials.TEMPERED_FLINT_KEY, EquipmentClientInfo.builder()
						.addHumanoidLayers(Identifier.fromNamespaceAndPath(MineralCraft.MOD_ID, "tempered_flint"), false)
						.build());
	}
	
	@Override
	public CompletableFuture<?> run(CachedOutput cache) {
		Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
		bootstrap((id, asset) -> {
			if(equipmentAssets.putIfAbsent(id, asset) != null) {
				throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
			}
		});
		return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
	}

	@Override
	public String getName() {
		
		return "MineralCraft Equipment Definitions";
	}
	

}
