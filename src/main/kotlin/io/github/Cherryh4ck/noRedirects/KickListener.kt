package io.github.Cherryh4ck.noRedirects

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.player.KickedFromServerEvent

class KickListener {
    @Subscribe
    fun onServerKick(event: KickedFromServerEvent) {
        val player = event.player
        val kickReason = event.serverKickReason.orElse(null)
        if (event.server.serverInfo.name == "main") {
            event.result = KickedFromServerEvent.DisconnectPlayer.create(kickReason)
        }
    }
}