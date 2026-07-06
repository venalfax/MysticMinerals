package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SharpenerBlock extends Block {
	
	public SharpenerBlock(Properties properties) {
		super(properties);
	}
	
	private int interactionProgress = 0;
	// Set for 30 seconds 
	private final int requiredInteractionTime = 600;
	// Resets progress when no item is on block does not work T_T
	public void tick() {
		if(interactionProgress > 0) {
			interactionProgress--;
		}
	}
	
	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		
		level.addParticle(ParticleTypes.POOF, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 1, 0);
		
		level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1f, 1f);
		
		// Resets sharpening progress
		interactionProgress = 0;
		
		return InteractionResult.SUCCESS;
	}
	
	/* testing to right click flint on block to sharpen *
	 
	protected InteractionResult useItemOn(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult, UseOnContext context) {
		
		if(isValidItem(context.getItemInHand())) {
			
			context.getItemInHand().consume(1, player);
		
			level.addParticle(ParticleTypes.ASH, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 1, 0);
		
			level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1f, 1f);
			
			
		
			return itemStack(MineralItems.SHARPENED_FLINT);
		}
		return null;
	}
	
	private InteractionResult itemStack(DeferredItem<Item> sharpenedFlint) {
		
		return itemStack(MineralItems.SHARPENED_FLINT);
	}
	
	/* */

	@Override
	public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
		
		if(entity instanceof ItemEntity itemEntity) {
			if(isValidItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					itemEntity.setItem(new ItemStack(MineralItems.SHARPENED_FLINT.get(), itemEntity.getItem().getCount()));
					triggerCompletion();
				}
			}
		}
		
		super.stepOn(level, pos, onState, entity);
	}
	
	private void triggerCompletion() {
		interactionProgress = 0;
	}
	
	private boolean isValidItem(ItemStack item) {
		
		return item.is(MineralTags.Items.SHARPENABLE);
	}
	
}
