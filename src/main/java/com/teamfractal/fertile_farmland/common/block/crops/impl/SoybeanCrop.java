package com.teamfractal.fertile_farmland.common.block.crops.impl;

import com.teamfractal.fertile_farmland.common.block.crops.FFCrops;
import com.teamfractal.fertile_farmland.common.item.init.FFItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nonnull;

public class SoybeanCrop extends FFCrops.commonCrop {
    public SoybeanCrop() {
        super();
    }
    @Nonnull
    @Override
    protected ItemLike getBaseSeedId() {
        return FFItems.soybean.get();
    }
    @Nonnull
    @Override
    public ItemStack getCloneItemStack(@Nonnull BlockGetter p_52254_, @Nonnull BlockPos p_52255_, @Nonnull BlockState p_52256_) {
        return new ItemStack(this.getBaseSeedId());
    }
}
