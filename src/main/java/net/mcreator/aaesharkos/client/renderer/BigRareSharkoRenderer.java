
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.BigRareSharkoEntity;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

public class BigRareSharkoRenderer extends MobRenderer<BigRareSharkoEntity, Modelbboyo<BigRareSharkoEntity>> {
	public BigRareSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/bboyora.png");
	}
}
