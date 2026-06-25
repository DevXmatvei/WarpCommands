package org.warpcommands.warpcommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.warpcommands.warpcommands.Commands.DefinirWarp;
import org.warpcommands.warpcommands.Commands.WarpArena;
import org.warpcommands.warpcommands.Commands.WarpHelp;
import org.warpcommands.warpcommands.Commands.WarpLobby;

public final class WarpCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        RegisterCommands();
        RegisterEvents();
        getLogger().info("§aPlugin de Warps Funcionando!");
    }

    public void RegisterCommands() {
        this.getCommand("warp help").setExecutor(new WarpHelp());
        this.getCommand("warp lobby").setExecutor(new WarpLobby());
        this.getCommand("warp arena").setExecutor(new WarpArena());
    }

    public void RegisterEvents() {

    }
}
