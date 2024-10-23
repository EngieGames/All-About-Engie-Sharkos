
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.aaesharkos.block.SharkoHouseSpawnerBlock;
import net.mcreator.aaesharkos.AaeSharkosMod;

public class AaeSharkosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AaeSharkosMod.MODID);
	public static final RegistryObject<Block> SHARKO_HOUSE_SPAWNER = REGISTRY.register("sharko_house_spawner", () -> new SharkoHouseSpawnerBlock());
}
