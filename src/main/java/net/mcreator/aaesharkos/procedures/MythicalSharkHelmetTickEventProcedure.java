package net.mcreator.aaesharkos.procedures;

import net.minecraft.world.entity.Entity;

public class MythicalSharkHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect give @p night vision 12 255 true");
		}
		if (entity.isInWater()) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect give @p water_breathing 1 255 true");
			}
		}
	}
}
