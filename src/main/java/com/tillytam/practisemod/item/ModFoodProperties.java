package com.tillytam.practisemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties GOOBER_BERRY = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 2000, 255), 1)
            .alwaysEdible()

            .build();

    public static final FoodProperties GOOPER_BERRY = new FoodProperties.Builder()
            .nutrition(-10)
            .saturationModifier(-1f)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 100000, 255), 1)
            .alwaysEdible()

            .build();
}
