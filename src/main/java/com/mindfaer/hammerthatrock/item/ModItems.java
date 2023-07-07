package com.mindfaer.hammerthatrock.item;

import com.mindfaer.hammerthatrock.HammerThatRock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HammerThatRock.MOD_ID);

    public static final RegistryObject<Item> REFINEDIRONORECHUNK = ITEMS.register("refinedironorechunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINEDGOLDORECHUNK = ITEMS.register("refinedgoldorechunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINEDCOPPERORECHUNK = ITEMS.register("refinedcopperorechunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
