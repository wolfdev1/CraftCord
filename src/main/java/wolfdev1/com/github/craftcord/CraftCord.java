package wolfdev1.com.github.craftcord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import wolfdev1.com.github.craftcord.Events.*;
import javax.security.auth.login.LoginException;

public final class CraftCord extends JavaPlugin implements Listener {
    public static JDA jda;
    @Override
    public void onEnable() {
        try {
            jda = JDABuilder.
                    createDefault(Config.BOT_TOKEN)
                    .setActivity(Activity.playing(Config.GAME_OF_ACTIVITY))
                    .addEventListeners(new onReadyDiscord())
                    .addEventListeners(new MemberMessage())
                    .build();
            getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            saveConfig();
            //getServer().getPluginManager().registerEvents(new MemberMessage(), this);
            getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
            getServer().getPluginManager().registerEvents(new PlayerMessage(), this);
            Bukkit.getLogger().info
            ("JDA Integration has been logged correctly with the name " + jda.getSelfUser().getAsTag());
        } catch (LoginException e) {
            Bukkit.getLogger().info
            ("The JDA Integration it could not load correctly, check Config Class and you make sure you have entered a correct token ");
        }
    }
}
