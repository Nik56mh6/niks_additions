package com.nik56mh6.ItemScripts.dragon_sword;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;
import net.minecraft.world.level.Level;
import net.minecraft.core.particles.SpellParticleOption;

//DragonSwordSoundStoCazz.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);

public class DragonSword extends Item {
    public DragonSword(Item.Properties properties) {
        super(properties.rarity(Rarity.EPIC).stacksTo(1).rarity(Rarity.EPIC).sword(
                DragonSwordMaterial.DRAGON_SWORD_MATERIAL,
                14F,
                -3.3F));
    }

    public @NonNull ItemUseAnimation getUseAnimation(@NonNull ItemStack stack) {
        return ItemUseAnimation.NONE;
    }

    public int getUseDuration(@NonNull ItemStack itemStack, @NonNull LivingEntity livingEntity) {
        return 1;
    }

    public @NonNull ItemStack finishUsingItem(@NonNull ItemStack itemStack, @NonNull Level world, @NonNull LivingEntity entity)
    {
        ItemStack retval = super.finishUsingItem(itemStack, world, entity);
        return retval;
    }

    public @NonNull InteractionResult use(Level level, @NonNull Player player, @NonNull InteractionHand hand) {
        if (level.isClientSide()) {
            return InteractionResult.PASS;
        }

        Vec3 direction = player.getViewVector(1.0F);
        Vec3 startPos = player.position().add(3, player.getEyeHeight(), 0);



//        double length = 25.0;
//        double radius = 4.0;
//        int cloudCount = 10;
//
//        for (int i = 1; i <= cloudCount; i++) {
//            double distance = i * (length / cloudCount);
//            Vec3 cloudPos = startPos.add(direction.scale(distance));
//
//            AreaEffectCloud cloud = new AreaEffectCloud(level, cloudPos.x, cloudPos.y, cloudPos.z);
//            cloud.setRadius((float) radius);
//            cloud.setDuration(60);
//            cloud.setCustomParticle(SpellParticleOption.create(ParticleTypes.INSTANT_EFFECT, 0x8B00FF, 0.5F));
//            cloud.setOwner(player);
//
//            MobEffectInstance effect = new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1, 5);
//            cloud.addEffect(effect);
//            level.addFreshEntity(cloud);
//        }

        return InteractionResult.SUCCESS;
    }
}
