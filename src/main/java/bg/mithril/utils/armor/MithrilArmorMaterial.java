package bg.mithril.utils.armor;

import bg.mithril.utils.items.MithrilUtilsItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class MithrilArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {6, 8, 10, 6};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 42;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 20;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(MithrilUtilsItems.MITHRIL_INGOT);
	}
 
	@Override
	public String getName() {
		return "mithril";
	}
 
	@Override
	public float getToughness() {
		return 4.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0.1F;
	}
}