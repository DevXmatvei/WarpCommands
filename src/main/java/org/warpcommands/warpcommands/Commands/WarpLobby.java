package org.warpcommands.warpcommands.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpLobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Apenas Jogadores Podem Usar Este Comando");
            return true;
        }

        Player player = (Player) sender;

        if(command.getName().equalsIgnoreCase("warp lobby")) {

            if(args.length == 1 ) {
                return false;
            }

            World world = Bukkit.getWorld("world");

            if(world == null) {
                player.sendMessage("Mundo não encontrado");
            } else {
                player.sendMessage("Teleportando...");
            }

            Location location = new Location(world, 100, 100, 100);

            player.teleport(location);
            player.sendMessage("Teleportado");
        }
        return false;
    }
}
