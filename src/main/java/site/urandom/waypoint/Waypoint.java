package site.urandom.waypoint;

import org.bukkit.Bukkit;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import site.urandom.waypoint.commands.WCommandExecutor;
import site.urandom.waypoint.events.PlayerDeathEventListener;

import java.util.Objects;

public final class Waypoint extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("w"))
                .setExecutor(new WCommandExecutor(this));
        Bukkit.getPluginManager().registerEvents(
                new PlayerDeathEventListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
