package fr.anto.bettercopper.event;

import fr.anto.bettercopper.utils.HeartItem;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Objects;

public class OnPlayerCloneDeath {

    @SubscribeEvent
    public void onPlayerCloneDeath(PlayerEvent.Clone event) {
        AttributeInstance original = event.getOriginal().getAttribute(Attributes.MAX_HEALTH);
        if (original != null) {
            AttributeModifier healthModifier = original.getModifier(HeartItem.MAX_HEALT_MODIFIER);
            if (healthModifier != null) {
                Objects.requireNonNull(event.getEntity().getAttribute(Attributes.MAX_HEALTH)).addPermanentModifier(healthModifier);
                if (event.getEntity().getHealth() < original.getValue()) {
                    event.getEntity().setHealth((float) original.getValue());
                }
            }
        }
    }
}
