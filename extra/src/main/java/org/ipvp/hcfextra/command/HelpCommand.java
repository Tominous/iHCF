package org.ipvp.hcfextra.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.ipvp.hcfextra.HCFExtra;

import java.util.Collections;
import java.util.List;

public class HelpCommand implements CommandExecutor, TabCompleter {

    private final HCFExtra plugin;

    public HelpCommand(HCFExtra plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(plugin.getConfiguration().getHelpMessage());
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return Collections.emptyList();
    }
}
