package eu.sordiddev.rainbowtext.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class AlgorythmDynamic implements CommandExecutor {

    //get the color variable. 1 -> red; 2-> green; 3 -> blue; 4 -> yellow; 5 -> rainbow

    int color = 0;
    public AlgorythmDynamic(int i) {
        color = i;
    }
    /*
    color codes
    RED         ff0000  111111110000000000000000
    GREEN       6fff12  011011111111111100010010
    BLUE        00f5ff  000000001111010111111111
    YELLOW      ffff00  111111111111111100000000
     */

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] text) {

        //getting the text length and the input text
        String inputtext = String.join(" ",text);
        String outputtext = "";
        int textlength = inputtext.length();

        return false;
    }
    //todo
}
