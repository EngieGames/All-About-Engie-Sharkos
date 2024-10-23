
package net.mcreator.aaesharkos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aaesharkos.init.AaeSharkosModTabs;

public class MythicSharkoPlushItem extends Item {
	public MythicSharkoPlushItem() {
		super(new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
