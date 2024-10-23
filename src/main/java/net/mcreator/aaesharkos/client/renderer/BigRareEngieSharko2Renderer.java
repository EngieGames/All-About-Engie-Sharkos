
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.BigRareEngieSharko2Entity;
import net.mcreator.aaesharkos.client.model.Modelbboyo;

public class BigRareEngieSharko2Renderer extends MobRenderer<BigRareEngieSharko2Entity, Modelbboyo<BigRareEngieSharko2Entity>> {
	public BigRareEngieSharko2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareEngieSharko2Entity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/re2bboyo.png");
	}
}
