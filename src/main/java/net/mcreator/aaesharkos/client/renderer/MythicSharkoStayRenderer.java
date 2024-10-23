
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.MythicSharkoStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class MythicSharkoStayRenderer extends MobRenderer<MythicSharkoStayEntity, Modelboyosit<MythicSharkoStayEntity>> {
	public MythicSharkoStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyomythict.png");
	}
}
