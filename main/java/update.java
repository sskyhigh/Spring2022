/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * 03/09/22
 *
 * @author Shao
 */
public class update {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        final int goldplated = 100, fourteen = 500, eighteen = 1000; // knowing that data will not change. 
        int count = 0, total = 0, keeptrack = 0;
        double salestaz = 0.05, shipping = 5.99;
        System.out.println("What Kind of Necklace do you want to buy? Below are the list of options: \n 1 - gold plated \n 2 - 14k gold \n 3 - 18k gold \n 4 - Exit");
        int GetInfo = input.nextInt();

        while (GetInfo != 4) {

            count++;
            if (GetInfo == 1) {
                System.out.println("Specify length of Chain ");
                size = input.nextInt();
                if (size >= 10 && size <= 24) {
                    total = size * goldplated;
                } else {
                    System.out.println("Your chain is too big");
                }
            } else if (GetInfo == 2) {
                System.out.println("Specify length of Chain ");
                size = input.nextInt();
                if (size >= 10 && size <= 24) {
                    total = size * fourteen;
                } else {
                    System.out.println("Your chain is too big");
                }
            } else if (GetInfo == 3) {
                System.out.println("Specify length of Chain ");
                size = input.nextInt();
                if (size >= 10 && size <= 24) {
                    total = size * eighteen;
                } else {
                    System.out.println("Your chain is too big");
                }
            }
            keeptrack += total; // quantity variable 
            System.out.println("What Kind of Necklace do you want to buy? Below are the list of options: \n 1 - gold plated \n 2 - 14k gold \n 3 - 18k gold \n 4 - Exit");
            GetInfo = input.nextInt();
        }
        double displaytax = keeptrack * salestaz;
        double grandtotal = keeptrack + displaytax;
        if (grandtotal > 100) {
            grandtotal = grandtotal + shipping;
        } else;
        System.out.println("Purchases made: " + count);
        System.out.println("Tax: " + displaytax);
        System.out.println("This is your Grand total: " + grandtotal);
    }
}
