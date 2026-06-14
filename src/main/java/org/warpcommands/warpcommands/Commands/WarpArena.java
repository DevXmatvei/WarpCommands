package org.warpcommands.warpcommands.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpArena implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Apenas Jogadores podem usar este Commando");
            return true;
        }

         Player player = (Player) sender; // Instacia do Player

        if(command.getName().equalsIgnoreCase("warp arena")) {

            if(args.length > 1 ) {
                return false;
            }

            World world = Bukkit.getWorld("world");

            if(world == null) { // Verifica se o world é null (Nada).
                player.sendMessage("Mundo não encontrado");
            } else { // se não.
                player.sendMessage("Teleportando...");
            }

            Location location = new Location(world, 100, 100, 100); // Cria uma Location.

            player.teleport(location); // Teleporta o Player para a Location.
            player.sendMessage("teleportado!"); // Manda um mensagem para o plyer que ele foi teleportado.

        }

        return false;
    }
}
