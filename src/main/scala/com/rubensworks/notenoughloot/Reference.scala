package com.rubensworks.notenoughloot

/**
 * Class that can hold basic static things that are better not hard-coded
 * like mod details, texture paths, ID's...
 * @author rubensworks
 *
 */
object Reference {
  
	// Mod info
    final val MOD_ID = "notenoughloot"
    final val MOD_NAME = "NotEnoughLoot"
    final val MOD_VERSION = "@VERSION@"
    final val MOD_BUILD_NUMBER = "@BUILD_NUMBER@"
    final val MOD_CHANNEL = MOD_ID
    final val MOD_MC_VERSION = "@MC_VERSION@"
      
    // Mod ID's
    final val MOD_NEI = "NotEnoughItems"
      
    // Dependencies
    final val MOD_DEPENDENCIES = "required-after:" + "NotEnoughItems"

}