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
import site.urandom.waypoint.models.WorldAndCoordinate;
import site.urandom.waypoint.models.WorldAndCoordinateDataType;

public class WCommandListener extends SubcommandRulesBaseListener {
    private Waypoint plugin;
    private Player player;
    private PersistentDataContainer dataContainer;

    public WCommandListener(Waypoint plugin, Player player) {
        this.plugin = plugin;
        this.player = player;
        this.dataContainer = player.getPersistentDataContainer();
    }

    public enum State {
        OK,
        SYNTAX_ERROR,
        DUPLICATED_NAME,
        NameNotFound,
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

    @Override
    public void exitTp(SubcommandRulesParser.TpContext ctx) {
        String name = ctx.name.getText();
        NamespacedKey key = new NamespacedKey(plugin, name);

        Location location = dataContainer.get(key, WorldAndCoordinateDataType.getInstance()).toLocation();
        if (location == null) {
            player.sendMessage(ChatColor.RED + "No such waypoint named " + name);
            return;
        }

        player.teleport(location);
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
    public void visitErrorNode(ErrorNode node) {
        state = State.SYNTAX_ERROR;
    }
}
