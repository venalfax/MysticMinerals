package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class IoliteBulbCropBlock extends BeetrootBlock {
	
	public static final int MAX_AGE = 3;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

	public IoliteBulbCropBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return MineralItems.IOLITE_BULB.get();
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
