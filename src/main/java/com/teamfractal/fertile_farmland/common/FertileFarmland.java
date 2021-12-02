package com.teamfractal.fertile_farmland.common;

import com.teamfractal.fertile_farmland.common.util.FFRegistryHandler;
import com.teamfractal.fertile_farmland.common.world.gen.FFOreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
@Mod(FertileFarmland.MODID)
public class FertileFarmland
{
    public static final String MODID = "fertile_farmland";
    public static final String MODNAME = "Fertile Farmland";

    public FertileFarmland() {
        FFRegistryHandler.register();
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FFOreGeneration::oreGeneration);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
