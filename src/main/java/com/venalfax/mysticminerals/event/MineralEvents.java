package com.venalfax.mysticminerals.event;

import com.venalfax.mysticminerals.MysticMinerals;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.parrot.Parrot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = MysticMinerals.MOD_ID)
public class MineralEvents {
	
	@SubscribeEvent
	public static void livingDamage(LivingDamageEvent.Pre event) {
		if(event.getEntity() instanceof Parrot parrot && event.getSource().getDirectEntity() instanceof Player player) {
			if(player.getMainHandItem().getItem() == Items.AMETHYST_SHARD) {
				player.sendSystemMessage(Component.literal(player.getName().getString() + " now has an amethyst starling!"));
				player.getMainHandItem().shrink(1);
				parrot.setCustomName(Component.literal("Amethyst Starling"));
				parrot.addEffect(new MobEffectInstance(MobEffects.GLOWING, 600));
				parrot.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 5));
				parrot.setOwner(player);
			}
		}
	}
	
}
