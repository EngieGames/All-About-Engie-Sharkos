
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.LegendarySharkoStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class LegendarySharkoStayRenderer extends MobRenderer<LegendarySharkoStayEntity, Modelboyosit<LegendarySharkoStayEntity>> {
	public LegendarySharkoStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyolegendt.png");
	}
}
