
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoRARE2AttackEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class EngieSharkoRARE2AttackRenderer extends MobRenderer<EngieSharkoRARE2AttackEntity, Modelboyo<EngieSharkoRARE2AttackEntity>> {
	public EngieSharkoRARE2AttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRARE2AttackEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/re2boyot.png");
	}
}
