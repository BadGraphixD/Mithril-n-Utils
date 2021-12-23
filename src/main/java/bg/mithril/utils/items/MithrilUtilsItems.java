package bg.mithril.utils.items;

import bg.mithril.utils.MithrilUtilsMod;
import bg.mithril.utils.armor.MithrilArmorMaterial;
import bg.mithril.utils.blocks.MithrilUtilsBlocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MithrilUtilsItems {
    public static final Item PORTAL_CALCULATOR = new PortalCalculatorItem(new Item.Settings().group(ItemGroup.TOOLS));

    public static final Item MOLD = new Item(new Item.Settings().group(ItemGroup.MISC).fireproof());
    public static final Item MITHRIL_MOLD = new MithrilMoldItem(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON).fireproof());
    public static final Item MITHRIL_CLUMP = new Item(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON).fireproof());
    public static final Item MITHRIL_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON).fireproof());

    public static final Item COLD_MITHRIL_ORE_0 = new BlockItem(MithrilUtilsBlocks.COLD_MITHRIL_ORE_0, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    public static final Item COLD_MITHRIL_ORE_1 = new BlockItem(MithrilUtilsBlocks.COLD_MITHRIL_ORE_1, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    public static final Item MITHRIL_ORE = new BlockItem(MithrilUtilsBlocks.MITHRIL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    public static final Item MITHRIL_BLOCK = new BlockItem(MithrilUtilsBlocks.MITHRIL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static final ArmorMaterial MITHRIL_ARMOR_MATERIAL = new MithrilArmorMaterial();

    public static final Item MITHRIL_HELMET = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item MITHRIL_CHESTPLATE = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item MITHRIL_LEGGINGS = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item MITHRIL_BOOTS = new ArmorItem(MITHRIL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof().rarity(Rarity.UNCOMMON));

    public static void init() {
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("portal_calculator"), PORTAL_CALCULATOR);

        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mold"), MOLD);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_mold"), MITHRIL_MOLD);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_clump"), MITHRIL_CLUMP);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_ingot"), MITHRIL_INGOT);
        
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("cold_mithril_ore_0"), COLD_MITHRIL_ORE_0);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("cold_mithril_ore_1"), COLD_MITHRIL_ORE_1);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_block"), MITHRIL_BLOCK);

        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_helmet"), MITHRIL_HELMET);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_chestplate"), MITHRIL_CHESTPLATE);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_leggings"), MITHRIL_LEGGINGS);
        Registry.register(Registry.ITEM, MithrilUtilsMod.id("mithril_boots"), MITHRIL_BOOTS);
    }
  
}
