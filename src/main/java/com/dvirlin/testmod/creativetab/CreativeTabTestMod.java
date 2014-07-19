package com.dvirlin.testmod.creativetab;

import com.dvirlin.testmod.init.ModItems;
import com.dvirlin.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Sean on 19/07/2014.
 */
public class CreativeTabTestMod
{
    public static final CreativeTabs TestModTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };

}
