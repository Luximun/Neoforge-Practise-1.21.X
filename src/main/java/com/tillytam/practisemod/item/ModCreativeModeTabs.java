package com.tillytam.practisemod.item;

import com.tillytam.practisemod.PractiseMod;
import com.tillytam.practisemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PractiseMod.MODID);

    public static final Supplier<CreativeModeTab> GOOBER_TAB = CREATIVE_MODE_TAB.register("goober_tab",
            () -> CreativeModeTab.builder()
                    .icon( () -> new ItemStack(ModItems.GOOBER.get()))
                    .title(Component.translatable("creativetab.tillytamspractisemod.goober_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOOBER);
                        output.accept(ModBlocks.GOOBER_BLOCK);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
