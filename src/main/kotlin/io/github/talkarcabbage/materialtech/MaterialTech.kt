package io.github.talkarcabbage.materialtech

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

const val MOD_ID = "materialtech"
val LOGGER = LogManager.getLogger(MOD_ID)

object MaterialTech : ModInitializer{
    override fun onInitialize() {
        LOGGER.info("Initializing the material tech mod let's go")
    }

}