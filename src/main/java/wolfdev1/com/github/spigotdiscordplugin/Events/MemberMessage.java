package wolfdev1.com.github.spigotdiscordplugin.Events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class MemberMessage extends ListenerAdapter implements Listener {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(!event.getChannel().getId().equals("940697475088547870"))
        {
            return;
        }else{
            if(event.getMessage().getId().equals(event.getJDA().getSelfUser().getId())) {
                return;
            }else{
                Bukkit.broadcastMessage
                        ( ChatColor.GOLD + "" + ChatColor.BOLD  +"" + event.getMember().getEffectiveName() + ": " + ChatColor.GRAY + "" +
                                event.getMessage().getContentRaw());
            }

        }
    }
}
