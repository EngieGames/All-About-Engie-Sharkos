
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoRARE2TamedEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class EngieSharkoRARE2TamedRenderer extends MobRenderer<EngieSharkoRARE2TamedEntity, Modelboyo<EngieSharkoRARE2TamedEntity>> {
	public EngieSharkoRARE2TamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRARE2TamedEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/re2boyot.png");
	}
}
