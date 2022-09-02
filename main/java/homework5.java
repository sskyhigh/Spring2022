

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class homework5 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("data.txt"));
        int size = input.nextInt();
        double[] array1 = new double[size]; // borrowed
        double[] array2 = new double[size]; // lent
        readLoansInfo(array1, array2, input, size);
        System.out.println("Returned loan:" + returnedLoan(array1, array2, size));

    }

    public static int readLoansInfo(double[] array1, double[] array2, Scanner input, int size)
            throws IOException {
        int n = 0;
        int total = 0;
        for (int i = 0; i < size; i++) {
            array1[n] = input.nextDouble();
            array2[n] = input.nextDouble();
        }
        return n;
    }

    public static double sumLoans(double[] array1, int size, int n) {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total = total + array1[i];
        }
        return total;
    }

    public static double returnedLoan(double[] array1, double[] array2, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array2[i];
        }
        return sum;
    }


    public static void printArrays(double[] array1, double[] array2, Scanner input, int size) {
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextDouble();
            array2[i] = input.nextDouble();
            System.out.println(array1[i] + array2[i]);
        }
    }
}
