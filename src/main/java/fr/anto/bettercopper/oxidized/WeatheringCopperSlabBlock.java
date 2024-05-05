package fr.anto.bettercopper.oxidized;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class WeatheringCopperSlabBlock extends SlabBlock implements WeatheringCopper {
   private final WeatherState weatherState;
   private final Waxedorno waxedorno;

   public WeatheringCopperSlabBlock(WeatherState State, Properties properties, Waxedorno waxedorno) {
      super(properties);
      this.weatherState = State;
      this.waxedorno = waxedorno;
   }

   public void randomTick(BlockState bstate, ServerLevel slevel, BlockPos bpos, RandomSource rsource) {
      this.changeOverTime(bstate, slevel, bpos, rsource);
   }

   @Override
   public InteractionResult use(BlockState bstate, Level level, BlockPos Bpos, Player player, InteractionHand hand, BlockHitResult hitResult) {

      Level world = player.level();
      ItemStack heldItem = player.getItemInHand(hand);
      Item heldItemItem = heldItem.getItem();

      if (heldItemItem instanceof AxeItem) {

         Block clickedBlock = bstate.getBlock();

         if (clickedBlock instanceof WeatheringCopperSlabBlock weatheringCopperBlock) {

            if (weatheringCopperBlock.getAge() != WeatherState.UNAFFECTED) {

               if (WeatheringCopper.getPrevious(bstate).isPresent()) {

                  WeatheringCopper.getPrevious(bstate).ifPresent((state) -> {
                     level.setBlockAndUpdate(Bpos, state);
                     player.swing(player.getUsedItemHand());
                     player.playSound(SoundEvents.AXE_SCRAPE);

                     if (heldItem.isDamageableItem()) {
                        heldItem.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                     }

                     for (int i = 0; i < 10; i++) {
                        double offsetX = world.random.nextDouble() * 0.6 - 0.15; // Décalage X aléatoire
                        double offsetY = world.random.nextDouble() * 0.75 - 0.15; // Décalage Y aléatoire
                        double offsetZ = world.random.nextDouble() * 0.75 - 0.15; // Décalage Z aléatoire

                        world.addParticle(ParticleTypes.SCRAPE, Bpos.getX() + 0.5 + offsetX, Bpos.getY() + 0.5 + offsetY, Bpos.getZ() + 0.5 + offsetZ, 0, 0, 0);
                     }
                  });
               }
            }
         }
      }

      if (heldItemItem instanceof AxeItem) {

         Block clickedBlock = bstate.getBlock();

         if (clickedBlock instanceof WeatheringCopperSlabBlock weatheringCopperBlock) {
            if (weatheringCopperBlock.waxedorno == WeatheringCopper.Waxedorno.Waxed){
                  WeatheringCopper.getWaxedVarient(bstate).ifPresent((state) -> {
                     level.setBlockAndUpdate(Bpos, state);
                     player.swing(player.getUsedItemHand());
                     player.playSound(SoundEvents.AXE_SCRAPE);

                     if (heldItem.isDamageableItem()) {
                        heldItem.hurtAndBreak(1, player, (entity) -> entity.broadcastBreakEvent(hand));
                     }

                     for (int i = 0; i < 10; i++) {
                        double offsetX = world.random.nextDouble() * 0.6 - 0.15; // Décalage X aléatoire
                        double offsetY = world.random.nextDouble() * 0.75 - 0.15; // Décalage Y aléatoire
                        double offsetZ = world.random.nextDouble() * 0.75 - 0.15; // Décalage Z aléatoire

                        world.addParticle(ParticleTypes.WAX_OFF, Bpos.getX() + 0.5 + offsetX, Bpos.getY() + 0.5 + offsetY, Bpos.getZ() + 0.5 + offsetZ, 0, 0, 0);
                     }
                  });

            }
         }
      }

      if (heldItemItem == Items.HONEYCOMB) {

         Block clickedBlock = bstate.getBlock();

         if (clickedBlock instanceof WeatheringCopperSlabBlock weatheringCopperBlock && weatheringCopperBlock.waxedorno == WeatheringCopper.Waxedorno.noWaxed) {
            WeatheringCopper.getWaxedVarient(bstate).ifPresent((state) -> {
               level.setBlockAndUpdate(Bpos, state);
               player.swing(player.getUsedItemHand());
               player.playSound(SoundEvents.HONEYCOMB_WAX_ON);

               if (!player.getAbilities().instabuild) {
                  heldItem.shrink(1);
               }

               for (int i = 0; i < 10; i++) {
                  double offsetX = world.random.nextDouble() * 0.6 - 0.15; // Décalage X aléatoire
                  double offsetY = world.random.nextDouble() * 0.75 - 0.15; // Décalage Y aléatoire
                  double offsetZ = world.random.nextDouble() * 0.75 - 0.15; // Décalage Z aléatoire

                  world.addParticle(ParticleTypes.WAX_ON, Bpos.getX() + 0.5 + offsetX, Bpos.getY() + 0.5 + offsetY, Bpos.getZ() + 0.5 + offsetZ, 0, 0, 0);
               }
            });
         }
      }
      return super.use(bstate, level, Bpos, player, hand, hitResult);
   }

   public boolean isRandomlyTicking(BlockState state) {
      return WeatheringCopper.getNext(state.getBlock()).isPresent();
   }

   public WeatherState getAge() {
      return this.weatherState;
   }
}