
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.BigSharkoEntity;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

public class BigSharkoRenderer extends MobRenderer<BigSharkoEntity, Modelbboyo<BigSharkoEntity>> {
	public BigSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigSharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/bboyo.png");
	}
}
