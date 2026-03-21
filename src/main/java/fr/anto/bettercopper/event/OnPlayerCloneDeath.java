package fr.anto.bettercopper.event;

import fr.anto.bettercopper.utils.HeartItem;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OnPlayerCloneDeath {

    @SubscribeEvent
    public void onPlayerCloneDeath(PlayerEvent.Clone event) {
        AttributeInstance original = event.getOriginal().getAttribute(Attributes.MAX_HEALTH);
        if (original != null) {
            AttributeModifier healthModifier = original.getModifier(HeartItem.MAX_HEALT_MODIFIER);
            if (healthModifier != null) {
                event.getPlayer().getAttribute(Attributes.MAX_HEALTH).addPermanentModifier(healthModifier);
                if (event.getPlayer().getHealth() < original.getValue()) {
                    event.getPlayer().setHealth((float) original.getValue());
                }
            }
        }
    }
}
