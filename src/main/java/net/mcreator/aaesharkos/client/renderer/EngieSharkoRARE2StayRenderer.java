
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoRARE2StayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class EngieSharkoRARE2StayRenderer extends MobRenderer<EngieSharkoRARE2StayEntity, Modelboyosit<EngieSharkoRARE2StayEntity>> {
	public EngieSharkoRARE2StayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRARE2StayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/re2boyot.png");
	}
}
