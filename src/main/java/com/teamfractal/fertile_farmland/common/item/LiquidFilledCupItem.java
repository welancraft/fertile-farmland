package com.teamfractal.fertile_farmland.common.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

import javax.annotation.Nonnull;

public class LiquidFilledCupItem extends Item {

    public LiquidFilledCupItem(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public UseAnim getUseAnimation(@Nonnull ItemStack stack){
        return UseAnim.DRINK;
    }

    @Nonnull
    @Override
    public SoundEvent getEatingSound(){
        return SoundEvents.GENERIC_DRINK;
    }

    @Nonnull
    @Override
    public SoundEvent getDrinkingSound(){
        return SoundEvents.GENERIC_DRINK;
    }
}
