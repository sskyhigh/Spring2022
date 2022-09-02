/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Lining editing should be a little neater this time, spent some time on formatting, indenting, and organizing the lines, let me
 * Shao Yan - 02/27/22 
 */
import java.util.Scanner;
public class hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Data = new Scanner (System.in);
       final int goldplated = 100, fourteen = 500, eighteen = 1000; // set prices of the necklaces
       int total = 0, count = 0, result = 0, size; // keeping track of prices and making sure that the statement becomes false, else it becomes infinite loop,
       // result set to 0  to keep track of grand total in case if user adds more necklaces; calculating the grand total， 
       String GetInfo = " "; 
       //GetInfo.replaceAll(" ", ""); // remove spaces when inputting info
       System.out.println("How many necklaces do you want to buy?:");
       int EnterData = Data.nextInt();
           while(count<EnterData){
           System.out.println("What Kind of Necklace do you want to buy? Below are the list of options: \n 1 - gold plated \n 2 - 14k gold \n 3 - 18k gold \n 4 - Exit  ");
           GetInfo = Data.next();
           
           if (GetInfo.equals("1")||GetInfo.equalsIgnoreCase("gold plated")||GetInfo.equalsIgnoreCase("goldplated")){
               System.out.println("Please specify the length of the Necklace (10 to 24 inches only).");
               size = Data.nextInt();
                   if(size >= 10 && size <=24){
                        total = size * goldplated;
                        result += total; // adds the total to the first total
                   }else{
                        System.out.println("Only Sizes 10 and 24 inches are allowed.");
                   continue;} // allows user to start over if the user enters a wrong input by accident. 
            
           }else if(GetInfo.equals("2")||GetInfo.equalsIgnoreCase("14k gold")||GetInfo.equalsIgnoreCase("14K")){
               System.out.println("\"Please specify the length of the Necklace (10 to 24 inches only)");
               size = Data.nextInt();
                    if(size >= 10 && size <=24){ // I used the AND indicator to keep the ranges in check.
                        total = size * fourteen;
                        result += total;
                    }else{
                        System.out.println("Only Sizes 10 and 24 inches are allowed. Try again");
                    continue;} // allows user to start over if the user enters a wrong input by accident. 
                    
           }else if(GetInfo.equals("3")||GetInfo.equalsIgnoreCase("18k gold")||GetInfo.equalsIgnoreCase("18K")){
                        System.out.println("Please specify the length of the Necklace (10 to 24 inches only)");
                        size = Data.nextInt();
                    if(size >= 10 && size <=24){
                        total = size * eighteen;
                        result += total; // adds the total from previous transaction
                    }else{
                        System.out.println("Only Sizes 10 and 24 inches are allowed. Try again");
                    continue; }// allows user to start over if the user enters a wrong input by accident. 
           }else{
                        System.out.println("Invalid operation, please type the word yes to try again"); // reloops back to the start. prompting user to enter another value.   
                        GetInfo = Data.next();
                    if(GetInfo.equalsIgnoreCase("Yes")){
                        continue; }
                    else{
                        break;}
                 } 
           
                    count++; // keep track of the loop, if there is no counter then it will be an infinite loop,
                    //program runs based on how many times it wants to run
                    //I noticed if I add the result=+ towards the end, the result doubles (say if the total is 2000, it shows 4000, I am not so sure why 
       }   
                    System.out.println("This is your price: $" + result + "\n");
    }
}
