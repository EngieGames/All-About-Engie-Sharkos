
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaesharkos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaesharkos.entity.SharkoTamedEntity;
import net.mcreator.aaesharkos.entity.SharkoStayEntity;
import net.mcreator.aaesharkos.entity.SharkoEntity;
import net.mcreator.aaesharkos.entity.SharkoAttackEntity;
import net.mcreator.aaesharkos.entity.RareSharkoTamedEntity;
import net.mcreator.aaesharkos.entity.RareSharkoStayEntity;
import net.mcreator.aaesharkos.entity.RareSharkoEntity;
import net.mcreator.aaesharkos.entity.RareSharkoAttackEntity;
import net.mcreator.aaesharkos.entity.OldMythicSharkoEntity;
import net.mcreator.aaesharkos.entity.MythicSharkoTamedEntity;
import net.mcreator.aaesharkos.entity.MythicSharkoStayEntity;
import net.mcreator.aaesharkos.entity.MythicSharkoEntity;
import net.mcreator.aaesharkos.entity.MythicSharkoAttackEntity;
import net.mcreator.aaesharkos.entity.LegendarySharkoTamedEntity;
import net.mcreator.aaesharkos.entity.LegendarySharkoStayEntity;
import net.mcreator.aaesharkos.entity.LegendarySharkoEntity;
import net.mcreator.aaesharkos.entity.LegendarySharkoAttackEntity;
import net.mcreator.aaesharkos.entity.ExoticSharkoTamedEntity;
import net.mcreator.aaesharkos.entity.ExoticSharkoStayEntity;
import net.mcreator.aaesharkos.entity.ExoticSharkoEntity;
import net.mcreator.aaesharkos.entity.ExoticSharkoAttackEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoTamedEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoStayEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRARETamedEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRAREStayEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRAREEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRAREAttackEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRARE2TamedEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRARE2StayEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoRARE2Entity;
import net.mcreator.aaesharkos.entity.EngieSharkoRARE2AttackEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoEntity;
import net.mcreator.aaesharkos.entity.EngieSharkoAttackEntity;
import net.mcreator.aaesharkos.entity.BigSharkoEntity;
import net.mcreator.aaesharkos.entity.BigRareSharkoEntity;
import net.mcreator.aaesharkos.entity.BigRareEngieSharkoEntity;
import net.mcreator.aaesharkos.entity.BigRareEngieSharko2Entity;
import net.mcreator.aaesharkos.entity.BigMythicSharkoEntity;
import net.mcreator.aaesharkos.entity.BigLegendarySharkoEntity;
import net.mcreator.aaesharkos.entity.BigExoticSharkoEntity;
import net.mcreator.aaesharkos.entity.BigEngieSharkoEntity;
import net.mcreator.aaesharkos.entity.BigAlbinoSharkoEntity;
import net.mcreator.aaesharkos.entity.AlbinoSharkoTamedEntity;
import net.mcreator.aaesharkos.entity.AlbinoSharkoStayEntity;
import net.mcreator.aaesharkos.entity.AlbinoSharkoEntity;
import net.mcreator.aaesharkos.entity.AlbinoSharkoAttackEntity;
import net.mcreator.aaesharkos.AaeSharkosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AaeSharkosModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AaeSharkosMod.MODID);
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoTamedEntity>> SHARKO_TAMED = register("sharko_tamed",
			EntityType.Builder.<SharkoTamedEntity>of(SharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoAttackEntity>> SHARKO_ATTACK = register("sharko_attack",
			EntityType.Builder.<SharkoAttackEntity>of(SharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoStayEntity>> SHARKO_STAY = register("sharko_stay",
			EntityType.Builder.<SharkoStayEntity>of(SharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoEntity>> ALBINO_SHARKO = register("albino_sharko",
			EntityType.Builder.<AlbinoSharkoEntity>of(AlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedEntity>> ALBINO_SHARKO_TAMED = register("albino_sharko_tamed",
			EntityType.Builder.<AlbinoSharkoTamedEntity>of(AlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoAttackEntity>> ALBINO_SHARKO_ATTACK = register("albino_sharko_attack",
			EntityType.Builder.<AlbinoSharkoAttackEntity>of(AlbinoSharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoStayEntity>> ALBINO_SHARKO_STAY = register("albino_sharko_stay",
			EntityType.Builder.<AlbinoSharkoStayEntity>of(AlbinoSharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoTamedEntity>> RARE_SHARKO_TAMED = register("rare_sharko_tamed",
			EntityType.Builder.<RareSharkoTamedEntity>of(RareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoAttackEntity>> RARE_SHARKO_ATTACK = register("rare_sharko_attack",
			EntityType.Builder.<RareSharkoAttackEntity>of(RareSharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoStayEntity>> RARE_SHARKO_STAY = register("rare_sharko_stay",
			EntityType.Builder.<RareSharkoStayEntity>of(RareSharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedEntity>> LEGENDARY_SHARKO_TAMED = register("legendary_sharko_tamed",
			EntityType.Builder.<LegendarySharkoTamedEntity>of(LegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoAttackEntity>> LEGENDARY_SHARKO_ATTACK = register("legendary_sharko_attack",
			EntityType.Builder.<LegendarySharkoAttackEntity>of(LegendarySharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoStayEntity>> LEGENDARY_SHARKO_STAY = register("legendary_sharko_stay",
			EntityType.Builder.<LegendarySharkoStayEntity>of(LegendarySharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoTamedEntity>> MYTHIC_SHARKO_TAMED = register("mythic_sharko_tamed",
			EntityType.Builder.<MythicSharkoTamedEntity>of(MythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoAttackEntity>> MYTHIC_SHARKO_ATTACK = register("mythic_sharko_attack",
			EntityType.Builder.<MythicSharkoAttackEntity>of(MythicSharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoStayEntity>> MYTHIC_SHARKO_STAY = register("mythic_sharko_stay",
			EntityType.Builder.<MythicSharkoStayEntity>of(MythicSharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedEntity>> EXOTIC_SHARKO_TAMED = register("exotic_sharko_tamed",
			EntityType.Builder.<ExoticSharkoTamedEntity>of(ExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoAttackEntity>> EXOTIC_SHARKO_ATTACK = register("exotic_sharko_attack",
			EntityType.Builder.<ExoticSharkoAttackEntity>of(ExoticSharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoStayEntity>> EXOTIC_SHARKO_STAY = register("exotic_sharko_stay",
			EntityType.Builder.<ExoticSharkoStayEntity>of(ExoticSharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoTamedEntity>> ENGIE_SHARKO_TAMED = register("engie_sharko_tamed",
			EntityType.Builder.<EngieSharkoTamedEntity>of(EngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoAttackEntity>> ENGIE_SHARKO_ATTACK = register("engie_sharko_attack",
			EntityType.Builder.<EngieSharkoAttackEntity>of(EngieSharkoAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3).setCustomClientFactory(EngieSharkoAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoStayEntity>> ENGIE_SHARKO_STAY = register("engie_sharko_stay",
			EntityType.Builder.<EngieSharkoStayEntity>of(EngieSharkoStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRARETamedEntity>> ENGIE_SHARKO_RARE_TAMED = register("engie_sharko_rare_tamed",
			EntityType.Builder.<EngieSharkoRARETamedEntity>of(EngieSharkoRARETamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRARETamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRAREAttackEntity>> ENGIE_SHARKO_RARE_ATTACK = register("engie_sharko_rare_attack",
			EntityType.Builder.<EngieSharkoRAREAttackEntity>of(EngieSharkoRAREAttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRAREAttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRAREStayEntity>> ENGIE_SHARKO_RARE_STAY = register("engie_sharko_rare_stay",
			EntityType.Builder.<EngieSharkoRAREStayEntity>of(EngieSharkoRAREStayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRAREStayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRARE2Entity>> ENGIE_SHARKO_RARE_2 = register("engie_sharko_rare_2",
			EntityType.Builder.<EngieSharkoRARE2Entity>of(EngieSharkoRARE2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRARE2Entity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRARE2TamedEntity>> ENGIE_SHARKO_RARE_2_TAMED = register("engie_sharko_rare_2_tamed",
			EntityType.Builder.<EngieSharkoRARE2TamedEntity>of(EngieSharkoRARE2TamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRARE2TamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRARE2AttackEntity>> ENGIE_SHARKO_RARE_2_ATTACK = register("engie_sharko_rare_2_attack",
			EntityType.Builder.<EngieSharkoRARE2AttackEntity>of(EngieSharkoRARE2AttackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRARE2AttackEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRARE2StayEntity>> ENGIE_SHARKO_RARE_2_STAY = register("engie_sharko_rare_2_stay",
			EntityType.Builder.<EngieSharkoRARE2StayEntity>of(EngieSharkoRARE2StayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRARE2StayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRAREEntity>> ENGIE_SHARKO_RARE = register("engie_sharko_rare",
			EntityType.Builder.<EngieSharkoRAREEntity>of(EngieSharkoRAREEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRAREEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BigSharkoEntity>> BIG_SHARKO = register("big_sharko",
			EntityType.Builder.<BigSharkoEntity>of(BigSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigAlbinoSharkoEntity>> BIG_ALBINO_SHARKO = register("big_albino_sharko",
			EntityType.Builder.<BigAlbinoSharkoEntity>of(BigAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigAlbinoSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigRareSharkoEntity>> BIG_RARE_SHARKO = register("big_rare_sharko",
			EntityType.Builder.<BigRareSharkoEntity>of(BigRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigLegendarySharkoEntity>> BIG_LEGENDARY_SHARKO = register("big_legendary_sharko",
			EntityType.Builder.<BigLegendarySharkoEntity>of(BigLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigLegendarySharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigMythicSharkoEntity>> BIG_MYTHIC_SHARKO = register("big_mythic_sharko",
			EntityType.Builder.<BigMythicSharkoEntity>of(BigMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigMythicSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigExoticSharkoEntity>> BIG_EXOTIC_SHARKO = register("big_exotic_sharko",
			EntityType.Builder.<BigExoticSharkoEntity>of(BigExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigExoticSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoEntity>> BIG_ENGIE_SHARKO = register("big_engie_sharko",
			EntityType.Builder.<BigEngieSharkoEntity>of(BigEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigRareEngieSharkoEntity>> BIG_RARE_ENGIE_SHARKO = register("big_rare_engie_sharko",
			EntityType.Builder.<BigRareEngieSharkoEntity>of(BigRareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareEngieSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigRareEngieSharko2Entity>> BIG_RARE_ENGIE_SHARKO_2 = register("big_rare_engie_sharko_2",
			EntityType.Builder.<BigRareEngieSharko2Entity>of(BigRareEngieSharko2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareEngieSharko2Entity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<OldMythicSharkoEntity>> OLD_MYTHIC_SHARKO = register("old_mythic_sharko", EntityType.Builder.<OldMythicSharkoEntity>of(OldMythicSharkoEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OldMythicSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SharkoEntity.init();
			SharkoTamedEntity.init();
			SharkoAttackEntity.init();
			SharkoStayEntity.init();
			AlbinoSharkoEntity.init();
			AlbinoSharkoTamedEntity.init();
			AlbinoSharkoAttackEntity.init();
			AlbinoSharkoStayEntity.init();
			RareSharkoEntity.init();
			RareSharkoTamedEntity.init();
			RareSharkoAttackEntity.init();
			RareSharkoStayEntity.init();
			LegendarySharkoEntity.init();
			LegendarySharkoTamedEntity.init();
			LegendarySharkoAttackEntity.init();
			LegendarySharkoStayEntity.init();
			MythicSharkoEntity.init();
			MythicSharkoTamedEntity.init();
			MythicSharkoAttackEntity.init();
			MythicSharkoStayEntity.init();
			ExoticSharkoEntity.init();
			ExoticSharkoTamedEntity.init();
			ExoticSharkoAttackEntity.init();
			ExoticSharkoStayEntity.init();
			EngieSharkoEntity.init();
			EngieSharkoTamedEntity.init();
			EngieSharkoAttackEntity.init();
			EngieSharkoStayEntity.init();
			EngieSharkoRARETamedEntity.init();
			EngieSharkoRAREAttackEntity.init();
			EngieSharkoRAREStayEntity.init();
			EngieSharkoRARE2Entity.init();
			EngieSharkoRARE2TamedEntity.init();
			EngieSharkoRARE2AttackEntity.init();
			EngieSharkoRARE2StayEntity.init();
			EngieSharkoRAREEntity.init();
			BigSharkoEntity.init();
			BigAlbinoSharkoEntity.init();
			BigRareSharkoEntity.init();
			BigLegendarySharkoEntity.init();
			BigMythicSharkoEntity.init();
			BigExoticSharkoEntity.init();
			BigEngieSharkoEntity.init();
			BigRareEngieSharkoEntity.init();
			BigRareEngieSharko2Entity.init();
			OldMythicSharkoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(SHARKO_TAMED.get(), SharkoTamedEntity.createAttributes().build());
		event.put(SHARKO_ATTACK.get(), SharkoAttackEntity.createAttributes().build());
		event.put(SHARKO_STAY.get(), SharkoStayEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_ATTACK.get(), AlbinoSharkoAttackEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_STAY.get(), AlbinoSharkoStayEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED.get(), RareSharkoTamedEntity.createAttributes().build());
		event.put(RARE_SHARKO_ATTACK.get(), RareSharkoAttackEntity.createAttributes().build());
		event.put(RARE_SHARKO_STAY.get(), RareSharkoStayEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_ATTACK.get(), LegendarySharkoAttackEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_STAY.get(), LegendarySharkoStayEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_ATTACK.get(), MythicSharkoAttackEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_STAY.get(), MythicSharkoStayEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_ATTACK.get(), ExoticSharkoAttackEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_STAY.get(), ExoticSharkoStayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_ATTACK.get(), EngieSharkoAttackEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_STAY.get(), EngieSharkoStayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRARETamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_ATTACK.get(), EngieSharkoRAREAttackEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_STAY.get(), EngieSharkoRAREStayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2.get(), EngieSharkoRARE2Entity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRARE2TamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_ATTACK.get(), EngieSharkoRARE2AttackEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_STAY.get(), EngieSharkoRARE2StayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE.get(), EngieSharkoRAREEntity.createAttributes().build());
		event.put(BIG_SHARKO.get(), BigSharkoEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO.get(), BigAlbinoSharkoEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO.get(), BigRareSharkoEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO.get(), BigLegendarySharkoEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO.get(), BigMythicSharkoEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO.get(), BigExoticSharkoEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO.get(), BigEngieSharkoEntity.createAttributes().build());
		event.put(BIG_RARE_ENGIE_SHARKO.get(), BigRareEngieSharkoEntity.createAttributes().build());
		event.put(BIG_RARE_ENGIE_SHARKO_2.get(), BigRareEngieSharko2Entity.createAttributes().build());
		event.put(OLD_MYTHIC_SHARKO.get(), OldMythicSharkoEntity.createAttributes().build());
	}
}
