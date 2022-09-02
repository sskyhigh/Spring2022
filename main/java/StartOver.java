
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Shao
 */
public class StartOver {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("data.txt"));
        int size = 20;
        int n = 0;
        int[] array1Arr = new int[size];
        int[] array2Arr = new int[size];
        readLoansInfo(array1Arr, array2Arr, input);
        int print = sumLoans(array1Arr, array2Arr);
        findWorst(array1Arr, array2Arr);
        findBest(array1Arr, array2Arr);
        System.out.println("total is: " + print);
        input.close();
    }

    /**
     *
     * @param array1Arr
     * @param array2Arr
     * @param input
     * @return
     * @throws IOException
     */
    public static int readLoansInfo(int[] array1Arr, int[] array2Arr, Scanner input) throws IOException {
        int n = 0;
        while (input.hasNextDouble()) {
            array1Arr[n] = input.nextInt();
            array2Arr[n] = input.nextInt();
            n++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array1Arr[n]);
            System.out.println(array2Arr[n]);
        }
        return n;
    }

    /**
     *
     * @param array1Arr
     * @param array2Arr
     * @return
     * @throws IOException
     */
    public static int sumLoans(int[] array1Arr, int[] array2Arr) throws IOException {
        int sum = 0;
        for (int i = 0; i < array1Arr.length; i++) {
            sum = sum + array1Arr[i];
        }
        return sum;
    }

    /**
     *
     * @param array1Arr
     * @param array2Arr
     * @return
     * @throws IOException
     */
    public static int findWorst(int[] array1Arr, int[] array2Arr) throws IOException {
        int index = 0;
        double getSum = array1Arr[] - array2Arr[n];
        double percentage = array2Arr[] / array1Arr[];
        for (int i = 0; i < array1Arr.length; i++) {
            if (getSum / percentage) {
                index = i;
            }
        }
        return index;
    }

    /**
     *
     * @param array1Arr
     * @param array2Arrr
     * @return
     * @throws IOException
     */
    public static int findBest(int[] array1Arr, int[] array2Arrr) throws IOException {
        int index = 0;
        double getSum = array1Arr[] - array2Arr[n];
        double percentage = array2Arr[] / array1Arr[];
        for (int i = 0; i < array1Arr.length; i++) {
            if (getSum / percentage) {
                index = i;
            }
        }
        return index;
    }

    /**
     *
     * @param array1Arr
     * @param array2Arr
     * @throws IOException
     */
    public static void printArray(int[] array1Arr, int[] array2Arr) throws IOException {
        PrintWriter writer = new PrintWriter("results.txt");
        writer.println("Lent        ReturnedAmt");
        for (int i = 0; i < 20; i++) {
            PrintWriter printf = writer.printf("7.3f, 7.3", array1Arr[i], array2Arr[2]);
        }
        writer.close();
    }
}
