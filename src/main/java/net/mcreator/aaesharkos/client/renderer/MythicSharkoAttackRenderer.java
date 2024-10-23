
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.MythicSharkoAttackEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class MythicSharkoAttackRenderer extends MobRenderer<MythicSharkoAttackEntity, Modelboyo<MythicSharkoAttackEntity>> {
	public MythicSharkoAttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoAttackEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyomythict.png");
	}
}
