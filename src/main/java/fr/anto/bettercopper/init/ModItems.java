package fr.anto.bettercopper.init;

import fr.anto.bettercopper.bettercopper;
import fr.anto.bettercopper.utils.CustomArmorMaterials;
import fr.anto.bettercopper.utils.CustomItemTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, bettercopper.MODID);

    //public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->new ShovelItem(CustomItemTiers.COPPER, 1.5F, -3.0f, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () ->new SwordItem(CustomItemTiers.COPPER, 3, -2.4f, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->new PickaxeItem(CustomItemTiers.COPPER, 1, -2.8f, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () ->new AxeItem(CustomItemTiers.COPPER, 6.0F, -3.1F, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () ->new HoeItem(CustomItemTiers.COPPER, -2, -1.0F, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlot.FEET, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () ->new HorseArmorItem( 8, "copper", new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> COPPER_HEART = ITEMS.register("copper_heart", () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_FOOD)
            .food(new FoodProperties.Builder().nutrition(20).saturationMod(1f).fast().effect(new MobEffectInstance(MobEffects.REGENERATION, 20,254),1).build())));

}

