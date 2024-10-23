package net.mcreator.aaesharkos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.aaesharkos.init.AaeSharkosModItems;
import net.mcreator.aaesharkos.init.AaeSharkosModEntities;
import net.mcreator.aaesharkos.entity.MythicSharkoTamedEntity;

public class MythicSharkoTAPProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.isClientSide()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AaeSharkosModItems.GOLDEN_COOKIE.get()) {
				if (Math.random() >= 0.85) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MythicSharkoTamedEntity(AaeSharkosModEntities.MYTHIC_SHARKO_TAMED.get(), _level);
						entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(AaeSharkosModItems.GOLDEN_COOKIE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(AaeSharkosModItems.GOLDEN_COOKIE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
