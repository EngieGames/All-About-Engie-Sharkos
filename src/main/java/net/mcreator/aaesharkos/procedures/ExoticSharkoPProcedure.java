package net.mcreator.aaesharkos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.aaesharkos.init.AaeSharkosModEntities;
import net.mcreator.aaesharkos.entity.ExoticSharkoTamedEntity;

public class ExoticSharkoPProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sharkoAttackTimer", (entity.getPersistentData().getDouble("sharkoAttackTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoAttackTimer") >= 30) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ExoticSharkoTamedEntity(AaeSharkosModEntities.EXOTIC_SHARKO_TAMED.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
