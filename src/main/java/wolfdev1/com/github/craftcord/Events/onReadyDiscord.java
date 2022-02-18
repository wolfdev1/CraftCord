package wolfdev1.com.github.craftcord.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;
import wolfdev1.com.github.craftcord.Config;

import java.awt.*;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.bukkit.Bukkit.getServer;

public class onReadyDiscord extends ListenerAdapter {
    @Override
    public void onReady(@NotNull ReadyEvent event) {
        EmbedBuilder eb = new EmbedBuilder()
                .setAuthor("Minecraft", null,
                        "https://www.minecraft.net/etc.clientlibs/minecraft/clientlibs/main/resources/img/GrassBlock_HighRes.png")
                .setTitle(":white_check_mark:  The server has been started")
                .setDescription("**Default gamemode:** " + getServer().getDefaultGameMode().name() + "\n" +
                        "**Motd: **" + getServer().getMotd())
                .setTimestamp(Instant.now())
                .setFooter("Server")
                .setColor(Color.decode("#94ffbf"));
        event.getJDA().getTextChannelById(Config.CHANNEL_ID).sendMessageEmbeds(eb.build()).queueAfter(2, TimeUnit.SECONDS);
    }
}
