package wolfdev1.com.github.craftcord.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.awt.*;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static wolfdev1.com.github.craftcord.CraftCord.jda;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        try {
            EmbedBuilder joinEb = new EmbedBuilder()
                    .setAuthor(event.getPlayer().getName(), null, "https://crafatar.com/avatars/" + event.getPlayer().getUniqueId())
                    .setTitle(event.getPlayer().getName() + " has been joined to the server")
                    .setDescription("Say hello to " + event.getPlayer().getName() + " :wave:")
                    .setTimestamp(Instant.now())
                    .setFooter("Minecraft 1.18.1")
                    .setColor(Color.decode("#94ffbf"));
            Objects.requireNonNull(jda.getTextChannelById("940697475088547870")).sendMessageEmbeds(joinEb.build()).queueAfter(3, TimeUnit.SECONDS);
        } catch (Exception e) {
            Bukkit.getLogger().info("The plugin has tried to get the information of a player who joined the server without success, CraftCord error #372");
        }
    }
}
