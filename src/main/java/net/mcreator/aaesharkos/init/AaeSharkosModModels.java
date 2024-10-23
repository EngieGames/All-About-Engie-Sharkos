
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaesharkos.client.model.Modeloldboyo;
import net.mcreator.aaesharkos.client.model.Modelboyosit;
import net.mcreator.aaesharkos.client.model.Modelboyo;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AaeSharkosModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelboyo.LAYER_LOCATION, Modelboyo::createBodyLayer);
		event.registerLayerDefinition(Modelboyosit.LAYER_LOCATION, Modelboyosit::createBodyLayer);
		event.registerLayerDefinition(Modeloldboyo.LAYER_LOCATION, Modeloldboyo::createBodyLayer);
		event.registerLayerDefinition(Modelbboyo.LAYER_LOCATION, Modelbboyo::createBodyLayer);
	}
}
