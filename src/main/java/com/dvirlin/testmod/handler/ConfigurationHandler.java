package com.dvirlin.testmod.handler;

import com.dvirlin.testmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync Configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        // Read in properties from the config file
        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an Example Config Value");

        if (config.hasChanged())
        {
            config.save();
        }
    }
}
