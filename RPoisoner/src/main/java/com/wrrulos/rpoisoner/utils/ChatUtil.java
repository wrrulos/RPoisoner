package com.wrrulos.rpoisoner.utils;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.ArrayList;
import java.util.List;

public class ChatUtil {
    public static String translate(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static List<String> translate(List<String> messages) {
        List<String> buffered = new ArrayList<>();
        for (String message : messages){
            buffered.add(translate(message));
            //buffered.add(translate("&r" + message));
        }
        return buffered;
    }

    public static void tell(ProxiedPlayer proxiedplayer, String s){
        proxiedplayer.sendMessage(translate(s));
    }

    public static void tell(CommandSender c, String s){

        c.sendMessage(translate(s));

    }
}
