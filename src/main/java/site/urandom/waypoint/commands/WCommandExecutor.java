package site.urandom.waypoint.commands;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import site.urandom.waypoint.Waypoint;
import site.urandom.waypoint.commands.grammar.SubcommandRulesLexer;
import site.urandom.waypoint.commands.grammar.SubcommandRulesParser;

public class WCommandExecutor implements CommandExecutor {
    private Waypoint plugin;

    public WCommandExecutor(Waypoint plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return false;
        }

        Player player = (Player) sender;

        String input = String.join(" ",args);
        SubcommandRulesLexer lexer = new SubcommandRulesLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SubcommandRulesParser parser = new SubcommandRulesParser(tokenStream);

        ParseTree tree = parser.subcommand();
        ParseTreeWalker walker = new ParseTreeWalker();
        WCommandListener listener = new WCommandListener(plugin, player);

        walker.walk(listener, tree);

        return listener.getIsOk();
    }
}
