package wolfdev1.com.github.spigotdiscordplugin.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import wolfdev1.com.github.spigotdiscordplugin.Config;

import java.awt.*;
import java.time.Instant;

import static wolfdev1.com.github.spigotdiscordplugin.SpigotDiscordPlugin.jda;

public class PlayerMessage implements Listener {
    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent event) {
        EmbedBuilder msgEb = new EmbedBuilder()
                .setAuthor(event.getPlayer().getName(), null, "https://crafatar.com/avatars/" + event.getPlayer().getUniqueId())
                .setTitle(event.getPlayer().getName() + " has been sent a message")
                .setDescription(event.getMessage())
                .setTimestamp(Instant.now())
                .setFooter("Minecraft 1.18.1")
                .setColor(Color.decode("#94cfff"))
                ;
        jda.getTextChannelById(Config.CHANNEL_ID).sendMessageEmbeds(msgEb.build()).queue();
    }
}
