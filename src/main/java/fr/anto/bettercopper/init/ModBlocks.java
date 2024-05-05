package fr.anto.bettercopper.init;

import fr.anto.bettercopper.bettercopper;
import fr.anto.bettercopper.oxidized.WeatheringCopper;
import fr.anto.bettercopper.oxidized.WeatheringCopperSlabBlock;
import fr.anto.bettercopper.oxidized.WeatheringCopperStairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks extends Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, bettercopper.MODID);

    //public static final RegistryObject<Block> OLD_COPPER_BLOCK = registerBlock("old_copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f, 15f).requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    //public static final RegistryObject<Block> COPPER_ORE = createBlock("copper_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 15f).requiresCorrectToolForDrops(PickaxeItem).harvestLevel(2).setRequiresTool()));

    //public static final RegistryObject<Block> COPPER_TEST = registerBlock("copper_test", () -> new Block(BlockBehaviour.Properties.copy(COPPER_BLOCK)));

    public static final RegistryObject<Block> COPPER_SLAB = registerBlock("copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));

    public static final RegistryObject<Block> WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));


    public static final RegistryObject<Block> COPPER_STAIRS = registerBlock("copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final RegistryObject<Block> OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));

    public static final RegistryObject<Block> WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
