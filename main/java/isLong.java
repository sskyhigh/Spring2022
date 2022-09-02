
import java.util.Scanner;

public class isLong {

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
        System.out.printf("inches: " + "%.0f %n", formula); // not sure why the demical still shows in output after. 
        return formula;
    }

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
            System.out.println("true");
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
        isLong(read);
        evaluate(read);
    }
}
