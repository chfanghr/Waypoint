package site.urandom.waypoint.commands;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import site.urandom.waypoint.Waypoint;
import site.urandom.waypoint.commands.grammar.SubcommandRulesBaseListener;
import site.urandom.waypoint.commands.grammar.SubcommandRulesParser;
import site.urandom.waypoint.events.PlayerDeathEventListener;
import site.urandom.waypoint.models.WorldAndCoordinate;
import site.urandom.waypoint.models.WorldAndCoordinateDataType;

import java.util.*;

public class WCommandListener extends SubcommandRulesBaseListener {
    private final Waypoint plugin;
    private final Player player;
    private final PersistentDataContainer dataContainer;
    private final NamespacedKey lastDeathKey;
    private final String lastLocationKey = "last";
    private final NamespacedKey lastKey;

    public WCommandListener(Waypoint plugin, Player player) {
        this.plugin = plugin;
        this.player = player;
        this.dataContainer = player.getPersistentDataContainer();
        this.lastDeathKey = new NamespacedKey(plugin, PlayerDeathEventListener.locationKey);
        this.lastKey = new NamespacedKey(plugin, lastLocationKey);
    }

    public enum State {
        OK,
        SYNTAX_ERROR,
        INVALID_NAME,
        DUPLICATED_NAME,
        LOCATION_NOT_FOUND,
        UNKNOWN
    }

    private State state = State.UNKNOWN;

    public boolean getIsOk() {
        return state == State.OK;
    }

    private interface WaypointProvider {
        String getName();

        WorldAndCoordinate getWaypoint();
    }

    public void setWaypoint(WaypointProvider provider) {
        String name = provider.getName();
        if(name.equals(PlayerDeathEventListener.locationKey) || name.equals(lastLocationKey)){
            player.sendMessage(ChatColor.RED+"This is a reserved name");
            state = State.INVALID_NAME;
            return;
        }
        NamespacedKey key = new NamespacedKey(plugin, name);
        if (dataContainer.has(key, WorldAndCoordinateDataType.getInstance())) {
            player.sendMessage(ChatColor.RED + "There is already a waypoint named " + name);
            state = State.DUPLICATED_NAME;
            return;
        }

        WorldAndCoordinate data = provider.getWaypoint();

        dataContainer.set(key, WorldAndCoordinateDataType.getInstance(), data);
        player.sendMessage(ChatColor.GREEN + "Waypoint set " + name);
    }

    @Override
    public void exitSetNameOnly(SubcommandRulesParser.SetNameOnlyContext ctx) {
        setWaypoint(new WaypointProvider() {
            @Override
            public String getName() {
                return ctx.name.getText();
            }

            @Override
            public WorldAndCoordinate getWaypoint() {
                return new WorldAndCoordinate(player);
            }
        });
    }

    @Override
    public void exitSetWithCoord(SubcommandRulesParser.SetWithCoordContext ctx) {
        setWaypoint(new WaypointProvider() {
            @Override
            public String getName() {
                return ctx.name.getText();
            }

            @Override
            public WorldAndCoordinate getWaypoint() {
                double x = Double.parseDouble(ctx.x.getText());
                double y = Double.parseDouble(ctx.y.getText());
                double z = Double.parseDouble(ctx.z.getText());
                String world = player.getWorld().getName();
                return new WorldAndCoordinate(world, x, y, z);
            }
        });
    }

    @Override
    public void exitSetWithCoordWorld(SubcommandRulesParser.SetWithCoordWorldContext ctx) {
        setWaypoint(new WaypointProvider() {
            @Override
            public String getName() {
                return ctx.name.getText();
            }

            @Override
            public WorldAndCoordinate getWaypoint() {
                double x = Double.parseDouble(ctx.x.getText());
                double y = Double.parseDouble(ctx.y.getText());
                double z = Double.parseDouble(ctx.z.getText());
                String world = ctx.world.getText();
                return new WorldAndCoordinate(world, x, y, z);
            }
        });
    }

    private void doTp(String name) {
        NamespacedKey key = new NamespacedKey(plugin, name);

        doTp(key);
    }

    private void doTp(NamespacedKey key){
        if (!dataContainer.has(key, WorldAndCoordinateDataType.getInstance())) {
            state = State.LOCATION_NOT_FOUND;
            player.sendMessage(ChatColor.RED + "No such waypoint named " + key.getKey());
            return;
        }

        WorldAndCoordinate currentLocation = new WorldAndCoordinate(player);

        Location location =
                Objects.requireNonNull(dataContainer.get(key, WorldAndCoordinateDataType.getInstance()))
                        .toLocation();

        player.sendMessage(ChatColor.GREEN + "Teleporting u to " + key.getKey());
        player.teleport(location);

        dataContainer.remove(lastKey);

        dataContainer.set(lastKey, WorldAndCoordinateDataType.getInstance(), currentLocation);
    }

    @Override
    public void exitTp(SubcommandRulesParser.TpContext ctx) {
        doTp(ctx.name.getText());
    }

    @Override
    public void exitRemove(SubcommandRulesParser.RemoveContext ctx) {
        String name = ctx.name.getText();
        NamespacedKey key = new NamespacedKey(plugin, name);

        dataContainer.remove(key);

        player.sendMessage(ChatColor.GREEN + "Waypoint removed: " + name);
    }

    @Override
    public void exitSubcommand(SubcommandRulesParser.SubcommandContext ctx) {
        if (state == State.UNKNOWN)
            state = State.OK;
    }

    @Override
    public void exitList(SubcommandRulesParser.ListContext ctx) {
        Set<NamespacedKey> allKeys = dataContainer.getKeys();
        allKeys.stream()
//                .filter(k->!k.getKey().equals(PlayerDeathEventListener.locationKey.toLowerCase(Locale.ROOT)))
                .filter(k->dataContainer.has(k, WorldAndCoordinateDataType.getInstance()))
                .forEach(k -> player.sendMessage(ChatColor.GREEN+k.getKey()+" -> "+ Objects.requireNonNull(dataContainer.get(k, WorldAndCoordinateDataType.getInstance()))));
    }

    @Override
    public void exitTpToLastDeath(SubcommandRulesParser.TpToLastDeathContext ctx) {
        if(!dataContainer.has(lastDeathKey, WorldAndCoordinateDataType.getInstance())){
            player.sendMessage(ChatColor.RED+"Your last death location hasnt been recorded!");
            state = State.LOCATION_NOT_FOUND;
            return;
        }

        doTp(lastDeathKey);
    }

    @Override
    public void exitLast(SubcommandRulesParser.LastContext ctx) {
        if(!dataContainer.has(lastKey, WorldAndCoordinateDataType.getInstance())){
            player.sendMessage(ChatColor.RED+"Your last location hasnt been recorded!");
            state = State.LOCATION_NOT_FOUND;
            return;
        }

        doTp(lastKey);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        state = State.SYNTAX_ERROR;
    }
}
