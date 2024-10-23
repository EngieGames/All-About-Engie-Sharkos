
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.AlbinoSharkoEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class AlbinoSharkoRenderer extends MobRenderer<AlbinoSharkoEntity, Modelboyo<AlbinoSharkoEntity>> {
	public AlbinoSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyoa.png");
	}
}