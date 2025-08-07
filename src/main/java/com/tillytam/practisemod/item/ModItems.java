package com.tillytam.practisemod.item;

import com.tillytam.practisemod.PractiseMod;
import com.tillytam.practisemod.item.custom.Engoobifier;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PractiseMod.MODID);

    public static final DeferredItem<Item> GOOBER = ITEMS.register("goober",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENGOOBIFIER = ITEMS.register("engoobifier",
            () -> new Engoobifier(new Item.Properties()
                    .durability(100000)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
