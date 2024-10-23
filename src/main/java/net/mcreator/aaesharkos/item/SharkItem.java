
package net.mcreator.aaesharkos.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaesharkos.procedures.SharkHelmetOnEquipProcedure;
import net.mcreator.aaesharkos.init.AaeSharkosModTabs;
import net.mcreator.aaesharkos.init.AaeSharkosModItems;

public abstract class SharkItem extends ArmorItem {
	public SharkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{250, 500, 500, 500}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COOKIE), new ItemStack(AaeSharkosModItems.SHARKO_CLOTH.get()));
			}

			@Override
			public String getName() {
				return "shark";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SharkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/sharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SharkHelmetOnEquipProcedure.execute(entity);
		}
	}

	public static class Chestplate extends SharkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/sharko__layer_1.png";
		}
	}

	public static class Leggings extends SharkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/sharko__layer_2.png";
		}
	}

	public static class Boots extends SharkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/sharko__layer_1.png";
		}
	}
}
