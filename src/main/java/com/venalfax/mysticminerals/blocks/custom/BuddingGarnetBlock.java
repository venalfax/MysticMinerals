package com.venalfax.mysticminerals.blocks.custom;

import com.mojang.serialization.MapCodec;
import com.venalfax.mysticminerals.blocks.MineralBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class BuddingGarnetBlock extends GarnetBlock {
	public static final MapCodec<BuddingGarnetBlock> CODEC = simpleCodec(BuddingGarnetBlock::new);
	public static final int GROWTH_CHANCE = 5;
	private static final Direction[] DIRECTIONS = Direction.values();
	
	@Override
	public MapCodec<BuddingGarnetBlock> codec() {
		return CODEC;
	}

	public BuddingGarnetBlock(Properties properties) {
		super(properties);
	}
	
	@Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(5) == 0) {
            Direction growDirection = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos growPos = pos.relative(growDirection);
            BlockState relativeState = level.getBlockState(growPos);
            Block nextStage = null;
            if (canClusterGrowAtState(relativeState)) {
                nextStage = MineralBlocks.SMALL_GARNET_BUD.get();
            } else if (relativeState.is(MineralBlocks.SMALL_GARNET_BUD.get()) && relativeState.getValue(GarnetClusterBlock.FACING) == growDirection) {
                nextStage = MineralBlocks.MEDIUM_GARNET_BUD.get();
            } else if (relativeState.is(MineralBlocks.MEDIUM_GARNET_BUD.get()) && relativeState.getValue(GarnetClusterBlock.FACING) == growDirection) {
                nextStage = MineralBlocks.LARGE_GARNET_BUD.get();
            } else if (relativeState.is(MineralBlocks.LARGE_GARNET_BUD.get()) && relativeState.getValue(GarnetClusterBlock.FACING) == growDirection) {
                nextStage = MineralBlocks.GARNET_CLUSTER.get();
            }

            if (nextStage != null) {
                BlockState targetState = nextStage.defaultBlockState()
                    .setValue(GarnetClusterBlock.FACING, growDirection)
                    .setValue(GarnetClusterBlock.WATERLOGGED, relativeState.getFluidState().is(Fluids.WATER));
                level.setBlockAndUpdate(growPos, targetState);
            }
        }
    }

    public static boolean canClusterGrowAtState(BlockState state) {
        return state.isAir() || state.is(Blocks.WATER) && state.getFluidState().isFull();
    }
}
