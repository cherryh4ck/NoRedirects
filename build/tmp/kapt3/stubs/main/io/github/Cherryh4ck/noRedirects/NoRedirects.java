package io.github.Cherryh4ck.noRedirects;

@com.velocitypowered.api.plugin.Plugin(id = "noredirects", name = "NoRedirects", version = "1.0", description = "Plugin espec\u00edfico para Toms3", authors = {"Cherryh4ck"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lio/github/Cherryh4ck/noRedirects/NoRedirects;", "", "server", "Lcom/velocitypowered/api/proxy/ProxyServer;", "logger", "Lorg/slf4j/Logger;", "(Lcom/velocitypowered/api/proxy/ProxyServer;Lorg/slf4j/Logger;)V", "getLogger", "()Lorg/slf4j/Logger;", "getServer", "()Lcom/velocitypowered/api/proxy/ProxyServer;", "onProxyInitialization", "", "event", "Lcom/velocitypowered/api/event/proxy/ProxyInitializeEvent;", "NoRedirects"})
public final class NoRedirects {
    @org.jetbrains.annotations.NotNull()
    private final com.velocitypowered.api.proxy.ProxyServer server = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger logger = null;
    
    @com.google.inject.Inject()
    public NoRedirects(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.proxy.ProxyServer server, @org.jetbrains.annotations.NotNull()
    org.slf4j.Logger logger) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.velocitypowered.api.proxy.ProxyServer getServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @com.velocitypowered.api.event.Subscribe()
    public final void onProxyInitialization(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.proxy.ProxyInitializeEvent event) {
    }
}