package eu.sordiddev.rainbowtext;

import eu.sordiddev.rainbowtext.commands.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RainbowText extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // old commands

        int color;
        getCommand("rtrs").setExecutor(new AlgorythmStatic(1));
        getCommand("rtgs").setExecutor(new AlgorythmStatic(30));
        getCommand("rtbs").setExecutor(new AlgorythmStatic(45));
        getCommand("rtys").setExecutor(new AlgorythmStatic(15));

        //Commands for the new generation method

       getCommand("rtr").setExecutor(new AlgorythmDynamic(1));
       getCommand("rtg").setExecutor(new AlgorythmDynamic(2));
       getCommand("rtb").setExecutor(new AlgorythmDynamic(3));
       getCommand("rty").setExecutor(new AlgorythmDynamic(4));
       getCommand("rt").setExecutor(new AlgorythmDynamic(5));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
