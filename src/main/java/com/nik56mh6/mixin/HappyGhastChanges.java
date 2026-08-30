package com.nik56mh6.mixin;

import net.minecraft.world.entity.animal.happyghast.HappyGhast;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(HappyGhast.class)
public class HappyGhastChanges {
    @ModifyVariable(
            method = "travel",
            at = @At(value = "STORE", ordinal = 0),
            name = "speed"
    )
    private float modifySpeed(float speed) {
        return 0.7F;
    } // default is 0.07
}