package net.mcreator.aaesharkos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.aaesharkos.init.AaeSharkosModEntities;
import net.mcreator.aaesharkos.entity.EngieSharkoRAREStayEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRAREAttackEntity;

public class EngieSharkoRARETPProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOODEN_SWORD) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new EngieSharkoRAREAttackEntity(AaeSharkosModEntities.ENGIE_SHARKO_RARE_ATTACK.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new EngieSharkoRAREStayEntity(AaeSharkosModEntities.ENGIE_SHARKO_RARE_STAY.get(), _level);
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
