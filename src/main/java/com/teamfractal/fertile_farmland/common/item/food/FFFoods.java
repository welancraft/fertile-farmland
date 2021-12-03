package com.teamfractal.fertile_farmland.common.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FFFoods {
    public static final FoodProperties GLOWING_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.GLOWING,1200,0),1.0F).build();
    public static final FoodProperties LEVITATION_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.LEVITATION,400,0),1.0F).build();
    public static final FoodProperties BAD_OMEN_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.BAD_OMEN,400,0),1.0F).build();
    public static final FoodProperties FRIED_DUMPLING = new FoodProperties.Builder().nutrition(3).saturationMod(0.5F).fast().build();
    public static final FoodProperties BISCUIT = new FoodProperties.Builder().nutrition(4).saturationMod(4F).fast().build();
    public static final FoodProperties SALT_BUCKET = new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200,0),0.25F).build();
    public static final FoodProperties GOLDEN_BEAN = new FoodProperties.Builder().nutrition(4).saturationMod(2F).fast().build();
    public static final FoodProperties ROUJIAMO = new FoodProperties.Builder().nutrition(6).saturationMod(3F).meat().build();
    public static final FoodProperties MUTTON_KEBAB = new FoodProperties.Builder().nutrition(6).saturationMod(2F).meat().build();
    public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(3).saturationMod(1F).build();
    public static final FoodProperties TEA = new FoodProperties.Builder().nutrition(3).saturationMod(1F).effect(new MobEffectInstance(MobEffects.REGENERATION,160,0),1.0F).build();
    public static final FoodProperties MILK_TEA = new FoodProperties.Builder().nutrition(4).saturationMod(1.5F).effect(new MobEffectInstance(MobEffects.REGENERATION,120,0),1.0F).build();
    public static final FoodProperties GINGER_TEA = new FoodProperties.Builder().nutrition(3).saturationMod(1F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,1200,0),1.0F).build();
    public static final FoodProperties STEAMED_RICE = new FoodProperties.Builder().nutrition(5).saturationMod(2F).build();
    public static final FoodProperties FRIED_NOODLES = new FoodProperties.Builder().nutrition(5).saturationMod(2F).build();
    public static final FoodProperties FRIED_RICE = new FoodProperties.Builder().nutrition(5).saturationMod(2F).build();
    public static final FoodProperties TEA_EGG = new FoodProperties.Builder().nutrition(3).saturationMod(1F).effect(new MobEffectInstance(MobEffects.REGENERATION,80,0),1.0F).build();
    //Original: Brined_brining_Ingredient
    public static final FoodProperties MARINADE = new FoodProperties.Builder().nutrition(3).saturationMod(1F).build();
    public static final FoodProperties BRINED_TURNIP = new FoodProperties.Builder().nutrition(4).saturationMod(1F).fast().build();
    public static final FoodProperties BRINED_PORK = new FoodProperties.Builder().nutrition(6).saturationMod(3F).build();
    public static final FoodProperties ROASTED_SCALLOPS = new FoodProperties.Builder().nutrition(5).saturationMod(2F).build();
    public static final FoodProperties MANTOU = new FoodProperties.Builder().nutrition(3).saturationMod(2F).build();

}
