package com.nik56mh6.ItemScripts.dragon_sword;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class DragonSwordSoundStoCazz {
    public static void execute(LevelAccessor world, double x, double y, double z, LivingEntity entity) {
        if (entity != null) {
            if (world instanceof Level _level) {
                SoundEvent sound = SoundEvents.ENDER_DRAGON_GROWL;
                if (!_level.isClientSide()) {
                    _level.playSound(null, BlockPos.containing(x, y, z), sound, SoundSource.MASTER, 1.0F, 1.0F);
                } else {
                    _level.playLocalSound(x, y, z, sound, SoundSource.MASTER, 1.0F, 1.0F, false);
                }
            }
        }
    }
}