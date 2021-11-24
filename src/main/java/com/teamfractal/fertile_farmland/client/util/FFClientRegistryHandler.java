package com.teamfractal.fertile_farmland.client.util;

import com.teamfractal.fertile_farmland.common.FertileFarmland;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FertileFarmland.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFClientRegistryHandler {
    @SubscribeEvent
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}
