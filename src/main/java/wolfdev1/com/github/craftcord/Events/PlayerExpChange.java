package wolfdev1.com.github.craftcord.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import wolfdev1.com.github.craftcord.Config;

import java.awt.*;
import java.time.Instant;

import static wolfdev1.com.github.craftcord.CraftCord.jda;

public class PlayerExpChange implements Listener {
    @EventHandler
    public void onPlayerExpChange(PlayerExpChangeEvent e) {
        EmbedBuilder eb = new EmbedBuilder()
                .setAuthor(e.getPlayer().getName(), null, "https://crafatar.com/avatars/" + e.getPlayer().getUniqueId())
                .setTitle("Xp Update")
                .setDescription("The Xp of " + e.getPlayer().getName() + " has been updated to " + e.getPlayer().getExp())
                .setTimestamp(Instant.now())
                .setFooter("Xp Update")
                .setColor((e.getPlayer().getExp() < 1 ? Color.RED : Color.GREEN))
                ;
        jda.getTextChannelById(Config.CHANNEL_ID).sendMessageEmbeds(eb.build()).queue();
    }
}
