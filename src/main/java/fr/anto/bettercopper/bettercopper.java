package fr.anto.bettercopper;

import fr.anto.bettercopper.init.ModBlocks;
import fr.anto.bettercopper.init.ModItems;
import fr.anto.bettercopper.utils.CustomArmorMaterials;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(bettercopper.MODID)
public class bettercopper
{
    public static final String MODID = "bettercopper";

    public bettercopper(IEventBus modEventBus, ModContainer modContainer)
    {

        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CustomArmorMaterials.ARMOR_MATERIALS.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::addCreative2);
        modEventBus.addListener(this::addCreative3);
        modEventBus.addListener(this::addCreative4);
        modEventBus.addListener(this::addCreative5);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept((ItemLike) ModItems.COPPER_SWORD);
            event.accept((ItemLike) ModItems.COPPER_AXE);
            event.accept((ItemLike) ModItems.COPPER_HELMET);
            event.accept((ItemLike) ModItems.COPPER_CHESTPLATE);
            event.accept((ItemLike) ModItems.COPPER_LEGGINGS);
            event.accept((ItemLike) ModItems.COPPER_BOOTS);
            event.accept((ItemLike) ModItems.COPPER_HORSE_ARMOR);
        }
    }
    private void addCreative2(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept((ItemLike) ModItems.COPPER_SHOVEL);
            event.accept((ItemLike) ModItems.COPPER_PICKAXE);
            event.accept((ItemLike) ModItems.COPPER_AXE);
            event.accept((ItemLike) ModItems.COPPER_HOE);
        }
    }
    private void addCreative3(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept((ItemLike) ModItems.COPPER_HEART);
            event.accept((ItemLike) ModItems.REVERSED_COPPER_HEART);
        }
    }

    private void addCreative4(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.COPPER_NUGGET);
        }
    }
    private void addCreative5(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().equals(CreativeModeTabs.BUILDING_BLOCKS)){
            //event.accept(ModBlocks.OLD_COPPER_BLOCK);
            event.accept((ItemLike) ModBlocks.COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.EXPOSED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.EXPOSED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.WEATHERED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.WEATHERED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.OXIDIZED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.OXIDIZED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.WAXED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.WAXED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
            event.accept((ItemLike) ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
            event.accept((ItemLike) ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
         }
    }
}
