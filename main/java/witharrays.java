
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class witharrays {

    /**
     *
     * @param arr
     * @return
     */
    public static int lessThan100(int[] arr) {
        int sum = 0;
        int max = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                sum = sum + arr[i];
            }
        }

        return sum;
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int moreThan100(int[] arr) {
        int sum = 0;
        int max = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how big do you want your array to be? "); // defining the size of array, how many cheques does the user want to enter
        // instead of having to define an array size, I remember you told me we can have the user set an array size. 
        int size = input.nextInt();
        int newarray[] = new int[size];
        System.out.println("Enter your info: ");
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = input.nextInt();
        }
        System.out.println("Printed Values:" + Arrays.toString(newarray));
        int display = lessThan100(newarray);
        int show = moreThan100(newarray);
        System.out.println("Less than 100: " + display);
        System.out.println("More than 100: " + show);
    }
}
