
package net.mcreator.aaesharkos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.aaesharkos.procedures.ExoticCookiePlayerFinishesUsingItemProcedure;
import net.mcreator.aaesharkos.init.AaeSharkosModTabs;

public class ExoticCookieItem extends Item {
	public ExoticCookieItem() {
		super(new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationMod(9.6f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ExoticCookiePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
