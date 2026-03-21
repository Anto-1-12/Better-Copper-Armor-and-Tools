package fr.anto.bettercopper.utils;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class HeartItem extends Item {

    static final int COOLDOWN = 10;
    boolean ADDORNO;
    public static final UUID MAX_HEALT_MODIFIER = UUID.fromString("c9e7731a-d054-4082-8719-9326b729faaa");


    public HeartItem(Properties properties, boolean addorno) {
        super(properties);
        ADDORNO = addorno;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {

        if (ADDORNO) {
            if (playerIn.getCooldowns().isOnCooldown(this)) {
                return super.use(worldIn, playerIn, handIn);
            }

            AttributeInstance healthAttribute = playerIn.getAttribute(Attributes.MAX_HEALTH);

            if (healthAttribute.getValue() < 60) {

                AttributeModifier oldHealthModifier = healthAttribute.getModifier(MAX_HEALT_MODIFIER);
                //what is our value
                double old = oldHealthModifier == null ? 0 : oldHealthModifier.getAmount();
                double newVal = 2 + old;
                healthAttribute.removeModifier(MAX_HEALT_MODIFIER);
                AttributeModifier healthModifier = new AttributeModifier(MAX_HEALT_MODIFIER, "Bonus from BetterCopper", newVal, AttributeModifier.Operation.ADDITION);
                healthAttribute.addPermanentModifier(healthModifier);

                playerIn.getCooldowns().addCooldown(this, COOLDOWN);
                playerIn.swing(handIn);
                playerIn.getItemInHand(handIn).shrink(1);
                playerIn.playSound(SoundEvents.GENERIC_EAT,1f,1f);

                if (playerIn.getHealth() < healthAttribute.getValue()) {
                    playerIn.setHealth((float) playerIn.getHealth() + 2);
                }

            }
            return super.use(worldIn, playerIn, handIn);
        }

        else {
            AttributeInstance healthAttribute = playerIn.getAttribute(Attributes.MAX_HEALTH);

            if (healthAttribute.getValue() > 2) {

                AttributeModifier oldHealthModifier = healthAttribute.getModifier(MAX_HEALT_MODIFIER);
                //what is our value
                double old = oldHealthModifier == null ? 0 : oldHealthModifier.getAmount();
                double newVal = -2 + old;
                healthAttribute.removeModifier(MAX_HEALT_MODIFIER);
                AttributeModifier healthModifier = new AttributeModifier(MAX_HEALT_MODIFIER, "Bonus from BetterCopper", newVal, AttributeModifier.Operation.ADDITION);
                healthAttribute.addPermanentModifier(healthModifier);

                if (playerIn.getHealth() >= healthAttribute.getValue()) {
                    playerIn.setHealth((float) healthAttribute.getValue());
                }

                playerIn.getCooldowns().addCooldown(this, COOLDOWN);
                playerIn.swing(handIn);
                playerIn.getItemInHand(handIn).shrink(-1);
                playerIn.playSound(SoundEvents.GENERIC_DEATH,1f,1f);

            }
            return super.use(worldIn, playerIn, handIn);
        }
    }
}
