package com.nik56mh6.ItemScripts.void_items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class VoidStar extends Item {
    public VoidStar(Item.Properties properties) {
        super(properties.stacksTo(16).rarity(Rarity.EPIC));
    }
}
