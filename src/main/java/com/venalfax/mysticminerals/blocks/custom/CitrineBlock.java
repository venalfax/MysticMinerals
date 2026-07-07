package com.venalfax.mysticminerals.blocks.custom;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CitrineBlock extends Block {
	public static final MapCodec<CitrineBlock> CODEC = simpleCodec(CitrineBlock::new);
	
	@Override
	public MapCodec<? extends CitrineBlock> codec() {
		return CODEC;
	}

	public CitrineBlock(Properties properties) {
		super(properties);
	}
	
	@Override
    protected void onProjectileHit(Level level, BlockState state, BlockHitResult hitResult, Projectile projectile) {
        if (!level.isClientSide()) {
            BlockPos hitPos = hitResult.getBlockPos();
            level.playSound(null, hitPos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.0F, 0.5F + level.getRandom().nextFloat() * 1.2F);
        }
    }

}
