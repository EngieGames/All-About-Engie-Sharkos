
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

import net.mcreator.aaesharkos.procedures.RareSharkLeggingsTickEventProcedure;
import net.mcreator.aaesharkos.procedures.RareSharkHelmetTickEventProcedure;
import net.mcreator.aaesharkos.procedures.RareSharkChestplateTickEventProcedure;
import net.mcreator.aaesharkos.procedures.RareSharkBootsTickEventProcedure;
import net.mcreator.aaesharkos.init.AaeSharkosModTabs;
import net.mcreator.aaesharkos.init.AaeSharkosModItems;

public abstract class RareSharkItem extends ArmorItem {
	public RareSharkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1000, 1000, 1000, 1000}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COOKIE), new ItemStack(AaeSharkosModItems.RARE_SHARKO_CLOTH.get()));
			}

			@Override
			public String getName() {
				return "rare_shark";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.6f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RareSharkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/raresharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RareSharkHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends RareSharkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/raresharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RareSharkChestplateTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends RareSharkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/raresharko__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RareSharkLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends RareSharkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/raresharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RareSharkBootsTickEventProcedure.execute(entity);
		}
	}
}
