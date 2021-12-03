package com.teamfractal.fertile_farmland.common.block.init;

import com.teamfractal.fertile_farmland.common.block.crops.impl.GreenOnionCrop;
import com.teamfractal.fertile_farmland.common.block.crops.impl.SoybeanCrop;
import com.teamfractal.fertile_farmland.common.block.crops.impl.TurnipCrop;
import com.teamfractal.fertile_farmland.common.util.FFRegistryHandler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class FFBlocks {

    //Salt relevant
    public static RegistryObject<Block> oreSalt;
    public static RegistryObject<Block> blockSalt;

    //Crops
    public static RegistryObject<Block> cropGreenOnion;
    public static RegistryObject<Block> cropSoybean;
    public static RegistryObject<Block> cropTurnip;

    public static void register(){
        //Salt relevant
        oreSalt = FFRegistryHandler.Blocks.register("salt_ore"
                , () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3,1)));
        blockSalt = FFRegistryHandler.Blocks.register("salt_block"
                , () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND)));
        //Crops
        cropGreenOnion = FFRegistryHandler.Blocks.register("green_onion"
                , GreenOnionCrop::new);
        cropSoybean = FFRegistryHandler.Blocks.register("soybean"
                , SoybeanCrop::new);
        cropTurnip = FFRegistryHandler.Blocks.register("turnip"
                , TurnipCrop::new);
    }
}
