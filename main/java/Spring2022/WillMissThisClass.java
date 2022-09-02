/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Spring2022;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class WillMissThisClass {

    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfStrings = new ArrayList<>();
        String str = "";
        Scanner infile = new Scanner(new File("alwaysfriends.txt"));
        while (infile.hasNext()) {
            str = infile.next();
            // adding each string to arraylist
            listOfStrings.add(str);
        }
        String[] myArray = listOfStrings.toArray(String[]::new);
        ArrayList<String> Super = readData();
        // to count the variables and to assign a number to provide better readablity. 
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        for (String str1 : myArray) {
            counter++;
            System.out.println(counter+"." + " " + str1);
        }
        System.out.println("\n" + "Invalid identifiers: ");
        
        for (String str1 : myArray) {
            if (Character.isDigit(str1.charAt(0))) {
                counter1++;
                System.out.println(counter1 + "." + " " + str1);
            }
        }
        System.out.println("\n" + "Cannot start with UppperCases:");
        for (String str1 : myArray) {
            if (Character.isUpperCase(str1.charAt(0))) {
                counter2++;
                System.out.println(counter2 + "." + " " +str1);
            }
        }
        System.out.println("\n" + "This is the second read-in file: Invalid identifiers: ");
        for (String str1 : Super) {
            if (Character.isDigit(str1.charAt(0))) {
                counter3++;
                System.out.println(counter3 + "." + " " +str1);
            }
        }
        System.out.println("\n"+"Try not to start with UpperCase Letters: ");
        for (String str1 : Super) {
            if (Character.isUpperCase(str1.charAt(0))) {
                counter4++;
                System.out.println(counter4 + "." + " " +str1);
            }
        }
        // calling the readData arrayList and check if the comparisons made were right 
        System.out.println("\n"+"Data that are stored in second arraylist: ");
        System.out.println(readData() + "\n");
        // to sort the arrayList and compare as mentioned in the instructions
        Collections.sort(listOfStrings);
        Collections.sort(Super);
        
        int countMeIn = 0;
        System.out.println("\n "+"Duplicates found: ");
        for (String check : listOfStrings) {
            for (String check1 : Super) {
                if (check.equals(check1)) {
                    countMeIn++;
                    System.out.println(countMeIn + "." + " " +check);
                }
            }
        }
        System.out.println(countMeIn + " Duplicates found");
    }
// reads second file. 

    public static ArrayList<String> readData() throws IOException {
        ArrayList<String> loopArray = new ArrayList<>();
        String str = "";
        Scanner getFile = new Scanner(new File("tender.txt"));
        while (getFile.hasNext()) {
            str = getFile.next();
            loopArray.add(str);
        }
        return loopArray;
    }
}
