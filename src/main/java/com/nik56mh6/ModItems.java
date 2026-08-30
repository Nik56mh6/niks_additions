package com.nik56mh6;

import com.nik56mh6.ItemScripts.*;
import com.nik56mh6.ItemScripts.dragon_sword.DragonSword;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;

public class ModItems implements ModInitializer {

    public static final ResourceKey<Item> GOURD_OF_RETURN_KEY = ModItemIds.create("gourd_of_return");
    public static final Item GOURD_OF_RETURN = register(
            GOURD_OF_RETURN_KEY,
            Gourdofreturn::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModItems.GOURD_OF_RETURN));
    }

    public static final ResourceKey<Item> DRAGON_SWORD_KEY = ModItemIds.create("dragon_sword");
    public static final Item DRAGON_SWORD = register(
            DRAGON_SWORD_KEY,
            DragonSword::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}