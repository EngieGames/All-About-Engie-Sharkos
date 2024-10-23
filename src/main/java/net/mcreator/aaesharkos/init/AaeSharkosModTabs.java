
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AaeSharkosModTabs {
	public static CreativeModeTab TAB_EXTRAS;

	public static void load() {
		TAB_EXTRAS = new CreativeModeTab("tabextras") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.COOKIE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
