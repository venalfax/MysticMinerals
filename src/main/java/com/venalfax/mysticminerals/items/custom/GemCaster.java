package com.venalfax.mysticminerals.items.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class GemCaster extends Item{

	public GemCaster(Properties properties) {
		super(properties);
	}
	
	@Override
	public InteractionResult useOn(UseOnContext context) {
		
		Level level = context.getLevel();
		Player player = context.getPlayer();
		BlockPos positionClicked = context.getClickedPos();
		
		if(!level.isClientSide()) {
			context.getItemInHand().hurtAndBreak(1, player, context.getHand());
			level.playSound(null, positionClicked, SoundEvents.FIREWORK_ROCKET_LARGE_BLAST, SoundSource.PLAYERS, 5f, 1f);
			level.explode(player, 2, 2, 2, 6f, null);
		}
		
		return InteractionResult.SUCCESS;
		
	}

}
