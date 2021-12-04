package com.teamfractal.fertile_farmland.common.creativeTab;

import com.teamfractal.fertile_farmland.common.item.init.FFItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class FFCreativeTabs {
    public static final CreativeModeTab FOODS = new CreativeModeTab("fertile_farmland.foods") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(FFItems.mantou.get());
        }
    };
    public static final CreativeModeTab MATERIALS = new CreativeModeTab("fertile_farmland.materials") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(FFItems.salt.get());
        }
    };
    public static final CreativeModeTab TOOLS = new CreativeModeTab("fertile_farmland.tools") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return new ItemStack(FFItems.weedingShovel.get());
        }
    };
}
