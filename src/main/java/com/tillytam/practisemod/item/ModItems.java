package com.tillytam.practisemod.item;

import com.tillytam.practisemod.PractiseMod;
import com.tillytam.practisemod.item.custom.Engoobifier;
import com.tillytam.practisemod.item.custom.FuelItem;
import com.tillytam.practisemod.item.custom.InstakillerItem;
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

    public static final DeferredItem<Item> GOOBER_BERRY = ITEMS.register("goober_berry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOOBER_BERRY)));

    public static final DeferredItem<Item> GOOPER_BERRY = ITEMS.register("gooper_berry",
            () -> new InstakillerItem(new Item.Properties().food(ModFoodProperties.GOOPER_BERRY)));

    public static final DeferredItem<Item> CRISPY_GOOBER = ITEMS.register("crispy_goober",
            () -> new FuelItem(new Item.Properties(), 999999999));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
