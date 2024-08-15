package net.grim.fullyfledged.item;

import net.grim.fullyfledged.FullyFledged;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FullyFledged.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FULLYFLEDGED_TAB = CREATIVE_MODE_TABS.register("fullyfledged_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(modItems.CORN.get()))
                    .title(Component.translatable("creativetab.fullyfledged_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(modItems.CORN_KERNEL.get());
                        output.accept(modItems.POPCORN.get());
                        output.accept(modItems.CORN.get());
                        output.accept(modItems.GRILLED_CORN.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}