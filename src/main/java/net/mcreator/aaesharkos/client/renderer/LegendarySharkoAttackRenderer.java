
package net.mcreator.aaesharkos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaesharkos.entity.LegendarySharkoAttackEntity;
import net.mcreator.aaesharkos.client.model.Modelboyo;

public class LegendarySharkoAttackRenderer extends MobRenderer<LegendarySharkoAttackEntity, Modelboyo<LegendarySharkoAttackEntity>> {
	public LegendarySharkoAttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoAttackEntity entity) {
		return new ResourceLocation("aae_sharkos:textures/entities/boyolegendt.png");
	}
}
