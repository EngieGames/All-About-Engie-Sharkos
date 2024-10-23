
package net.mcreator.aaesharkos.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaesharkos.procedures.MythicalSharkLeggingsTickEventProcedure;
import net.mcreator.aaesharkos.procedures.MythicalSharkHelmetTickEventProcedure;
import net.mcreator.aaesharkos.procedures.MythicalSharkChestplateTickEventProcedure;
import net.mcreator.aaesharkos.procedures.MythicalSharkBootsTickEventProcedure;
import net.mcreator.aaesharkos.init.AaeSharkosModTabs;
import net.mcreator.aaesharkos.init.AaeSharkosModItems;

public abstract class MythicSharkItem extends ArmorItem {
	public MythicSharkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 250;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1024, 1024, 1024, 1024}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 36;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeSharkosModItems.GOLDEN_COOKIE.get()), new ItemStack(AaeSharkosModItems.MYTHIC_SHARKO_CLOTH.get()));
			}

			@Override
			public String getName() {
				return "mythic_shark";
			}

			@Override
			public float getToughness() {
				return 8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.6f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MythicSharkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/mythicsharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MythicalSharkHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends MythicSharkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/mythicsharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MythicalSharkChestplateTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends MythicSharkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/mythicsharko__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MythicalSharkLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends MythicSharkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/mythicsharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MythicalSharkBootsTickEventProcedure.execute(entity);
		}
	}
}
