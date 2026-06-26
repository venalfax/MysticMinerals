package com.venalfax.mineralcraft.items.custom;

import java.util.function.Consumer;

import com.venalfax.mineralcraft.tags.ModTags;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult; 
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class GemDetectorItem extends Item {

	public GemDetectorItem(Properties properties) {
		super(properties);
		
	}
	
	@Override
	public InteractionResult useOn(UseOnContext context) {
		
		Level level = context.getLevel();
		BlockPos positionClicked = context.getClickedPos();
		Direction faceClicked = context.getClickedFace();
		Player player = context.getPlayer();
		
		if(!level.isClientSide()) {
			
			boolean foundBlock = false;
			
			if(faceClicked == Direction.UP) {
			
				for(int i = 0; i <= positionClicked.getY() + 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.below(i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.below(i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.UP, blockState);
						
						break;
					}
				}
			}
			
			else if(faceClicked == Direction.DOWN){
				
				for(int i = 0; i <= 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.above(i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.above(i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.DOWN, blockState);
						
						break;
					}
						
				}
				
			}
			
			else if(faceClicked == Direction.NORTH){
				
				for(int i = 0; i <= 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.relative(Direction.SOUTH, i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.relative(Direction.SOUTH, i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.NORTH, blockState);
						
						break;
					}
						
				}
				
			}
			
			else if(faceClicked == Direction.SOUTH){
				
				for(int i = 0; i <= 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.relative(Direction.NORTH, i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.relative(Direction.NORTH, i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.SOUTH, blockState);
						
						break;
					}
						
				}
				
			}
						
			else if(faceClicked == Direction.EAST){
				
				for(int i = 0; i <= 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.relative(Direction.WEST, i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.relative(Direction.WEST, i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.EAST, blockState);
						
						break;
					}
						
				}
				
			}
						
			else if(faceClicked == Direction.WEST){
				
				for(int i = 0; i <= 64; i++) {
					BlockState blockState = level.getBlockState(positionClicked.relative(Direction.EAST, i));
					
					if(isValuableBlock(blockState)) {
						outputValuableCoordinates(positionClicked.relative(Direction.EAST, i), player, blockState.getBlock());
						foundBlock = true;
						
						context.getItemInHand().hurtAndBreak(1, player, context.getHand());
						
						level.playSound(null, positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.5f, 1f);
						
						spawnFoundParticles(level, positionClicked, Direction.WEST, blockState);
						
						break;
					}
						
				}
				
			}
			
			if(!foundBlock) {
				outputNoValuablesFound(player);
				
				context.getItemInHand().hurtAndBreak(1, player, context.getHand());
			}
			
		}
		
		return InteractionResult.SUCCESS;
		
	}

	private void spawnFoundParticles(Level level, BlockPos positionClicked, Direction direction, BlockState blockState) {
		for(int i = 0; i < 20; i++) {
			ServerLevel serverLevel = (ServerLevel) level;
			
			if(direction == Direction.UP) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX() + 0.5d, positionClicked.getY() + 1, positionClicked.getZ() + 0.5d, 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
			else if(direction == Direction.DOWN) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX() + 0.5d, positionClicked.getY(), positionClicked.getZ() + 0.5d, 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
			else if(direction == Direction.NORTH) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX() + 0.5d, positionClicked.getY() + 0.5d, positionClicked.getZ(), 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
			else if(direction == Direction.SOUTH) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX() + 0.5d, positionClicked.getY() + 0.5d, positionClicked.getZ() + 1, 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
			else if(direction == Direction.EAST) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX() + 1, positionClicked.getY() + 0.5d, positionClicked.getZ() + 0.5d, 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
			else if(direction == Direction.WEST) {
				serverLevel.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, blockState),
						positionClicked.getX(), positionClicked.getY() + 0.5d, positionClicked.getZ() + 0.5d, 
						1, Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
			}
		}
		
	}

	private void outputNoValuablesFound(Player player) {
		player.sendSystemMessage(Component.translatable("item.mineralcraft.crystal_resonator.no_valuables"));
	}

	private void outputValuableCoordinates(BlockPos position, Player player, Block block) {
		player.sendSystemMessage(block.getName() 
				.append(Component.literal(" Found at X:" + position.getX() + " Y:" + position.getY() + " Z:" + position.getZ())));
	}

	private boolean isValuableBlock(BlockState blockState) {
		
		return blockState.is(ModTags.Blocks.CRYSTAL_RESONATORS);
	}

	@Override
	public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
		if(Minecraft.getInstance().hasShiftDown()) {
			builder.accept(Component.translatable("tooltip.mineralcraft.crystal_resonator.shift_down"));
		} else {
			builder.accept(Component.translatable("tooltip.mineralcraft.crystal_resonator.tooltip"));
		}
		super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
	}
	
}
