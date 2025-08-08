package com.tillytam.practisemod.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.Tags;

public class InstakillerItem extends Item {

    public InstakillerItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        //stack.consume(stack.getCount(), livingEntity);
        livingEntity.hurt(livingEntity.damageSources().magic(), 2000f);

        return super.finishUsingItem(stack, level, livingEntity);
    }
}
