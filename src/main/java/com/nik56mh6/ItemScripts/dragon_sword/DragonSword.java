package com.nik56mh6.ItemScripts.dragon_sword;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class DragonSword extends Item {
    public DragonSword(Item.Properties properties) {super(properties.rarity(Rarity.EPIC).stacksTo(1));}
}
