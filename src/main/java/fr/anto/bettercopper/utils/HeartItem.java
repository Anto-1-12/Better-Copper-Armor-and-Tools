package fr.anto.bettercopper.utils;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class HeartItem extends Item {

    static final int COOLDOWN = 10;
    boolean ADDORNO;

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

                healthAttribute.setBaseValue(healthAttribute.getValue() + 2);

                if (playerIn.getHealth() < healthAttribute.getValue()) {
                    playerIn.setHealth((float) playerIn.getHealth() + 2);
                }

                playerIn.getCooldowns().addCooldown(this, COOLDOWN);
                playerIn.swing(playerIn.getUsedItemHand());
                playerIn.getItemInHand(handIn).shrink(1);
                playerIn.playSound(SoundEvents.GENERIC_EAT);
            }
            return super.use(worldIn, playerIn, handIn);
        }

        else {
            AttributeInstance healthAttribute = playerIn.getAttribute(Attributes.MAX_HEALTH);

            if (healthAttribute.getValue() > 2) {

                healthAttribute.setBaseValue(healthAttribute.getValue() - 2);

                if (playerIn.getHealth() >= healthAttribute.getValue()) {
                    playerIn.setHealth((float) healthAttribute.getValue());
                }

                playerIn.getCooldowns().addCooldown(this, COOLDOWN);
                playerIn.swing(playerIn.getUsedItemHand());
                playerIn.getItemInHand(handIn).shrink(-1);
                playerIn.playSound(SoundEvents.GENERIC_DEATH);
            }
            return super.use(worldIn, playerIn, handIn);
        }
    }
}
