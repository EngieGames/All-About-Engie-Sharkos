
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

import net.mcreator.aaesharkos.procedures.EngieSharkLeggingsTickProcedure;
import net.mcreator.aaesharkos.procedures.EngieSharkHelmTickProcedure;
import net.mcreator.aaesharkos.procedures.EngieSharkChestplateTickProcedure;
import net.mcreator.aaesharkos.procedures.EngieSharkBootsTickProcedure;
import net.mcreator.aaesharkos.init.AaeSharkosModTabs;
import net.mcreator.aaesharkos.init.AaeSharkosModItems;

public abstract class EngieSharkItem extends ArmorItem {
	public EngieSharkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1024, 1024, 1024, 1024}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeSharkosModItems.ENGIE_SHARKO_CLOTH.get()));
			}

			@Override
			public String getName() {
				return "engie_shark";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 3.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EngieSharkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/engiesharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EngieSharkHelmTickProcedure.execute(entity);
		}
	}

	public static class Chestplate extends EngieSharkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/engiesharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EngieSharkChestplateTickProcedure.execute(entity);
		}
	}

	public static class Leggings extends EngieSharkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/engiesharko__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EngieSharkLeggingsTickProcedure.execute(entity);
		}
	}

	public static class Boots extends EngieSharkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_sharkos:textures/models/armor/engiesharko__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EngieSharkBootsTickProcedure.execute(entity);
		}
	}
}
