package eu.sordiddev.rainbowtext.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;


public class AlgorythmStatic implements CommandExecutor {
    public int color;
    public int startcolor;

    public AlgorythmStatic(int i) {
        color = i;
        startcolor = i;

    }


    @Override
    public boolean onCommand ( CommandSender sender,  Command command,  String label,  String[] text) {

        //Check whether command sender has permissions to use the command, cancel event when permissions are not set
        if(!sender.hasPermission("rainbowtext.use")){
            sender.sendMessage(String.valueOf(
                    ChatColor.RED) + ChatColor.BOLD + "Rainbow" + ChatColor.GOLD + ChatColor.BOLD + "Text: " + ChatColor.YELLOW + "You are not allowed to execute this command. "+
                    ChatColor.DARK_GRAY + "[You are lacking the permission node rainboxtext.use]");
           return true;
        }

        if ( text.length == 0 ) {
            sender.sendMessage(ChatColor.GREEN + "");
            sender.sendMessage(ChatColor.GREEN + "RainbowText V 1.0");
            sender.sendMessage(ChatColor.GREEN + "");
            sender.sendMessage(ChatColor.GREEN + "/rtrs <text> - adds a static gradient to your text starting with red");
            sender.sendMessage(ChatColor.GREEN + "/rtgs <text> - adds a static gradient to your text starting with green");
            sender.sendMessage(ChatColor.GREEN + "/rtbs <text> - adds a static gradient to your text starting with blue");
            sender.sendMessage(ChatColor.GREEN + "/rtys <text> - adds a static gradient to your text starting with yellow");
            sender.sendMessage(ChatColor.GREEN + "For adding a dynamic gradient use /rt, /rtr, /rtg, /rtb or /rty");
            sender.sendMessage(ChatColor.GREEN + "");
            sender.sendMessage(ChatColor.GREEN + "github.com/sord1d/rainbowtext");
            return true;

        }

        int currentposition = 1;
        List<String> colors = Arrays.asList("#ff0000", "#ff1200", "#ff2400", "#ff3700", "#ff4900", "#ff5b00", "#ff6d00", "#ff8000", "#ff9200", "#ffa400", "#ffb600", "#ffc800", "#ffdb00", "#ffed00", "#ffff00", "#f5ff00", "#ecff00", "#e2ff00", "#d8ff00", "#ceff00", "#c5ff00", "#bbff00", "#b1ff00", "#a8ff00", "#9eff00", "#94ff00", "#8aff00", "#81ff00", "#77ff00", "#6fff12", "#66ff24", "#5eff37", "#55ff49", "#4dff5b", "#44ff6d", "#3cff80", "#33ff92", "#2bffa4", "#22ffb6", "#1affc8", "#11ffdb", "#09ffed", "#00ffff", "#00f5ff", "#00ecff", "#00e2ff", "#00d8ff", "#00ceff", "#00c5ff", "#00bbff", "#00b1ff", "#00a8ff", "#009eff", "#0094ff", "#008aff", "#0081ff", "#0077ff", "#126fed", "#2466db", "#375ec8", "#4955b6", "#5b4da4", "#6d4492", "#803c80", "#92336d", "#a42b5b", "#b62249", "#c81a37", "#db1124", "#ed0912", "#ff0000");
        String inputtext = String.join(" ",text);
        String outputtext = "";
        int textlength = inputtext.length();
        currentposition = 0;
        char currentletter;

        if ( textlength != 0 ) {
            while (textlength > currentposition) {
                String hex = colors.get(color);
                currentletter = inputtext.charAt(currentposition);
                if (Character.isSpaceChar(currentletter)){
                    outputtext = new String (outputtext + " ");
                }else{
                    outputtext = new String(outputtext + "&" + hex + currentletter);
                }
                currentposition = currentposition +1;

                if ( color < 70 ) {
                    color = color + 1;
                } else {
                    color = 1;
                }

            }
            color = startcolor;
        }

        ((Player) sender).chat(outputtext);

        return true;
    }




}
