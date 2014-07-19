package com.dvirlin.testmod.block;

import com.dvirlin.testmod.creativetab.CreativeTabTestMod;
import com.dvirlin.testmod.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by Sean on 09/07/2014.
 */
public class BlockTestMod extends Block
{

    public BlockTestMod(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTestMod.TestModTab);
    }

    public BlockTestMod()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        /*
        tile.testmod:mapleLeaf.name
         */
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName( String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }
}
