
import java.util.Scanner;
import java.io.*;

public class zipcodes {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("zipcodes.txt"));
        int size = 100;
        int[] zipcodes = new int[size];
        System.out.println("Total amount of zipcodes: " + readData(zipcodes, input));
        isBrooklyn(zipcodes);
        isBronx(zipcodes);
        input.close();
    }

    /**
     *
     * @param zipcodes
     * @param input
     * @return
     * @throws IOException
     */
    public static int readData(int[] zipcodes, Scanner input) throws IOException {
        int i = 0;
        while (input.hasNext()) {
            zipcodes[i] = input.nextInt();
            i++;
        }
        return i;
    }

    /**
     *
     * @param zipcodes
     */
    public static void isBrooklyn(int[] zipcodes) {
        System.out.println("Brooklyn Zipcodes: ");
        int count = 0;
        for (int i = 0; i < zipcodes.length - 1; i++) {
            if (zipcodes[i] >= 11200 && zipcodes[i] <= 11299) {
                System.out.println(zipcodes[i]);
                count++;
            }
        }
        System.out.println("Tally: " + count);
    }

    /**
     *
     * @param zipcodes
     */
    public static void isBronx(int[] zipcodes) {
        System.out.println("Bronx Zipcodes: ");
        int count = 0;
        for (int i = 0; i < zipcodes.length; i++) {
            if (zipcodes[i] >= 10400 && zipcodes[i] <= 10499) {
                System.out.println(zipcodes[i]);
                count++;
            }
        }
        System.out.println("Tally:  " + count);
    }

    /**
     *
     * @param arr1
     * @param arr2
     * @param arr3
     * @return
     */
    public static int splitData(int[] arr1, int[] arr2, int[] arr3) {
        return 0;
    }
}
