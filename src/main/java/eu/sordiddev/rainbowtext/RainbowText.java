package eu.sordiddev.rainbowtext;

import eu.sordiddev.rainbowtext.commands.BlueGradient;
import eu.sordiddev.rainbowtext.commands.GreenGradient;
import eu.sordiddev.rainbowtext.commands.RedGradient;
import eu.sordiddev.rainbowtext.commands.YellowGradient;
import org.bukkit.plugin.java.JavaPlugin;

public final class RainbowText extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("rtr").setExecutor(new RedGradient());
        getCommand("rtg").setExecutor(new GreenGradient());
        getCommand("rtb").setExecutor(new BlueGradient());
        getCommand("rty").setExecutor(new YellowGradient());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
