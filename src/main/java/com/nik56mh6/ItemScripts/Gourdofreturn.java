package com.nik56mh6.ItemScripts;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

public class Gourdofreturn extends Item {
    public Gourdofreturn(Item.Properties properties) {super(properties.rarity(Rarity.EPIC).stacksTo(1));}

    public @NonNull ItemUseAnimation getUseAnimation(@NonNull ItemStack stack) {return ItemUseAnimation.BOW;}

    public int getUseDuration(@NonNull ItemStack itemStack, @NonNull LivingEntity livingEntity) {return 1;}

    public float getDestroySpeed(@NonNull ItemStack itemStack, @NonNull BlockState state) {return 0.0F;}

    public @NonNull InteractionResult use(@NonNull Level world, @NonNull Player entity, @NonNull InteractionHand hand) {
        InteractionResult ar = super.use(world, entity, hand);
        entity.startUsingItem(hand);
        return ar;
    }

    public @NonNull ItemStack finishUsingItem(@NonNull ItemStack itemstack, @NonNull Level world, @NonNull LivingEntity entity) {
        ItemStack retval = super.finishUsingItem(itemstack, world, entity);
        Gourdofreturnfinish.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }
}
