package com.teamfractal.fertile_farmland.common.block.crops.impl;

import com.teamfractal.fertile_farmland.common.block.init.FFBlocks;
import com.teamfractal.fertile_farmland.common.item.init.FFItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nonnull;
import java.util.Random;

public class TeaCrop extends BushBlock implements BonemealableBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    private static final VoxelShape SMALL_SHAPE;
    private static final VoxelShape LARGE_SHAPE;

    public TeaCrop() {
        super(Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public BlockState getStateForPlacement(@Nonnull BlockPlaceContext p_48881_) {
        return this.defaultBlockState().setValue(AGE, 0);
    }

    @Nonnull
    protected ItemLike getBaseSeedId() {
        return FFItems.tea.get();
    }

    @Nonnull
    @Override
    public ItemStack getCloneItemStack(@Nonnull BlockGetter getter, @Nonnull BlockPos pos, @Nonnull BlockState state) {
        return new ItemStack(this.getBaseSeedId());
    }

    @Nonnull
    @Override
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        if (state.getValue(AGE) == 0) {
            return SMALL_SHAPE;
        } else {
            return state.getValue(AGE) < 3 ? LARGE_SHAPE : super.getShape(state, world, pos, context);
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, @Nonnull BlockGetter getter, @Nonnull BlockPos pos) {
        return floor.is(FFBlocks.cropTea.get()) || floor.is(FFBlocks.teaRootedDirt.get()) || floor.is(Blocks.GRASS_BLOCK) || floor.is(Blocks.DIRT) || floor.is(Blocks.COARSE_DIRT) || floor.is(Blocks.PODZOL) || floor.is(Blocks.FARMLAND);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(AGE) < 3;
    }

    public void randomTick(BlockState state, @Nonnull ServerLevel world, @Nonnull BlockPos pos, @Nonnull Random random) {
        int i = state.getValue(AGE);
        boolean haveDirt = false;
        for (int j=1; j<=2; ++j) {
            if(world.getBlockState(pos.below(j)).is(FFBlocks.teaRootedDirt.get())){
                haveDirt = true;
                break;
            }
        }
        if(!haveDirt) {
            if (i < 3 && random.nextInt(20) == 0 && world.getBrightness(LightLayer.SKY, pos.above()) - world.getSkyDarken() >= 9) {
                world.setBlock(pos, state.setValue(AGE, i + 1), 2);
                if (random.nextInt(10) == 4
                        && !world.getBlockState(pos.below()).is(FFBlocks.cropTea.get())
                        && !world.getBlockState(pos.below()).is(FFBlocks.teaRootedDirt.get())) {
                    world.setBlock(pos.below(), FFBlocks.teaRootedDirt.get().defaultBlockState(), 2);
                }
            }
        } else {
            if (i < 3 && random.nextInt(10) == 0) {
                world.setBlock(pos, state.setValue(AGE, i + 1), 2);
            }
            if (random.nextInt(3) == 0){
                if(world.getBlockState(pos.above()).isAir()){
                    world.setBlock(pos.above(),FFBlocks.cropTea.get().defaultBlockState().setValue(AGE,0),2);
                }
            }
        }
    }

    @Nonnull
    public InteractionResult use(@Nonnull BlockState state, @Nonnull Level level, @Nonnull BlockPos pos, @Nonnull Player player, @Nonnull InteractionHand hand, @Nonnull BlockHitResult trace) {
        int i = state.getValue(AGE);
        boolean bl = i == 3;
        if (!bl && player.getItemInHand(hand).getItem() == Items.BONE_MEAL) {
            return InteractionResult.PASS;
        } else if (i > 1) {
            int j = 1 + level.random.nextInt(2);
            popResource(level, pos, new ItemStack(FFBlocks.cropTea.get(), j + (bl ? 1 : 0)));
            if(level.random.nextInt(3) == 0 && i > 2){
                popResource(level, pos, new ItemStack(FFItems.teaRoot.get(), level.random.nextInt(5) + 1));
            }
            level.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(AGE, 1), 2);
            return InteractionResult.sidedSuccess(level.isClientSide());
        } else {
            return super.use(state, level, pos, player, hand, trace);
        }
    }



    public boolean isValidBonemealTarget(@Nonnull BlockGetter world, @Nonnull BlockPos pos, BlockState state, boolean isClient) {
        return state.getValue(AGE) < 3;
    }

    public boolean isBonemealSuccess(@Nonnull Level world, @Nonnull Random random, @Nonnull BlockPos pos, @Nonnull BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(@Nonnull ServerLevel serverLevel, @Nonnull Random random, @Nonnull BlockPos pos, @Nonnull BlockState state) {
        this.growCrops(serverLevel, pos, state);
    }

    public void growCrops(Level world, BlockPos pos, BlockState state) {
        int i = state.getValue(AGE);
        boolean haveDirt = false;
        for (int j=1; j<=2; ++j) {
            if(world.getBlockState(pos.below(j)).is(FFBlocks.teaRootedDirt.get())){
                haveDirt = true;
                break;
            }
        }
        if (i < 3)
        {
            world.setBlock(pos, state.setValue(AGE, i + 1), 2);
            if(!haveDirt) {
                Random random = new Random();
                if (random.nextInt(10) == 4 && !world.getBlockState(pos.below()).is(FFBlocks.cropTea.get())) {
                    world.setBlock(pos.below(), FFBlocks.teaRootedDirt.get().defaultBlockState(), 2);
                }
            }
        }
    }

    static {
        SMALL_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
        LARGE_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    }
}
