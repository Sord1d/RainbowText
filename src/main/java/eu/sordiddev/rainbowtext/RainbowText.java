package eu.sordiddev.rainbowtext;

import eu.sordiddev.rainbowtext.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class RainbowText extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        int color;
        getCommand("rtrs").setExecutor(new AlgorythmStatic(1));
        getCommand("rtgs").setExecutor(new AlgorythmStatic(30));
        getCommand("rtbs").setExecutor(new AlgorythmStatic(45));
        getCommand("rtys").setExecutor(new AlgorythmStatic(15));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
