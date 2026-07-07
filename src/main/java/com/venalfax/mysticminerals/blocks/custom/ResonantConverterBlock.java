package com.venalfax.mysticminerals.blocks.custom;

import com.venalfax.mysticminerals.blocks.MineralBlocks;
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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ResonantConverterBlock extends Block {

	public static final VoxelShape SHAPE = Shapes.or(Block.box(0, 0, 0, 16, 8, 16), 
			Block.box(4, 8, 0, 12, 12, 2), Block.box(4, 8, 14, 12, 12, 16), Block.box(0, 8, 4, 2, 12, 12), Block.box(14, 8, 4, 16, 12, 12),
			Block.box(0, 8, 0, 4, 16, 4), Block.box(0, 8, 12, 4, 16, 16), Block.box(12, 8, 0, 16, 16, 4), Block.box(12, 8, 12, 16, 16, 16));
	
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
		level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 1, 0);
		interactionProgress = 0;
		level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 5f, 1f);
		
		return InteractionResult.SUCCESS;
	}
	
	// resonated() does not seem to be called upon when interactionProgress == requiredInteractionTime
	@Override
	public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
		
		if(entity instanceof ItemEntity itemEntity) {
			if(isEmeraldItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
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
					if(interactionProgress % 40 == 0) {
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
					if(interactionProgress % 40 == 0) {
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
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralItems.CITRINE_SHARD.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isGarnetItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.AMETHYST_SHARD, itemEntity.getItem().getCount()));
				}
			}
			else if(isEmeraldOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.RUBY_ORE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isRubyOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.SAPPHIRE_ORE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isSapphireOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.EMERALD_ORE, itemEntity.getItem().getCount()));
				}
			}
			else if(isDeepslateEmeraldOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.DEEPSLATE_RUBY_ORE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isDeepslateRubyOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isDeepslateSapphireOreItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.DEEPSLATE_EMERALD_ORE, itemEntity.getItem().getCount()));
				}
			}
			else if(isAmethystBlockItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.CITRINE_BLOCK.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isGarnetBlockItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.AMETHYST_BLOCK, itemEntity.getItem().getCount()));
				}
			}
			else if(isBuddingAmethystItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(MineralBlocks.BUDDING_CITRINE.get(), itemEntity.getItem().getCount()));
				}
			}
			else if(isBuddingGarnetItem(itemEntity.getItem())) {
				if(interactionProgress < requiredInteractionTime) {
					if(interactionProgress % 40 == 0) {
						resonating(level, pos);
					}
					interactionProgress++;
				}
				if(interactionProgress >= requiredInteractionTime) {
					resonated(level, pos);
					itemEntity.setItem(new ItemStack(Items.BUDDING_AMETHYST, itemEntity.getItem().getCount()));
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
		level.playLocalSound(pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 5.0f, 1.0f, dynamicShape);
		interactionProgress = 0;
	}
	
	private boolean isEmeraldItem(ItemStack item) {
		
		return item.is(MineralTags.Items.EMERALD_CONVERTABLE);
	}
	
	private boolean isRubyItem(ItemStack item) {
		
		return item.is(MineralTags.Items.RUBY_CONVERTABLE);
	}
	
	private boolean isSapphireItem(ItemStack item) {
		
		return item.is(MineralTags.Items.SAPPHIRE_CONVERTABLE);
	}

	private boolean isAmethystItem(ItemStack item) {
	
		return item.is(MineralTags.Items.AMETHYST_CONVERTABLE);
	}

	private boolean isGarnetItem(ItemStack item) {
	
		return item.is(MineralTags.Items.CITRINE_CONVERTABLE);
	}
	
	private boolean isEmeraldOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.EMERALD_ORE_CONVERTABLE);
	}
	
	private boolean isRubyOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.RUBY_ORE_CONVERTABLE);
	}
	
	private boolean isSapphireOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.SAPPHIRE_ORE_CONVERTABLE);
	}
	
	private boolean isDeepslateEmeraldOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.DEEPSLATE_EMERALD_ORE_CONVERTABLE);
	}
	
	private boolean isDeepslateRubyOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.DEEPSLATE_RUBY_ORE_CONVERTABLE);
	}
	
	private boolean isDeepslateSapphireOreItem(ItemStack item) {
		
		return item.is(MineralTags.Items.DEEPSLATE_SAPPHIRE_ORE_CONVERTABLE);
	}

	private boolean isAmethystBlockItem(ItemStack item) {
	
		return item.is(MineralTags.Items.AMETHYST_BLOCK_CONVERTABLE);
	}

	private boolean isGarnetBlockItem(ItemStack item) {
	
		return item.is(MineralTags.Items.CITRINE_BLOCK_CONVERTABLE);
	}
	
	private boolean isBuddingAmethystItem(ItemStack item) {
		
		return item.is(MineralTags.Items.BUDDING_AMETHYST_CONVERTABLE);
	}

	private boolean isBuddingGarnetItem(ItemStack item) {
	
		return item.is(MineralTags.Items.BUDDING_CITRINE_CONVERTABLE);
	}
	
	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

}
