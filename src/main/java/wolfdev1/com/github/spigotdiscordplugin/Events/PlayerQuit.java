package wolfdev1.com.github.spigotdiscordplugin.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.awt.*;
import java.time.Instant;
import static wolfdev1.com.github.spigotdiscordplugin.SpigotDiscordPlugin.jda;

public class PlayerQuit implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        EmbedBuilder quitEb = new EmbedBuilder()
                .setAuthor(event.getPlayer().getName(), null, "https://crafatar.com/avatars/" + event.getPlayer().getUniqueId())
                .setTitle(event.getPlayer().getName() + " has been left the server")
                .setDescription("See you soon " + event.getPlayer().getName() + " :wave:")
                .setTimestamp(Instant.now())
                .setFooter("Minecraft 1.18.1")
                .setColor(Color.decode("#94ffbf"))
                ;

        jda.getTextChannelById("940697475088547870").sendMessageEmbeds(quitEb.build()).queue();
    }
}
