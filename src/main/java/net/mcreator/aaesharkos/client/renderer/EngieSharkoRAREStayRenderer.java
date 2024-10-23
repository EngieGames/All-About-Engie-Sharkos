
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.EngieSharkoRAREStayEntity;
import net.mcreator.aaesharkos.client.model.Modelboyosit;

public class EngieSharkoRAREStayRenderer extends MobRenderer<EngieSharkoRAREStayEntity, Modelboyosit<EngieSharkoRAREStayEntity>> {
	public EngieSharkoRAREStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRAREStayEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/reboyot.png");
	}
}
