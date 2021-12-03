package com.teamfractal.fertile_farmland.client.render;


import com.teamfractal.fertile_farmland.common.block.init.FFBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(FFBlocks.cropGreenOnion.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(FFBlocks.cropSoybean.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(FFBlocks.cropTurnip.get(), RenderType.cutout());
        });
    }
}
