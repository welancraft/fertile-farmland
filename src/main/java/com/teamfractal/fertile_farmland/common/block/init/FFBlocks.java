package com.teamfractal.fertile_farmland.common.block.init;

import com.teamfractal.fertile_farmland.common.util.FFRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

public class FFBlocks {

    public static RegistryObject<Block> oreSalt;
    public static RegistryObject<Block> blockSalt;

    public static void register(){
        oreSalt = FFRegistryHandler.Blocks.register("salt_ore"
                , () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3,1)));
        blockSalt = FFRegistryHandler.Blocks.register("salt_block"
                , () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND)));
    }
}
