package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.items.MineralItems;
import com.venalfax.mysticminerals.tags.ModTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ResonantConverterBlock extends Block {

	public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 8, 16);
	
	public ResonantConverterBlock(Properties properties) {
		super(properties);
	}
	
	private int interactionProgress = 0;
	// Set for 60 seconds testing shows completion in 30 seconds 
	private final int requiredInteractionTime = 1200;
	// Resets progress when no item is on block does not work T_T
	public void tick() {
		if(interactionProgress > 0) {
			interactionProgress--;
		}
	}
	
	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		
		// Resets gained progress
		resonated(level, pos);
		
		level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1f, 1f);
		
		return InteractionResult.SUCCESS;
	}
	
	// Note there is a three second delay from visual change to actual item stack change
	// resonated() does not seem to be called upon completion when interactionProgress = requiredInteractionTime
	@Override
	public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
		
		if(entity instanceof ItemEntity itemEntity) {
			if(isEmeraldItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 20 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralItems.RUBY.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isRubyItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 20 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralItems.SAPPHIRE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isSapphireItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 20 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.EMERALD, itemEntity.getItem().getCount()));
				}
			}
			else if(isAmethystItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 20 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralItems.GARNET_SHARD.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isGarnetItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 20 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.AMETHYST_SHARD, itemEntity.getItem().getCount()));
				}
			}
		}
		
		super.stepOn(level, pos, onState, entity);
	}
	
	private void resonating(Level level, BlockPos pos) {
		level.addParticle(ParticleTypes.COPPER_FIRE_FLAME, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 0, 0);
	}
	
	private void resonated(Level level, BlockPos pos) {
		level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 1, 0);
		interactionProgress = 0;;
	}
	
	private boolean isEmeraldItem(ItemStack item) {
		
		return item.is(ModTags.Items.EMERALD_CONVERTABLE);
	}
	
	private boolean isRubyItem(ItemStack item) {
		
		return item.is(ModTags.Items.RUBY_CONVERTABLE);
	}
	
	private boolean isSapphireItem(ItemStack item) {
		
		return item.is(ModTags.Items.SAPPHIRE_CONVERTABLE);
	}

	private boolean isAmethystItem(ItemStack item) {
	
		return item.is(ModTags.Items.AMETHYST_CONVERTABLE);
	}

	private boolean isGarnetItem(ItemStack item) {
	
		return item.is(ModTags.Items.GARNET_CONVERTABLE);
	}
	
	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

}
