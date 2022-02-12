package com.wrrulos.rpoisoner;

import com.wrrulos.rpoisoner.listeners.ChatListener;
import com.wrrulos.rpoisoner.utils.ChatUtil;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class RPoisoner extends Plugin {

    private static RPoisoner instance;

    public RPoisoner getInstance() {
        return this.instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        ProxyServer.getInstance().getPluginManager().registerListener(this, new ChatListener());
        ChatUtil.tell(getProxy().getConsole(), "&7[&5RPoisoner&7] RPoisoner loaded successfully!. &7By &b@wrrulos");
    }
}
