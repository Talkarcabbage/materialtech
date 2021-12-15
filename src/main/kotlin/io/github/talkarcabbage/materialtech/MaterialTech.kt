package io.github.talkarcabbage.materialtech

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

val LOGGER = LogManager.getLogger("materialtech")

object MaterialTech : ModInitializer{
    override fun onInitialize() {
        println("Initializing the material tech mod let's go")
    }

}