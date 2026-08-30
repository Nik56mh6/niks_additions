package com.nik56mh6.ItemScripts.dragon_sword;

import com.nik56mh6.NikSAdditions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import com.nik56mh6.ModItems;

public class DragonSwordMaterial {
    public static final TagKey<Item> REPAIRS_DRAGON_SWORD = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(NikSAdditions.MOD_ID, "repairs_dragon_sword"));

    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOL = TagKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(NikSAdditions.MOD_ID, "incorrect_for_netherite_tool"));

    public static final ToolMaterial DRAGON_SWORD_MATERIAL = new ToolMaterial(
            INCORRECT_FOR_NETHERITE_TOOL,
            4046,
            1F,
            6.0F,
            44,
            DragonSwordMaterial.REPAIRS_DRAGON_SWORD
    );
}