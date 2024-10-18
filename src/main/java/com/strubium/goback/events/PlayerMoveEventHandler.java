package com.strubium.goback.events;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;

import static com.strubium.goback.config.GoBackConfig.slowFactor;

public class PlayerMoveEventHandler {

    @SubscribeEvent
    public void onPlayerUpdate(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entity = event.getEntityLiving();

        // Check if the entity is a player
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;

            // Check if the player is moving backwards
            if (player.moveForward < 0) {
                // Slow down the player by directly modifying the motion
                player.motionX *= slowFactor; // Reduce X motion
                player.motionZ *= slowFactor; // Reduce Z motion
            }
        }
    }
}
