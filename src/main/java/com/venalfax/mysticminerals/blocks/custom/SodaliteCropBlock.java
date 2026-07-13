package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SodaliteCropBlock extends CropBlock {
	
	public static final int MAX_AGE = 7;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public SodaliteCropBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return MineralItems.SODALITE_SEEDS.get();
	}
	
	@Override
	protected IntegerProperty getAgeProperty() {
		return AGE;
	}
	
	@Override
	public int getMaxAge() {
		return MAX_AGE;
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

}
