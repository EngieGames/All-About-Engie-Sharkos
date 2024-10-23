
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoRARE2Entity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class EngieSharkoRARE2Renderer extends MobRenderer<EngieSharkoRARE2Entity, Modelboyo<EngieSharkoRARE2Entity>> {
	public EngieSharkoRARE2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRARE2Entity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/re2boyo.png");
	}
}
