package fr.anto.bettercopper.init;

import fr.anto.bettercopper.bettercopper;
import fr.anto.bettercopper.oxidized.WeatheringCopper;
import fr.anto.bettercopper.oxidized.WeatheringCopperSlabBlock;
import fr.anto.bettercopper.oxidized.WeatheringCopperStairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks extends Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(bettercopper.MODID);

    //public static final RegistryObject<Block> OLD_COPPER_BLOCK = BLOCKS.register("old_copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f, 15f).requiresCorrectToolForDrops().strength(3.0F, 6.0F)));
    //public static final RegistryObject<Block> COPPER_ORE = createBlock("copper_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 15f).requiresCorrectToolForDrops(PickaxeItem).harvestLevel(2).setRequiresTool()));

    //public static final RegistryObject<Block> COPPER_TEST = BLOCKS.register("copper_test", () -> new Block(BlockBehaviour.Properties.copy(COPPER_BLOCK)));

    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> COPPER_SLAB = registerBlock("copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));

    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperSlabBlock> WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));


    public static final DeferredHolder<Block, WeatheringCopperStairBlock> COPPER_STAIRS = registerBlock("copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.noWaxed));

    public static final DeferredHolder<Block, WeatheringCopperStairBlock> WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));
    public static final DeferredHolder<Block, WeatheringCopperStairBlock> WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WeatheringCopper.Waxedorno.Waxed));

    private static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block){
        DeferredHolder<Block, T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredHolder<Block, T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
