package wolfdev1.com.github.spigotdiscordplugin.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.awt.*;
import java.time.Instant;

import static wolfdev1.com.github.spigotdiscordplugin.SpigotDiscordPlugin.jda;

public class PlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
        EmbedBuilder embed = new EmbedBuilder()
                .setAuthor(event.getEntity().getName(), null, "https://crafatar.com/avatars/" + event.getEntity().getUniqueId())
                .setTitle(event.getEntity().getName() + " has been death")
                .setDescription(event.getDeathMessage())
                .setTimestamp(Instant.now())
                .setFooter("Minecraft 1.18.1")
                .setColor(Color.decode("#ff4747"))
                ;
        jda.getTextChannelById("940697475088547870").sendMessageEmbeds(embed.build()).queue();
    }
}
