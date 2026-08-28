package com.nik56mh6.ItemScripts;

import com.nik56mh6.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class Gourdofreturnfinish {
    public static void execute(LevelAccessor world, double x, double y, double z, LivingEntity entity) {
        if (entity != null) {
            Level var10 = entity.level();
            if (var10 instanceof ServerLevel _serverLevel) {
                entity.hurtServer(_serverLevel, new DamageSource(world.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(DamageTypes.GENERIC)), 999.0F);
            }

            if  (world instanceof Level _level) {
                SoundEvent sound = ModSounds.GOURD_OF_RETURN;
                if (!_level.isClientSide()) {
                    _level.playSound(null, BlockPos.containing(x, y, z), sound, SoundSource.MASTER, 1.0F, 1.0F);
                } else {
                    _level.playLocalSound(x, y, z, sound, SoundSource.MASTER, 1.0F, 1.0F, false);
                }
            }
        }
    }

}

