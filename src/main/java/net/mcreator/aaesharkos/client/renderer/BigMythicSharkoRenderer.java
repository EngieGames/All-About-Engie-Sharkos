
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.BigMythicSharkoEntity;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

public class BigMythicSharkoRenderer extends MobRenderer<BigMythicSharkoEntity, Modelbboyo<BigMythicSharkoEntity>> {
	public BigMythicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/bboyomythic.png");
	}
}
