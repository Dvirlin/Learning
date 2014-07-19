package com.dvirlin.testmod.init;

import com.dvirlin.testmod.block.BlockFlag;
import com.dvirlin.testmod.block.BlockTestMod;
import com.dvirlin.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTestMod flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
