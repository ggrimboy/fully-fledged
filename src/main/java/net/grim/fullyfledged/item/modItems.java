package net.grim.fullyfledged.item;

import net.grim.fullyfledged.FullyFledged;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FullyFledged.MOD_ID);

    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(modFoods.CORN)));
    public static final RegistryObject<Item> CORN_KERNEL = ITEMS.register("kernel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties().food(modFoods.POPCORN)));
    public static final RegistryObject<Item> GRILLED_CORN = ITEMS.register("grilled_corn",
            () -> new Item(new Item.Properties().food(modFoods.GRILLED_CORN)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
