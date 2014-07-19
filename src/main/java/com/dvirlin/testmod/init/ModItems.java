package com.dvirlin.testmod.init;

import com.dvirlin.testmod.item.ItemMapleLeaf;
import com.dvirlin.testmod.item.ItemTestMod;
import com.dvirlin.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTestMod mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
