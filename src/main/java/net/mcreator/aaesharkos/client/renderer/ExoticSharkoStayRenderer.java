
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.ExoticSharkoStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class ExoticSharkoStayRenderer extends MobRenderer<ExoticSharkoStayEntity, Modelboyosit<ExoticSharkoStayEntity>> {
	public ExoticSharkoStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyoexotict.png");
	}
}
