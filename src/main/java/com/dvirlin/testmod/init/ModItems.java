package com.dvirlin.testmod.init;

import com.dvirlin.testmod.item.ItemMapleLeaf;
import com.dvirlin.testmod.item.ItemTestMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Sean on 05/07/2014.
 */
public class ModItems
{
    public static final ItemTestMod mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
