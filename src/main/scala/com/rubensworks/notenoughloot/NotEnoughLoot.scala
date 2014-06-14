package com.rubensworks.notenoughloot

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.Mod.EventHandler

/**
 * The main mod class of NotEnoughLoot.
 * @author rubensworks
 *
 */
@Mod(modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    useMetadata = true,
    version = Reference.MOD_VERSION,
    dependencies = Reference.MOD_DEPENDENCIES
    )
object NotEnoughLoot {
  
    @EventHandler
    def preInit(event: FMLPreInitializationEvent) {
    	println("HI!");
    }
    
    def init(event: FMLInitializationEvent) {
    
    }
    
    def postInit(event: FMLPostInitializationEvent) {
    
    }

}