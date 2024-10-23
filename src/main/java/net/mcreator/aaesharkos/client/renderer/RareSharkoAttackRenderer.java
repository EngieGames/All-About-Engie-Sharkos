
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.RareSharkoAttackEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class RareSharkoAttackRenderer extends MobRenderer<RareSharkoAttackEntity, Modelboyo<RareSharkoAttackEntity>> {
	public RareSharkoAttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoAttackEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyorat.png");
	}
}
