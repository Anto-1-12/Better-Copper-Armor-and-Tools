package fr.anto.bettercopper.utils;

import fr.anto.bettercopper.bettercopper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class CustomItemTiers {
    public static final TagKey<Block> NEEDS_COPPER_TOOL = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(bettercopper.MODID, "needs_copper_tool"));

    // This tag will be passed into our tier
    public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(bettercopper.MODID, "incorrect_for_copper_tool"));

    public static final ForgeTier COPPER = new ForgeTier(200,
            5.0f,
            2.0f,
            15,
            Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> {return Ingredient.of(new ItemLike[]{Items.COPPER_INGOT});},
            CustomItemTiers.INCORRECT_FOR_COPPER_TOOL
    );
}
