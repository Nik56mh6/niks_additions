package com.nik56mh6.ItemScripts.void_items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class VoidStick extends Item {
    public VoidStick(Item.Properties properties) {
        super(properties.stacksTo(64).rarity(Rarity.RARE));
    }
}
