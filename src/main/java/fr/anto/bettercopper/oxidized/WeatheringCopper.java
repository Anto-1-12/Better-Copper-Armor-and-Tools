package fr.anto.bettercopper.oxidized;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import fr.anto.bettercopper.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface WeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
   Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK_STAIR = Suppliers.memoize(() -> {
      return ImmutableBiMap.<Block, Block>builder()

              .put(ModBlocks.COPPER_STAIRS.get(), ModBlocks.EXPOSED_COPPER_STAIRS.get())
              .put(ModBlocks.EXPOSED_COPPER_STAIRS.get(), ModBlocks.WEATHERED_COPPER_STAIRS.get())
              .put(ModBlocks.WEATHERED_COPPER_STAIRS.get(), ModBlocks.OXIDIZED_COPPER_STAIRS.get())

              .put(ModBlocks.COPPER_SLAB.get(), ModBlocks.EXPOSED_COPPER_SLAB.get())
              .put(ModBlocks.EXPOSED_COPPER_SLAB.get(), ModBlocks.WEATHERED_COPPER_SLAB.get())
              .put(ModBlocks.WEATHERED_COPPER_SLAB.get(), ModBlocks.OXIDIZED_COPPER_SLAB.get())

              .build();
   });


   Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
      return NEXT_BY_BLOCK_STAIR.get().inverse();
   });

   static Optional<Block> getPrevious(Block block) {
      return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
   }
   static Optional<BlockState> getPrevious(BlockState bstate) {
      return getPrevious(bstate.getBlock()).map((block) -> {
         return block.withPropertiesOf(bstate);
      });
   }

   static Optional<Block> getNext(Block block) {
      return Optional.ofNullable(NEXT_BY_BLOCK_STAIR.get().get(block));
   }


   default Optional<BlockState> getNext(BlockState bstate) {
      return getNext(bstate.getBlock()).map((p_154896_) -> {
         return p_154896_.withPropertiesOf(bstate);
      });
   }

   default float getChanceModifier() {
      return this.getAge() == WeatherState.UNAFFECTED ? 0.75F : 1.0F;
   }

   public static enum WeatherState {
      UNAFFECTED,
      EXPOSED,
      WEATHERED,
      OXIDIZED;
   }

   public static enum Waxedorno{
      Waxed,

      noWaxed;
   }


   Supplier<BiMap<Block, Block>> WAXED_VARIENT_BLOCK = Suppliers.memoize(() -> {
      return ImmutableBiMap.<Block, Block>builder()

              .put(ModBlocks.WAXED_COPPER_STAIRS.get(), ModBlocks.COPPER_STAIRS.get())
              .put(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get(), ModBlocks.EXPOSED_COPPER_STAIRS.get())
              .put(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get(), ModBlocks.WEATHERED_COPPER_STAIRS.get())
              .put(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get(), ModBlocks.OXIDIZED_COPPER_STAIRS.get())

              .put(ModBlocks.COPPER_STAIRS.get(), ModBlocks.WAXED_COPPER_STAIRS.get())
              .put(ModBlocks.EXPOSED_COPPER_STAIRS.get(), ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get())
              .put(ModBlocks.WEATHERED_COPPER_STAIRS.get(), ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get())
              .put(ModBlocks.OXIDIZED_COPPER_STAIRS.get(), ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get())


              .put(ModBlocks.WAXED_COPPER_SLAB.get(), ModBlocks.COPPER_SLAB.get())
              .put(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(), ModBlocks.EXPOSED_COPPER_SLAB.get())
              .put(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(), ModBlocks.WEATHERED_COPPER_SLAB.get())
              .put(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(), ModBlocks.OXIDIZED_COPPER_SLAB.get())

              .put(ModBlocks.COPPER_SLAB.get(), ModBlocks.WAXED_COPPER_SLAB.get())
              .put(ModBlocks.EXPOSED_COPPER_SLAB.get(), ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get())
              .put(ModBlocks.WEATHERED_COPPER_SLAB.get(), ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get())
              .put(ModBlocks.OXIDIZED_COPPER_SLAB.get(), ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get())

              .build();
   });

   Supplier<BiMap<Block, Block>> WAXED_VARIENT_BY_BLOCK = Suppliers.memoize(() -> {
      return WAXED_VARIENT_BLOCK.get().inverse();
   });

   static Optional<Block> getWaxedVarient(Block block) {
      return Optional.ofNullable(WAXED_VARIENT_BY_BLOCK.get().get(block));
   }

   static Optional<BlockState> getWaxedVarient(BlockState blockState) {
      return getWaxedVarient(blockState.getBlock()).map((block) -> {
         return block.withPropertiesOf(blockState);
      });
   }

   static Optional<Block> getNextWaxed(Block block) {
      return Optional.ofNullable(NEXT_BY_BLOCK_STAIR.get().get(block));
   }

}

