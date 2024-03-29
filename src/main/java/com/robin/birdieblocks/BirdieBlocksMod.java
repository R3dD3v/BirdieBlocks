package com.robin.birdieblocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("birdieblocks")
public class BirdieBlocksMod {
    public static final Logger LOGGER = LogManager.getLogger();

    public BirdieBlocksMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	
    }
}
