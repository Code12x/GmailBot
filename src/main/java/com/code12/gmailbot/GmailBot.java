package com.code12.gmailbot;

import main.java.com.code12.gmailbot.listeners.CommandPingListener;
import main.java.com.code12.gmailbot.resource.References;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

/**
 * A little project :)
 * @since 31/1/22
 * @author Code12
 * @version 1.0
 */

public class GmailBot {

    private static JDA jda;

    public static void main(String[] args) throws LoginException {

        jda = JDABuilder.createDefault(References.BOT_TOKEN).build();

        registerEvents();

        System.out.println("Hello from the GmailBot! Made by: Code12");
    }

    private static void registerEvents() {
        jda.addEventListener(new CommandPingListener());
    }
}
