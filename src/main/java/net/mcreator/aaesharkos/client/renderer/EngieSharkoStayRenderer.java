
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class EngieSharkoStayRenderer extends MobRenderer<EngieSharkoStayEntity, Modelboyosit<EngieSharkoStayEntity>> {
	public EngieSharkoStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyoet.png");
	}
}
