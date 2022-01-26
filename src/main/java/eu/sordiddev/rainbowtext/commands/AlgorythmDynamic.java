package eu.sordiddev.rainbowtext.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.image.ColorModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class AlgorythmDynamic implements CommandExecutor {

    //get the color variable. 1 -> red; 2-> green; 3 -> blue; 4 -> yellow; 5 -> rainbow
    List<String> colors = new ArrayList<>();
    int color;
    Color loopcolor;
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


       // TODO Define start values for the colors depending on the command

        float hue1 = Color.RGBtoHSB(10
                , 1, 10, null)[0];
        float hue2 = Color.RGBtoHSB(100, 100, 110, null)[0];

        //defining text length n and starting a loop for n steps

        int n = textlength;
        for (int i = 0; i < n; i++) {

            //calculating a gradient due to the power of maths - yay maths (I googled the maths formula)
           loopcolor =  Color.getHSBColor(hue2 + (i * (hue2 - hue1) / n), 1, 1);

           //getting rgb values and converting it to hex, adding the color to the color list
            int red = loopcolor.getRed();
            int green = loopcolor.getGreen();
            int blue = loopcolor.getBlue();
            String hex = String.format("#%02x%02x%02x", red, green, blue);
            colors.add(hex);

        }

        sender.sendMessage(String.valueOf(colors)); //TODO REMOVE

        if ( textlength != 0 ) {
            int currentposition = 0;
            char currentletter;
            while (textlength > currentposition) {
                String hex = colors.get(currentposition);
                currentletter = inputtext.charAt(currentposition);
                if (Character.isSpaceChar(currentletter)){
                    outputtext = new String (outputtext + " ");
                }else{
                    outputtext = new String(outputtext + "&" + hex + currentletter);
                }
                currentposition = currentposition +1;


            }

        }

        ((Player) sender).chat(outputtext);
        colors = new ArrayList<>();


        return false;
    }





}
