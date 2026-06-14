package org.warpcommands.warpcommands.Commands;

import com.sun.media.jfxmediaimpl.platform.Platform;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class WarpHelp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Apenas Jogadores Podem Usar este Commando");
            return true;
        }

        Player player = (Player) sender; // Instacia de um Player

        if(command.getName().equalsIgnoreCase("warp help")) {

            if (args.length > 1) {
                return false;
            }

            player.sendMessage("Comando Foi!");

        }
        return false;
    }
}
