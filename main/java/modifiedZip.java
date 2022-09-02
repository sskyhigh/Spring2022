
import java.util.Scanner;
import java.io.*;

public class modifiedZip {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("zipcodes.txt"));
        int size = 100;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];
        System.out.println(readData(arr1, input));
        boolean brooklyn = isBrooklyn(arr1);
        splitData(arr1, arr2, arr3);
    }

    /**
     *
     * @param input
     * @return
     */
    public static int readData(int[] arr1, Scanner input) {
        int i = 0;
        while (input.hasNext()) {
            arr1[i] = input.nextInt();
            i++;
        }
        return i;
    }

    /**
     *
     * @return
     */
    public static boolean isBrooklyn(int[] arr1) {
        boolean code = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 11200 && arr1[i] <= 11300) {
                return true;
        }return code;
    }

    /**
     *
     * @param arr1
     * @param arr2
     * @param arr3
     * @return
     */
    public static int splitData(int[] arr1, int[] arr2, int[] arr3) {
        int count = 0;
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (isBrooklyn(arr1) == true) {
                arr2[i] = arr1[i];
                System.out.println(arr1[i] + " is from Brooklyn");
                count++;
            } else if (isBrooklyn(arr1) == false) {
                arr3[counter] = arr1[i];
                System.out.println(arr1[i] + " is from Bronx");
                counter++;
            }
        }
        return count;
    }
}
