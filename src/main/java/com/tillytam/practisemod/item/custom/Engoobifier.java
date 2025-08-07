package com.tillytam.practisemod.item.custom;

import com.tillytam.practisemod.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class Engoobifier extends Item {
//    private static final Map<Block, Block> CHISEL_MAP =
//            Map.of(
//                    Blocks.STONE,
//            )

    public Engoobifier(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (!level.isClientSide()) {
            // on server
            level.setBlockAndUpdate(context.getClickedPos(), ModBlocks.GOOBER_BLOCK.get().defaultBlockState());

            context.getItemInHand().hurtAndBreak(
                    1,
                    ((ServerLevel) level),
                    context.getPlayer(),
                    item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

            level.playSound(null, context.getClickedPos(), SoundEvents.ANVIL_PLACE, SoundSource.BLOCKS);
        }

        return InteractionResult.SUCCESS;
    }
}
