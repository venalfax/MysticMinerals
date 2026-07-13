package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.items.MineralItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PotatoBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class JasperootCropBlock extends PotatoBlock {
	
	public static final int MAX_AGE = 7;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public JasperootCropBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return MineralItems.JASPEROOT.get();
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
