package org.warpcommands.warpcommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DefinirWarp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Apenas Jogadores Conseguem Usar Este Commando");
            return true;
        }

        if (command.getName().equalsIgnoreCase("createwarp <cordenadas>")) {

            if (args.length > 1) {

            }


        }
        return false;
    }


}
