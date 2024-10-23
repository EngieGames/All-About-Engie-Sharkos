
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.OldMythicSharkoEntity;
import net.mcreator.aaesharkos.client.model.Modeloldboyo;

public class OldMythicSharkoRenderer extends MobRenderer<OldMythicSharkoEntity, Modeloldboyo<OldMythicSharkoEntity>> {
	public OldMythicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloldboyo(context.bakeLayer(Modeloldboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OldMythicSharkoEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyomythicold.png");
	}
}
