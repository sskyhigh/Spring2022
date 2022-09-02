/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.Scanner;
import java.util.Locale;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Shao
 */
public class homework3 {

    public static void main(String[] args) throws IOException {
        try {
            PrintWriter outfile;
            try (Scanner input = new Scanner(new File("InfoData.txt"))) {
                outfile = new PrintWriter("output.txt");
                int a = input.nextInt();
                outfile.print("ID:       BattleAverage:         Homerun:  ");
                System.out.println("ID:             BattleAverage:         Homerun:  ");
                //int [] arr = new int[a.nextInt()];
                for (int i = 0; i < a; i++) {
                    if (input.hasNextInt()) {
                        var playerID = input.nextInt();
                        double bat = input.nextDouble();
                        double hit = input.nextDouble();
                        double home = input.nextDouble();
                        double battleaverage = hit / bat;
                        double homerun = home / bat;
                        System.out.println(playerID);
                        BigDecimal setdec1 = new BigDecimal(battleaverage).setScale(2, RoundingMode.HALF_UP);
                        BigDecimal setdec2 = new BigDecimal(homerun).setScale(2, RoundingMode.HALF_UP);
                        System.out.print("                     " + setdec1 + "                     ");
                        System.out.print(setdec2 + "\n");
                        outfile.print("\n" + playerID + "\n");
                        outfile.print("              " + setdec1);
                        outfile.print("           " + setdec2 + " \n");
                    }
                }
            }
            outfile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
