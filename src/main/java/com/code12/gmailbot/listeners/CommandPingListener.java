package main.java.com.code12.gmailbot.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class CommandPingListener implements EventListener {
    @Override
    public void onEvent(GenericEvent genericEvent){
        if(genericEvent instanceof MessageReceivedEvent event){
            if(event.getAuthor().isBot()) return;

            Message message = event.getMessage();
            String content = message.getContentRaw();

            if(content.equals("!ping")){
                MessageChannel channel = event.getChannel();
                channel.sendMessage("Pong!").queue();
            }
        }
    }
}
