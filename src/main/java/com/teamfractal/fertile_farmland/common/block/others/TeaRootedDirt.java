package com.teamfractal.fertile_farmland.common.block.others;

import com.teamfractal.fertile_farmland.common.item.init.FFItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nonnull;
import java.util.Random;

public class TeaRootedDirt extends Block {
    public TeaRootedDirt() {
        super(Properties.of(Material.DIRT).strength(1.0F,1.0F).sound(SoundType.ROOTS));
    }

    @Override
    @Nonnull
    public InteractionResult use(@Nonnull BlockState state, @Nonnull Level world, @Nonnull BlockPos pos, Player player, @Nonnull InteractionHand hand, @Nonnull BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.isEmpty()) {
            return InteractionResult.PASS;
        } else {
            if(itemStack.getItem() == FFItems.weedingShovel.get()){
                Random random = new Random();
                popResource(world,pos.above(),new ItemStack(FFItems.teaRoot.get(),random.nextInt(5) + 1));
                world.setBlock(pos, Blocks.DIRT.defaultBlockState(),3);
                world.playSound(null,pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS,1f,1f);
                return InteractionResult.sidedSuccess(world.isClientSide());
            }
        }
        return InteractionResult.PASS;
    }
}
