package net.mcreator.aaesharkos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.aaesharkos.init.AaeSharkosModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class IfItemFoundDoProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.SHARK_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
					&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.SHARK_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
					&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.SHARK_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ALBINO_SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
					&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ALBINO_SHARK_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
					&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ALBINO_SHARK_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel
					&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.RARE_SHARK_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
					&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.RARE_SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
					&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.RARE_SHARK_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
					&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.RARE_SHARK_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
					&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.RARE_SHARK_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr34 && _plr34.level instanceof ServerLevel
					&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.LEGENDARY_SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr37 && _plr37.level instanceof ServerLevel
					&& _plr37.getAdvancements().getOrStartProgress(_plr37.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.LEGENDARY_SHARK_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
					&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.LEGENDARY_SHARK_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr43 && _plr43.level instanceof ServerLevel
					&& _plr43.getAdvancements().getOrStartProgress(_plr43.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.LEGENDARY_SHARK_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr46 && _plr46.level instanceof ServerLevel
					&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.MYTHIC_SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr49 && _plr49.level instanceof ServerLevel
					&& _plr49.getAdvancements().getOrStartProgress(_plr49.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.MYTHIC_SHARK_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
					&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.MYTHIC_SHARK_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr55 && _plr55.level instanceof ServerLevel
					&& _plr55.getAdvancements().getOrStartProgress(_plr55.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.MYTHIC_SHARK_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr58 && _plr58.level instanceof ServerLevel
					&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.EXOTIC_SHARK_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr61 && _plr61.level instanceof ServerLevel
					&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.EXOTIC_SHARK_CHESTPLATE.get())) : false) {
				if ((entity instanceof ServerPlayer _plr64 && _plr64.level instanceof ServerLevel
						&& _plr64.getAdvancements().getOrStartProgress(_plr64.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.EXOTIC_SHARK_LEGGINGS.get())) : false) {
				if ((entity instanceof ServerPlayer _plr67 && _plr67.level instanceof ServerLevel
						&& _plr67.getAdvancements().getOrStartProgress(_plr67.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.EXOTIC_SHARK_BOOTS.get())) : false) {
				if ((entity instanceof ServerPlayer _plr70 && _plr70.level instanceof ServerLevel
						&& _plr70.getAdvancements().getOrStartProgress(_plr70.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ENGIE_SHARK_HELMET.get())) : false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ENGIE_SHARK_CHESTPLATE.get())) : false) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ENGIE_SHARK_LEGGINGS.get())) : false) {
					if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeSharkosModItems.ENGIE_SHARK_BOOTS.get())) : false) {
						if ((entity instanceof ServerPlayer _plr76 && _plr76.level instanceof ServerLevel
								&& _plr76.getAdvancements().getOrStartProgress(_plr76.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"))).isDone()) == false) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
					}
				}
			}
		}
	}
}
