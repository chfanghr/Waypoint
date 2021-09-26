package site.urandom.waypoint.events;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataContainer;
import site.urandom.waypoint.Waypoint;
import site.urandom.waypoint.models.WorldAndCoordinate;
import site.urandom.waypoint.models.WorldAndCoordinateDataType;

public class PlayerDeathEventListener implements Listener {
    public static final String locationKey = "lastDeath";

    private final NamespacedKey containerKey;

    public PlayerDeathEventListener(Waypoint plugin){
        containerKey = new NamespacedKey(plugin, locationKey);
    }

    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event){
        Player player = event.getEntity();
        PersistentDataContainer dataContainer = player.getPersistentDataContainer();
        WorldAndCoordinate deathLocation = new WorldAndCoordinate(player);

        if(dataContainer.has(containerKey, WorldAndCoordinateDataType.getInstance())){
            dataContainer.remove(containerKey);
        }

        dataContainer.set(containerKey, WorldAndCoordinateDataType.getInstance(), deathLocation);
    }
}
