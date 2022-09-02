/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.io.*;

public class zip {

    public static void main(String[] args) throws IOException {
        Arrays.sort(nums);
    }

    public static void readData(int[] arr, int arr1) throws IOException {
        try (Scanner input = new Scanner(new File("zipcodes.txt"))) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.toString();
            }
        }
    }

    public static boolean isBrooklyn(String[] arr, String[] BrooklynArr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.equals("112")) {
                arr[i] = BrooklynArr[i];
                return true;
            }
        }
        return false;
    }

    public static int splitData(String[] arr, String[] BrooklynArr, String[] BronxArr) {
        int count = 0;
        for (String arr1 : arr) {
            if (!arr1.contains("112")) {
                System.out.println(arr1);
                count++;
            } else if (arr1.contains("104")) {
                System.out.println(arr1);
                count++;
            }
        }
        return count;
    }
}
