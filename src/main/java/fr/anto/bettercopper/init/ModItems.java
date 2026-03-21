package fr.anto.bettercopper.init;

import fr.anto.bettercopper.bettercopper;
import fr.anto.bettercopper.utils.CustomArmorMaterials;
import fr.anto.bettercopper.utils.CustomItemTiers;
import fr.anto.bettercopper.utils.HeartItem;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(bettercopper.MODID);

    //public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.registerSimpleItem("copper_nugget", new Item.Properties());

    public static final Supplier<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () ->new SwordItem(CustomItemTiers.COPPER_TIER, new Item.Properties().attributes(SwordItem.createAttributes(CustomItemTiers.COPPER_TIER, 3, -2.4f))));
    public static final Supplier<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->new PickaxeItem(CustomItemTiers.COPPER_TIER, new Item.Properties().attributes(PickaxeItem.createAttributes(CustomItemTiers.COPPER_TIER, 1, -2.8f))));
    public static final Supplier<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->new AxeItem(CustomItemTiers.COPPER_TIER, new Item.Properties().attributes(AxeItem.createAttributes(CustomItemTiers.COPPER_TIER, 6.0F, -3.1F))));
    public static final Supplier<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->new ShovelItem(CustomItemTiers.COPPER_TIER, new Item.Properties().attributes(ShovelItem.createAttributes(CustomItemTiers.COPPER_TIER, 1.5F, -3.0f))));
    public static final Supplier<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () ->new HoeItem(CustomItemTiers.COPPER_TIER, new Item.Properties().attributes(HoeItem.createAttributes(CustomItemTiers.COPPER_TIER, -2, -1.0F))));

    public static final Supplier<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.HELMET.getDurability(13))));
    public static final Supplier<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(13))));
    public static final Supplier<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).durability(ArmorItem.Type.LEGGINGS.getDurability(13))));
    public static final Supplier<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () ->new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, ArmorItem.Type.BOOTS,new Item.Properties().stacksTo(1).durability(ArmorItem.Type.BOOTS.getDurability(13))));
    public static final Supplier<AnimalArmorItem> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () ->new AnimalArmorItem(CustomArmorMaterials.COPPER_ARMOR, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));


    public static final Supplier<Item> COPPER_HEART = ITEMS.register("copper_heart", () -> new HeartItem(new Item.Properties(), true));
    public static final Supplier<Item> REVERSED_COPPER_HEART = ITEMS.register("reversed_copper_heart", () -> new HeartItem(new Item.Properties(), false));
}

