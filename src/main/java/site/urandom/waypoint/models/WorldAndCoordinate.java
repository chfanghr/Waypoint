package site.urandom.waypoint.models;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.io.Serializable;
import java.util.Objects;

public class WorldAndCoordinate implements Serializable {
    private static final long serialVersionUID = 1;

    public String world;
    public double x, y, z;


    public WorldAndCoordinate(String world, double x, double y, double z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public WorldAndCoordinate(Player player) {
        Location location = player.getLocation();
        world = player.getWorld().getName();
        x = location.getX();
        y = location.getY();
        z = location.getZ();
    }

    public Location toLocation() {
        World worldObj = Objects.requireNonNull(Bukkit.getWorld(world));
        return new Location(worldObj, x, y, z);
    }

    @Override
    public String toString() {
        return String.format("%f %f %f %s", x, y, z, world);
    }
}
