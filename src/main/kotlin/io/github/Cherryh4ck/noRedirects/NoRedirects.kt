package io.github.Cherryh4ck.noRedirects;

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(
    id = "noredirects",
    name = "NoRedirects",
    version = BuildConstants.VERSION,
    description = "Plugin específico para Toms3",
    authors = ["Cherryh4ck"]
)
class NoRedirects @Inject constructor(val server: ProxyServer, val logger: Logger) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        server.eventManager.register(this, KickListener())
        logger.info("NoRedirects inicializado.")
    }
}
