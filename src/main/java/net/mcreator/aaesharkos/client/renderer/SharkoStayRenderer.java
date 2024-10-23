
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.SharkoStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class SharkoStayRenderer extends MobRenderer<SharkoStayEntity, Modelboyosit<SharkoStayEntity>> {
	public SharkoStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SharkoStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyot.png");
	}
}
