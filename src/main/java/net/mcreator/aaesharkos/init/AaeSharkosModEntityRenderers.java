
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaesharkos.client.renderer.SharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.SharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.SharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.SharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.RareSharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.RareSharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.RareSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.RareSharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.OldMythicSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.MythicSharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.MythicSharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.MythicSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.MythicSharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.LegendarySharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.LegendarySharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.LegendarySharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.LegendarySharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.ExoticSharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.ExoticSharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.ExoticSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.ExoticSharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARETamedRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRAREStayRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARERenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRAREAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARE2TamedRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARE2StayRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARE2Renderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoRARE2AttackRenderer;
import net.mcreator.aaesharkos.client.renderer.EngieSharkoAttackRenderer;
import net.mcreator.aaesharkos.client.renderer.BigSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigRareSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigRareEngieSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigRareEngieSharko2Renderer;
import net.mcreator.aaesharkos.client.renderer.BigMythicSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigLegendarySharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigExoticSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigEngieSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.BigAlbinoSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.AlbinoSharkoTamedRenderer;
import net.mcreator.aaesharkos.client.renderer.AlbinoSharkoStayRenderer;
import net.mcreator.aaesharkos.client.renderer.AlbinoSharkoRenderer;
import net.mcreator.aaesharkos.client.renderer.AlbinoSharkoAttackRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AaeSharkosModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AaeSharkosModEntities.SHARKO.get(), SharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.SHARKO_TAMED.get(), SharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.SHARKO_ATTACK.get(), SharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.SHARKO_STAY.get(), SharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ALBINO_SHARKO.get(), AlbinoSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ALBINO_SHARKO_ATTACK.get(), AlbinoSharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ALBINO_SHARKO_STAY.get(), AlbinoSharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.RARE_SHARKO.get(), RareSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.RARE_SHARKO_TAMED.get(), RareSharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.RARE_SHARKO_ATTACK.get(), RareSharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.RARE_SHARKO_STAY.get(), RareSharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.LEGENDARY_SHARKO.get(), LegendarySharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.LEGENDARY_SHARKO_ATTACK.get(), LegendarySharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.LEGENDARY_SHARKO_STAY.get(), LegendarySharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.MYTHIC_SHARKO.get(), MythicSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.MYTHIC_SHARKO_ATTACK.get(), MythicSharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.MYTHIC_SHARKO_STAY.get(), MythicSharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.EXOTIC_SHARKO.get(), ExoticSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.EXOTIC_SHARKO_ATTACK.get(), ExoticSharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.EXOTIC_SHARKO_STAY.get(), ExoticSharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO.get(), EngieSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_ATTACK.get(), EngieSharkoAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_STAY.get(), EngieSharkoStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRARETamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_ATTACK.get(), EngieSharkoRAREAttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_STAY.get(), EngieSharkoRAREStayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2.get(), EngieSharkoRARE2Renderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRARE2TamedRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_ATTACK.get(), EngieSharkoRARE2AttackRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE_2_STAY.get(), EngieSharkoRARE2StayRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.ENGIE_SHARKO_RARE.get(), EngieSharkoRARERenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_SHARKO.get(), BigSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_ALBINO_SHARKO.get(), BigAlbinoSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_RARE_SHARKO.get(), BigRareSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_LEGENDARY_SHARKO.get(), BigLegendarySharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_MYTHIC_SHARKO.get(), BigMythicSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_EXOTIC_SHARKO.get(), BigExoticSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_ENGIE_SHARKO.get(), BigEngieSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_RARE_ENGIE_SHARKO.get(), BigRareEngieSharkoRenderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.BIG_RARE_ENGIE_SHARKO_2.get(), BigRareEngieSharko2Renderer::new);
		event.registerEntityRenderer(AaeSharkosModEntities.OLD_MYTHIC_SHARKO.get(), OldMythicSharkoRenderer::new);
	}
}
