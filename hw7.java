import java.io.*;
import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) throws IOException {

        final int SIZE = 10;
        Scanner scn = new Scanner(new File("list1.txt"));
        Scanner scn2 = new Scanner(new File("list2.txt"));
        String[] arr1 = new String[SIZE];
        String[] arr2 = new String[SIZE];
        readData(arr1, scn);
        readData(arr2, scn2);
        System.out.println("List 1:");
        UpperCaseOrDigit(arr1);
        System.out.println("List 2:");
        UpperCaseOrDigit(arr2);
        selectionSort(arr1);
        selectionSort(arr2);
        System.out.println("Comparing lists....");
        if(areIdentical(arr1, arr2) == true) {
            System.out.println("Both lists are identical");
        }
        else{
            System.out.println("Both lists are different");
        }
    }
    public static int readData(String[] arr, Scanner scn) {
        int i = 0;
        while (scn.hasNextLine()) {
            arr[i] = scn.nextLine();
            i++;
        }
        return i;
    }
    public static void UpperCaseOrDigit(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i].charAt(0))) {
                System.out.println("Error! first character can't be upper case: " + arr[i]);
            }
            else if(Character.isDigit(arr[i].charAt(0))){
                System.out.println("Error! first character can't be a digit: " + arr[i]);
            }
        }
    }
    public static boolean areIdentical(String[] arr1, String[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].equals(arr2[i]))
                count++;
        }
        if(count == arr1.length)
            return true;
        return false;
    }
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    String temp=arr[i]; 
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
