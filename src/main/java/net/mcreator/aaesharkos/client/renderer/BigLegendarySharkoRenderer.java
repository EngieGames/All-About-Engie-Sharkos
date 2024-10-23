
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.BigLegendarySharkoEntity;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

public class BigLegendarySharkoRenderer extends MobRenderer<BigLegendarySharkoEntity, Modelbboyo<BigLegendarySharkoEntity>> {
	public BigLegendarySharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/bboyolegend.png");
	}
}