package eu.sordiddev.rainbowtext;

import eu.sordiddev.rainbowtext.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class RainbowText extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        int color;
        getCommand("rtr").setExecutor(new GradientAlogythm(1));
        getCommand("rtg").setExecutor(new GradientAlogythm(30));
        getCommand("rtb").setExecutor(new GradientAlogythm(45));
        getCommand("rty").setExecutor(new GradientAlogythm(15));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
