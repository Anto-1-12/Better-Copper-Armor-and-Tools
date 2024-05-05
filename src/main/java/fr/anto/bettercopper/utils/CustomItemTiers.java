package fr.anto.bettercopper.utils;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
public class CustomItemTiers {
    public static final ForgeTier COPPER = new ForgeTier( 2, 250,6.0f, 2.0f, 18, Tags.Blocks.NEEDS_GOLD_TOOL,
            (()-> {return Ingredient.of(Items.COPPER_INGOT);}));
}
