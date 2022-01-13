package eu.sordiddev.rainbowtext;

import eu.sordiddev.rainbowtext.commands.RedGradient;
import org.bukkit.plugin.java.JavaPlugin;

public final class RainbowText extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("rtr").setExecutor(new RedGradient());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
