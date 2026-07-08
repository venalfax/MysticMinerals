package com.venalfax.mysticminerals.datagen;

import java.util.Set;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
import com.venalfax.mysticminerals.blocks.custom.IoliteBulbCropBlock;
import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

	public ModBlockLootTableProvider(HolderLookup.Provider registries) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
	}

	@Override
	protected void generate() {
		HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
	    HolderLookup.RegistryLookup<Item> items = this.registries.lookupOrThrow(Registries.ITEM);
	    
	    LootItemCondition.Builder isIoliteBulbMaxAge = LootItemBlockStatePropertyCondition.hasBlockStateProperties(MineralBlocks.IOLITE_BULB_CROP.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(IoliteBulbCropBlock.AGE, 3));
		
	    dropSelf(MineralBlocks.RUBY_BLOCK.get());
		dropSelf(MineralBlocks.SAPPHIRE_BLOCK.get());
		dropSelf(MineralBlocks.CITRINE_BLOCK.get());
		dropSelf(MineralBlocks.FLINT_BLOCK.get());
		dropSelf(MineralBlocks.SHARPENED_FLINT_BLOCK.get());
		dropSelf(MineralBlocks.TEMPERED_FLINT_BLOCK.get());
		dropSelf(MineralBlocks.SHARPENER_BLOCK.get());
		dropSelf(MineralBlocks.GEM_LAMP.get());
		dropSelf(MineralBlocks.RESONANT_CONVERTER.get());
		dropSelf(MineralBlocks.AMETHYST_PRESSURE_PLATE.get());
		
		add(MineralBlocks.RUBY_ORE.get(), 
				createOreDrop(MineralBlocks.RUBY_ORE.get(), MineralItems.RUBY.get()));
		add(MineralBlocks.SAPPHIRE_ORE.get(), 
				createOreDrop(MineralBlocks.SAPPHIRE_ORE.get(), MineralItems.SAPPHIRE.get()));
		add(MineralBlocks.DEEPSLATE_RUBY_ORE.get(), 
				createOreDrop(MineralBlocks.DEEPSLATE_RUBY_ORE.get(), MineralItems.RUBY.get()));
		add(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), 
				createOreDrop(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), MineralItems.SAPPHIRE.get()));
		
		add(MineralBlocks.CITRINE_CLUSTER.get(),
				block -> createSilkTouchDispatchTable(
		                block,
		                LootItem.lootTableItem(MineralItems.CITRINE_SHARD.get())
		                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
		                    .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
		                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(items, ItemTags.CLUSTER_MAX_HARVESTABLES)))
		                    .otherwise(
		                        (LootPoolEntryContainer.Builder<?>)applyExplosionDecay(
		                            block, LootItem.lootTableItem(MineralItems.CITRINE_SHARD.get()).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))
		                        )
		                    )
						)
		);
		
		dropWhenSilkTouch(MineralBlocks.SMALL_CITRINE_BUD.get());
		dropWhenSilkTouch(MineralBlocks.MEDIUM_CITRINE_BUD.get());
		dropWhenSilkTouch(MineralBlocks.LARGE_CITRINE_BUD.get());

		add(MineralBlocks.BUDDING_CITRINE.get(), noDrop());
		
		add(MineralBlocks.IOLITE_BULB_CROP.get(), applyExplosionDecay(MineralBlocks.IOLITE_BULB_CROP.get(), LootTable.lootTable()
				.withPool(LootPool.lootPool().add(LootItem.lootTableItem(MineralItems.IOLITE_BULB.get())))
				.withPool(LootPool.lootPool()
						.when(isIoliteBulbMaxAge)
						.add(LootItem.lootTableItem(MineralItems.IOLITE_BULB.get())
								.apply(ApplyBonusCount.addBonusBinomialDistributionCount(enchantments.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))
						
						)
				)
		));
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks(){
		return MineralBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}

}
