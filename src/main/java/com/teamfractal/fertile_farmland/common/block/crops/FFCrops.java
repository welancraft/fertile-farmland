package com.teamfractal.fertile_farmland.common.block.crops;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


public class FFCrops {

    //garlic, soybean & turnip
    public static class commonCrop extends CropBlock{
        public commonCrop() {
            super(Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
        }
    }

}
