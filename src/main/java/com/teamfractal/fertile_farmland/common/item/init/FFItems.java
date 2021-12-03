package com.teamfractal.fertile_farmland.common.item.init;

import com.teamfractal.fertile_farmland.common.block.init.FFBlocks;
import com.teamfractal.fertile_farmland.common.creativeTab.FFCreativeTabs;
import com.teamfractal.fertile_farmland.common.item.LiquidFilledCupItem;
import com.teamfractal.fertile_farmland.common.item.food.FFFoods;
import com.teamfractal.fertile_farmland.common.util.FFRegistryHandler;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;

public class FFItems {
    /*
    FOODS
    */
    public static RegistryObject<Item> glowingApple;
    public static RegistryObject<Item> levitationApple;
    public static RegistryObject<Item> badOmenApple;
    public static RegistryObject<Item> friedDumpling;
    public static RegistryObject<Item> biscuit;
    public static RegistryObject<Item> goldenBean;
    public static RegistryObject<Item> roujiamo;
    public static RegistryObject<Item> muttonKebab;
    public static RegistryObject<Item> friedEgg;
    public static RegistryObject<Item> teaCup;
    public static RegistryObject<Item> milkTea;
    public static RegistryObject<Item> gingerTea;
    public static RegistryObject<Item> steamedRice;
    public static RegistryObject<Item> friedNoodles;
    public static RegistryObject<Item> friedRice;
    public static RegistryObject<Item> teaEgg;
    public static RegistryObject<Item> marinade;
    public static RegistryObject<Item> brinedTurnip;
    public static RegistryObject<Item> brinedPork;
    public static RegistryObject<Item> roastedScallops;
    public static RegistryObject<Item> mantou;
    public static RegistryObject<Item> greenOnionLeaf;
    public static RegistryObject<Item> garlicLeaf;
    /*
    SALT_RELEVANT
    */
    public static RegistryObject<Item> salt;
    public static RegistryObject<Item> oreSalt;
    public static RegistryObject<Item> blockSalt;
    public static RegistryObject<Item> bucketSalt;
    /*
    CROP_RELEVANT
    */
    public static RegistryObject<Item> greenOnion;
    public static RegistryObject<Item> soybean;
    public static RegistryObject<Item> turnip;


    public static void register(){
        /*
        FOODS
        */
        glowingApple = FFRegistryHandler.Items.register("glowing_apple"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.GLOWING_APPLE)));
        levitationApple = FFRegistryHandler.Items.register("levitation_apple"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.LEVITATION_APPLE)));
        badOmenApple = FFRegistryHandler.Items.register("bad_omen_apple"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.BAD_OMEN_APPLE)));
        friedDumpling = FFRegistryHandler.Items.register("fried_dumpling"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.FRIED_DUMPLING)));
        biscuit = FFRegistryHandler.Items.register("biscuit"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.BISCUIT)));
        goldenBean = FFRegistryHandler.Items.register("golden_bean"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.GOLDEN_BEAN)));
        roujiamo = FFRegistryHandler.Items.register("roujiamo"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.ROUJIAMO)));
        muttonKebab = FFRegistryHandler.Items.register("mutton_kebab"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.MUTTON_KEBAB)));
        friedEgg = FFRegistryHandler.Items.register("fried_egg"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.FRIED_EGG)));
        //todo: make a cup item.
        teaCup = FFRegistryHandler.Items.register("tea_cup"
                ,() -> new LiquidFilledCupItem(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.TEA)));
        milkTea = FFRegistryHandler.Items.register("milk_tea"
                ,() -> new LiquidFilledCupItem(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.MILK_TEA)));
        gingerTea = FFRegistryHandler.Items.register("ginger_tea"
                ,() -> new LiquidFilledCupItem(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.GINGER_TEA)));
        steamedRice = FFRegistryHandler.Items.register("steamed_rice"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.STEAMED_RICE)));
        friedNoodles = FFRegistryHandler.Items.register("fried_noodles"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.FRIED_NOODLES)));
        friedRice = FFRegistryHandler.Items.register("fried_rice"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.FRIED_RICE)));
        teaEgg = FFRegistryHandler.Items.register("tea_egg"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.TEA_EGG)));
        marinade = FFRegistryHandler.Items.register("marinade"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.MARINADE)));
        brinedTurnip = FFRegistryHandler.Items.register("brined_turnip"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.BRINED_TURNIP)));
        brinedPork = FFRegistryHandler.Items.register("brined_pork"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.BRINED_PORK)));
        roastedScallops = FFRegistryHandler.Items.register("roasted_scallops"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.ROASTED_SCALLOPS)));
        mantou = FFRegistryHandler.Items.register("mantou"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.MANTOU)));
        greenOnionLeaf = FFRegistryHandler.Items.register("green_onion_leaf"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(Foods.CARROT)));
        garlicLeaf = FFRegistryHandler.Items.register("garlic_leaf"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(Foods.CARROT)));

        /*
        SALT_RELEVANT
        */
        salt = FFRegistryHandler.Items.register("salt"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
        oreSalt = FFRegistryHandler.Items.register("salt_ore"
                ,() -> new BlockItem(FFBlocks.oreSalt.get(), new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
        blockSalt = FFRegistryHandler.Items.register("salt_block"
                ,() -> new BlockItem(FFBlocks.blockSalt.get(), new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
        bucketSalt = FFRegistryHandler.Items.register("salt_bucket"
                ,() -> new Item(new Item.Properties().tab(FFCreativeTabs.FOODS).food(FFFoods.SALT_BUCKET).craftRemainder(Items.BUCKET)));
        /*
        CROP_RELEVANT
        */
        greenOnion = FFRegistryHandler.Items.register("green_onion"
                ,() -> new BlockItem(FFBlocks.cropGreenOnion.get(), new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
        soybean = FFRegistryHandler.Items.register("soybean"
                ,() -> new BlockItem(FFBlocks.cropSoybean.get(), new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
        turnip = FFRegistryHandler.Items.register("turnip"
                ,() -> new BlockItem(FFBlocks.cropTurnip.get(), new Item.Properties().tab(FFCreativeTabs.MATERIALS)));
    }
}
