
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aaesharkos.item.SharkoPlushItem;
import net.mcreator.aaesharkos.item.SharkoClothItem;
import net.mcreator.aaesharkos.item.SharkItem;
import net.mcreator.aaesharkos.item.RareSharkoPlushItem;
import net.mcreator.aaesharkos.item.RareSharkoClothItem;
import net.mcreator.aaesharkos.item.RareSharkItem;
import net.mcreator.aaesharkos.item.RareEngieSharkoPlushItem;
import net.mcreator.aaesharkos.item.MythicSharkoPlushItem;
import net.mcreator.aaesharkos.item.MythicSharkoClothItem;
import net.mcreator.aaesharkos.item.MythicSharkItem;
import net.mcreator.aaesharkos.item.LegendarySharkoPlushItem;
import net.mcreator.aaesharkos.item.LegendarySharkoClothItem;
import net.mcreator.aaesharkos.item.LegendarySharkItem;
import net.mcreator.aaesharkos.item.GoldenCookieItem;
import net.mcreator.aaesharkos.item.ExoticSharkoPlushItem;
import net.mcreator.aaesharkos.item.ExoticSharkoClothItem;
import net.mcreator.aaesharkos.item.ExoticSharkItem;
import net.mcreator.aaesharkos.item.ExoticCookieItem;
import net.mcreator.aaesharkos.item.EngieSharkoPlushItem;
import net.mcreator.aaesharkos.item.EngieSharkoClothItem;
import net.mcreator.aaesharkos.item.EngieSharkItem;
import net.mcreator.aaesharkos.item.EngieCookieItem;
import net.mcreator.aaesharkos.item.EnchantedGoldenCookieItem;
import net.mcreator.aaesharkos.item.EnchantedExoticCookieItem;
import net.mcreator.aaesharkos.item.EnchantedEngieCookieItem;
import net.mcreator.aaesharkos.item.AlbinoSharkoPlushItem;
import net.mcreator.aaesharkos.item.AlbinoSharkoClothItem;
import net.mcreator.aaesharkos.item.AlbinoSharkItem;
import net.mcreator.aaesharkos.AaeSharkosMod;

public class AaeSharkosModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AaeSharkosMod.MODID);
	public static final RegistryObject<Item> SHARK_HELMET = REGISTRY.register("shark_helmet", () -> new SharkItem.Helmet());
	public static final RegistryObject<Item> SHARK_CHESTPLATE = REGISTRY.register("shark_chestplate", () -> new SharkItem.Chestplate());
	public static final RegistryObject<Item> SHARK_LEGGINGS = REGISTRY.register("shark_leggings", () -> new SharkItem.Leggings());
	public static final RegistryObject<Item> SHARK_BOOTS = REGISTRY.register("shark_boots", () -> new SharkItem.Boots());
	public static final RegistryObject<Item> SHARKO_CLOTH = REGISTRY.register("sharko_cloth", () -> new SharkoClothItem());
	public static final RegistryObject<Item> ALBINO_SHARKO_CLOTH = REGISTRY.register("albino_sharko_cloth", () -> new AlbinoSharkoClothItem());
	public static final RegistryObject<Item> RARE_SHARKO_CLOTH = REGISTRY.register("rare_sharko_cloth", () -> new RareSharkoClothItem());
	public static final RegistryObject<Item> ALBINO_SHARK_HELMET = REGISTRY.register("albino_shark_helmet", () -> new AlbinoSharkItem.Helmet());
	public static final RegistryObject<Item> ALBINO_SHARK_CHESTPLATE = REGISTRY.register("albino_shark_chestplate", () -> new AlbinoSharkItem.Chestplate());
	public static final RegistryObject<Item> ALBINO_SHARK_LEGGINGS = REGISTRY.register("albino_shark_leggings", () -> new AlbinoSharkItem.Leggings());
	public static final RegistryObject<Item> ALBINO_SHARK_BOOTS = REGISTRY.register("albino_shark_boots", () -> new AlbinoSharkItem.Boots());
	public static final RegistryObject<Item> RARE_SHARK_HELMET = REGISTRY.register("rare_shark_helmet", () -> new RareSharkItem.Helmet());
	public static final RegistryObject<Item> RARE_SHARK_CHESTPLATE = REGISTRY.register("rare_shark_chestplate", () -> new RareSharkItem.Chestplate());
	public static final RegistryObject<Item> RARE_SHARK_LEGGINGS = REGISTRY.register("rare_shark_leggings", () -> new RareSharkItem.Leggings());
	public static final RegistryObject<Item> RARE_SHARK_BOOTS = REGISTRY.register("rare_shark_boots", () -> new RareSharkItem.Boots());
	public static final RegistryObject<Item> LEGENDARY_SHARKO_CLOTH = REGISTRY.register("legendary_sharko_cloth", () -> new LegendarySharkoClothItem());
	public static final RegistryObject<Item> LEGENDARY_SHARK_HELMET = REGISTRY.register("legendary_shark_helmet", () -> new LegendarySharkItem.Helmet());
	public static final RegistryObject<Item> LEGENDARY_SHARK_CHESTPLATE = REGISTRY.register("legendary_shark_chestplate", () -> new LegendarySharkItem.Chestplate());
	public static final RegistryObject<Item> LEGENDARY_SHARK_LEGGINGS = REGISTRY.register("legendary_shark_leggings", () -> new LegendarySharkItem.Leggings());
	public static final RegistryObject<Item> LEGENDARY_SHARK_BOOTS = REGISTRY.register("legendary_shark_boots", () -> new LegendarySharkItem.Boots());
	public static final RegistryObject<Item> SHARKO_PLUSH = REGISTRY.register("sharko_plush", () -> new SharkoPlushItem());
	public static final RegistryObject<Item> ALBINO_SHARKO_PLUSH = REGISTRY.register("albino_sharko_plush", () -> new AlbinoSharkoPlushItem());
	public static final RegistryObject<Item> RARE_SHARKO_PLUSH = REGISTRY.register("rare_sharko_plush", () -> new RareSharkoPlushItem());
	public static final RegistryObject<Item> LEGENDARY_SHARKO_PLUSH = REGISTRY.register("legendary_sharko_plush", () -> new LegendarySharkoPlushItem());
	public static final RegistryObject<Item> MYTHIC_SHARKO_PLUSH = REGISTRY.register("mythic_sharko_plush", () -> new MythicSharkoPlushItem());
	public static final RegistryObject<Item> MYTHIC_SHARK_HELMET = REGISTRY.register("mythic_shark_helmet", () -> new MythicSharkItem.Helmet());
	public static final RegistryObject<Item> MYTHIC_SHARK_CHESTPLATE = REGISTRY.register("mythic_shark_chestplate", () -> new MythicSharkItem.Chestplate());
	public static final RegistryObject<Item> MYTHIC_SHARK_LEGGINGS = REGISTRY.register("mythic_shark_leggings", () -> new MythicSharkItem.Leggings());
	public static final RegistryObject<Item> MYTHIC_SHARK_BOOTS = REGISTRY.register("mythic_shark_boots", () -> new MythicSharkItem.Boots());
	public static final RegistryObject<Item> MYTHIC_SHARKO_CLOTH = REGISTRY.register("mythic_sharko_cloth", () -> new MythicSharkoClothItem());
	public static final RegistryObject<Item> GOLDEN_COOKIE = REGISTRY.register("golden_cookie", () -> new GoldenCookieItem());
	public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKIE = REGISTRY.register("enchanted_golden_cookie", () -> new EnchantedGoldenCookieItem());
	public static final RegistryObject<Item> SHARKO_SPAWN_EGG = REGISTRY.register("sharko_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.SHARKO, -12420148, -1, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.SHARKO_TAMED, -12420148, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("sharko_attack_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.SHARKO_ATTACK, -12420148, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SHARKO_STAY_SPAWN_EGG = REGISTRY.register("sharko_stay_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.SHARKO_STAY, -12420148, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALBINO_SHARKO_SPAWN_EGG = REGISTRY.register("albino_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ALBINO_SHARKO, -1644826, -1, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> ALBINO_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("albino_sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.ALBINO_SHARKO_TAMED, -1644826, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALBINO_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("albino_sharko_attack_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.ALBINO_SHARKO_ATTACK, -1644826, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALBINO_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("albino_sharko_stay_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.ALBINO_SHARKO_STAY, -1644826, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RARE_SHARKO_SPAWN_EGG = REGISTRY.register("rare_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.RARE_SHARKO, -1644826, -10450, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> RARE_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("rare_sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.RARE_SHARKO_TAMED, -1644826, -10450, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RARE_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("rare_sharko_attack_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.RARE_SHARKO_ATTACK, -1644826, -10450, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RARE_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("rare_sharko_stay_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.RARE_SHARKO_STAY, -1644826, -10450, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_SPAWN_EGG = REGISTRY.register("legendary_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.LEGENDARY_SHARKO, -12544, -7680, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("legendary_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.LEGENDARY_SHARKO_TAMED, -12544, -7680, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("legendary_sharko_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.LEGENDARY_SHARKO_ATTACK, -12544, -7680, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("legendary_sharko_stay_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.LEGENDARY_SHARKO_STAY, -12544, -7680, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_SPAWN_EGG = REGISTRY.register("mythic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.MYTHIC_SHARKO, -1512448, -196864, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("mythic_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.MYTHIC_SHARKO_TAMED, -1512448, -196864, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("mythic_sharko_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.MYTHIC_SHARKO_ATTACK, -1512448, -196864, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("mythic_sharko_stay_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.MYTHIC_SHARKO_STAY, -1512448, -196864, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_PLUSH = REGISTRY.register("exotic_sharko_plush", () -> new ExoticSharkoPlushItem());
	public static final RegistryObject<Item> EXOTIC_SHARKO_CLOTH = REGISTRY.register("exotic_sharko_cloth", () -> new ExoticSharkoClothItem());
	public static final RegistryObject<Item> EXOTIC_SHARK_HELMET = REGISTRY.register("exotic_shark_helmet", () -> new ExoticSharkItem.Helmet());
	public static final RegistryObject<Item> EXOTIC_SHARK_CHESTPLATE = REGISTRY.register("exotic_shark_chestplate", () -> new ExoticSharkItem.Chestplate());
	public static final RegistryObject<Item> EXOTIC_SHARK_LEGGINGS = REGISTRY.register("exotic_shark_leggings", () -> new ExoticSharkItem.Leggings());
	public static final RegistryObject<Item> EXOTIC_SHARK_BOOTS = REGISTRY.register("exotic_shark_boots", () -> new ExoticSharkItem.Boots());
	public static final RegistryObject<Item> EXOTIC_COOKIE = REGISTRY.register("exotic_cookie", () -> new ExoticCookieItem());
	public static final RegistryObject<Item> ENCHANTED_EXOTIC_COOKIE = REGISTRY.register("enchanted_exotic_cookie", () -> new EnchantedExoticCookieItem());
	public static final RegistryObject<Item> EXOTIC_SHARKO_SPAWN_EGG = REGISTRY.register("exotic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.EXOTIC_SHARKO, -16714511, -12845059, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("exotic_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.EXOTIC_SHARKO_TAMED, -16714511, -12845059, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("exotic_sharko_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.EXOTIC_SHARKO_ATTACK, -16714511, -12845059, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("exotic_sharko_stay_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.EXOTIC_SHARKO_STAY, -16714511, -12845059, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_COOKIE = REGISTRY.register("engie_cookie", () -> new EngieCookieItem());
	public static final RegistryObject<Item> ENCHANTED_ENGIE_COOKIE = REGISTRY.register("enchanted_engie_cookie", () -> new EnchantedEngieCookieItem());
	public static final RegistryObject<Item> ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO, -16250872, -7271155, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_TAMED, -16250872, -7271155, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_ATTACK_SPAWN_EGG = REGISTRY.register("engie_sharko_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_ATTACK, -16250872, -7271155, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_STAY_SPAWN_EGG = REGISTRY.register("engie_sharko_stay_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_STAY, -16250872, -7271155, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_CLOTH = REGISTRY.register("engie_sharko_cloth", () -> new EngieSharkoClothItem());
	public static final RegistryObject<Item> ENGIE_SHARK_HELMET = REGISTRY.register("engie_shark_helmet", () -> new EngieSharkItem.Helmet());
	public static final RegistryObject<Item> ENGIE_SHARK_CHESTPLATE = REGISTRY.register("engie_shark_chestplate", () -> new EngieSharkItem.Chestplate());
	public static final RegistryObject<Item> ENGIE_SHARK_LEGGINGS = REGISTRY.register("engie_shark_leggings", () -> new EngieSharkItem.Leggings());
	public static final RegistryObject<Item> ENGIE_SHARK_BOOTS = REGISTRY.register("engie_shark_boots", () -> new EngieSharkItem.Boots());
	public static final RegistryObject<Item> SHARKO_HOUSE_SPAWNER = block(AaeSharkosModBlocks.SHARKO_HOUSE_SPAWNER, null);
	public static final RegistryObject<Item> ENGIE_SHARKO_PLUSH = REGISTRY.register("engie_sharko_plush", () -> new EngieSharkoPlushItem());
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_TAMED, -1, -2788547, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_ATTACK_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_ATTACK, -1, -2788547, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_STAY_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_stay_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_STAY, -1, -2788547, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2, -5329997, -13551280, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_TAMED, -5329997, -13551280, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_ATTACK_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_ATTACK, -5329997, -13551280, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_STAY_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_stay_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_STAY, -5329997, -13551280, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.ENGIE_SHARKO_RARE, -1, -2788547, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> RARE_ENGIE_SHARKO_PLUSH = REGISTRY.register("rare_engie_sharko_plush", () -> new RareEngieSharkoPlushItem());
	public static final RegistryObject<Item> BIG_SHARKO_SPAWN_EGG = REGISTRY.register("big_sharko_spawn_egg", () -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_SHARKO, -12420148, -1, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_ALBINO_SHARKO_SPAWN_EGG = REGISTRY.register("big_albino_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_ALBINO_SHARKO, -1644826, -1, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_RARE_SHARKO_SPAWN_EGG = REGISTRY.register("big_rare_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_RARE_SHARKO, -1644826, -10450, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_LEGENDARY_SHARKO_SPAWN_EGG = REGISTRY.register("big_legendary_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_LEGENDARY_SHARKO, -12544, -7680, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_MYTHIC_SHARKO_SPAWN_EGG = REGISTRY.register("big_mythic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_MYTHIC_SHARKO, -1512448, -196864, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_EXOTIC_SHARKO_SPAWN_EGG = REGISTRY.register("big_exotic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_EXOTIC_SHARKO, -16714511, -12845059, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("big_engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_ENGIE_SHARKO, -16250872, -7271155, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_RARE_ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("big_rare_engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_RARE_ENGIE_SHARKO, -1, -2788547, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> BIG_RARE_ENGIE_SHARKO_2_SPAWN_EGG = REGISTRY.register("big_rare_engie_sharko_2_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.BIG_RARE_ENGIE_SHARKO_2, -5329997, -13551280, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));
	public static final RegistryObject<Item> OLD_MYTHIC_SHARKO_SPAWN_EGG = REGISTRY.register("old_mythic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AaeSharkosModEntities.OLD_MYTHIC_SHARKO, -1852652, -9141, new Item.Properties().tab(AaeSharkosModTabs.TAB_EXTRAS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
