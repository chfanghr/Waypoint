package site.urandom.waypoint;

import org.bukkit.plugin.java.JavaPlugin;
import site.urandom.waypoint.commands.WCommandExecutor;

public final class Waypoint extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("w").setExecutor(new WCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
