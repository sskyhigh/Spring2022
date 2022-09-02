package Spring;
import java.util.Scanner;

public class isLongMethod {

    /**
     *
     * @param read
     * @return
     */
    public static double isLong(double read) {
        int inches = 12;
        double a = read / inches;
        double formula = read % inches;
        System.out.printf("feet:  " + " %1.0f %n", a);
        System.out.println("inches: " + formula);
        return formula;
    }
    // I noticed you cannot really use the remainder to do mod% so I decided to trim down the decimal places. 
    // can also parse using integer but chances of data loss. 

    /**
     *
     * @param read
     * @return
     */
    public static boolean evaluate(double read) {
        if (read >= 100) {
            System.out.println("false");
            return false;
        } else {
            System.out.println(" true");
            return true;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your length in inches");
        double read = input.nextDouble();
        double displayFeet = isLong(read);
        evaluate(read);
    }
}
