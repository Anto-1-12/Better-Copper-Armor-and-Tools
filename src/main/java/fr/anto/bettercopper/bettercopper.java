package fr.anto.bettercopper;

import fr.anto.bettercopper.init.ModBlocks;
import fr.anto.bettercopper.init.ModItems;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(bettercopper.MODID)
public class bettercopper
{
    public static final String MODID = "bettercopper";

    public bettercopper()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

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
            event.accept(ModItems.COPPER_SWORD);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_HELMET);
            event.accept(ModItems.COPPER_CHESTPLATE);
            event.accept(ModItems.COPPER_LEGGINGS);
            event.accept(ModItems.COPPER_BOOTS);
            event.accept(ModItems.COPPER_HORSE_ARMOR);
        }
    }
    private void addCreative2(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.COPPER_SHOVEL);
            event.accept(ModItems.COPPER_PICKAXE);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_HOE);
        }
    }
    private void addCreative3(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.COPPER_HEART);
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
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            //event.accept(ModBlocks.OLD_COPPER_BLOCK);
            event.accept(ModBlocks.COPPER_STAIRS);
            event.accept(ModBlocks.COPPER_SLAB);
            event.accept(ModBlocks.EXPOSED_COPPER_STAIRS);
            event.accept(ModBlocks.EXPOSED_COPPER_SLAB);
            event.accept(ModBlocks.WEATHERED_COPPER_STAIRS);
            event.accept(ModBlocks.WEATHERED_COPPER_SLAB);
            event.accept(ModBlocks.OXIDIZED_COPPER_STAIRS);
            event.accept(ModBlocks.OXIDIZED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
         }
    }
}
