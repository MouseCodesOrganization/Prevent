package me.manlydev.prevent;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Prevent extends JavaPlugin{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("prevent")) {	
			Player p = (Player) sender;
			p.sendMessage(ChatColor.AQUA + " Name: " + getDescription().getName() + " ");
			p.sendMessage(ChatColor.AQUA + " Version: " + getDescription().getVersion() + " ");
			p.sendMessage(ChatColor.GREEN + " Author: " + getDescription().getAuthors() + " ");
			p.sendMessage(ChatColor.YELLOW + "Website:  " + getDescription().getWebsite() + " ");
			p.sendMessage(ChatColor.GREEN + "FullName: " + getDescription().getFullName() + " ");
			p.sendMessage(ChatColor.GREEN + "Description: " + getDescription().getDescription() + " ");
			p.sendMessage("Commands: /prevent");

			// Errors? Contact me!
			// Use the spigot as a external jar!
			// Made from eclipse.
	    }
		return false;
	}
}
	
