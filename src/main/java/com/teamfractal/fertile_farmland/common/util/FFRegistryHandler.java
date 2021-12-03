package com.teamfractal.fertile_farmland.common.util;

import com.teamfractal.fertile_farmland.common.FertileFarmland;
import com.teamfractal.fertile_farmland.common.block.init.FFBlocks;
import com.teamfractal.fertile_farmland.common.container.init.FFContainers;
import com.teamfractal.fertile_farmland.common.data.recipe.init.FFRecipeTypes;
import com.teamfractal.fertile_farmland.common.item.init.FFItems;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FFRegistryHandler {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, FertileFarmland.MODID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, FertileFarmland.MODID);
    public static final DeferredRegister<MenuType<?>> Containers = DeferredRegister.create(ForgeRegistries.CONTAINERS, FertileFarmland.MODID);
    public static final DeferredRegister<RecipeSerializer<?>> RecipeSerializers = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, FertileFarmland.MODID);

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FFBlocks.register();
        FFItems.register();
        FFContainers.register();
        FFRecipeTypes.register();

        Blocks.register(eventBus);
        Items.register(eventBus);
        Containers.register(eventBus);
        RecipeSerializers.register(eventBus);
    }
}
