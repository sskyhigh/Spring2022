
import java.util.Scanner;

public class withoutarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many checks are you going to enter?");
        int checks = input.nextInt();
        int keep = 0;
        int count = 0;
        int sum = 0;
        int sum1 = 0;
        int limit = 100;
        while (count < checks) {
            System.out.println("Enter values of all checks");
            keep = input.nextInt();
            count++;
            if (keep < limit) {
                sum = sum + keep;
            } else if (keep >= limit) {
                sum1 = sum1 + keep;
            }
        }

        System.out.println("total below 100: " + sum);
        System.out.println("total over 100: " + sum1);

        //int display = less100(keep, count);
        //int show = more100(keep, count);
        //System.out.println("You have " + count + "cheques under $100." + "total is:  " + display);
        //System.out.println("You have " + count + "cheques under $100." + "total is:  " + show);
    }
    /**
     *
     * @param keep
     * @param count
     * @return
     */
    /*
    public static int less100(int keep, int count) {
        int limit = 100;
        int sum = 0;
        if (keep < limit) {
            sum = sum + keep;
            count++;
            System.out.println(sum);
        }
        return sum;
    }
    /**
     * 
     * @param keep
     * @param count
     * @return 
     */
 /*
    public static int more100(int keep, int count) {
        int limit = 100;
        int sum = 0;
        if (keep > limit) {
            sum = sum + keep;
            count++;
        }
        return sum;
    }*/
}
