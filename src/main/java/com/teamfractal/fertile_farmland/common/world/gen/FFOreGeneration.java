package com.teamfractal.fertile_farmland.common.world.gen;

import com.teamfractal.fertile_farmland.common.FertileFarmland;
import com.teamfractal.fertile_farmland.common.block.init.FFBlocks;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.SquareDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FertileFarmland.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FFOreGeneration {
    @SubscribeEvent
    public static void oreGeneration (final BiomeLoadingEvent event){
        //The End
        if (event.getCategory() == Biome.BiomeCategory.THEEND){}
        //Nether
        else if (event.getCategory() == Biome.BiomeCategory.NETHER){}
        //Overworld
        else{
            genOre(event.getGeneration(), OreConfiguration.Predicates.STONE_ORE_REPLACEABLES
                    , FFBlocks.oreSalt.get().defaultBlockState(), 5,32, 128, 5);
        }

    }
    private static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillertype
            , BlockState state, int veinSize, int minHeight, int maxHeight, int maxperchunk){
        settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreConfiguration(fillertype, state, veinSize))
                        .decorated(SquareDecorator.RANGE.configured(new RangeDecoratorConfiguration
                                (UniformHeight.of(VerticalAnchor.absolute(minHeight),VerticalAnchor.absolute(maxHeight))))).squared().count(maxperchunk));
    }
}
