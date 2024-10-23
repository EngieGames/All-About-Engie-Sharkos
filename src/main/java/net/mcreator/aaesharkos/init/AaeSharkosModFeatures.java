
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.aaesharkos.world.features.SharkoHouseFeature;
import net.mcreator.aaesharkos.world.features.NothingFeature;
import net.mcreator.aaesharkos.AaeSharkosMod;

@Mod.EventBusSubscriber
public class AaeSharkosModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AaeSharkosMod.MODID);
	public static final RegistryObject<Feature<?>> NOTHING = REGISTRY.register("nothing", NothingFeature::feature);
	public static final RegistryObject<Feature<?>> SHARKO_HOUSE = REGISTRY.register("sharko_house", SharkoHouseFeature::feature);
}
