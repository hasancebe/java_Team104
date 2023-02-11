package day35_Exceptions;

import java.util.Scanner;

public class C04_Exeptions {

    // Ask user to enter numbers as many as user wants
    // then calculate the summation of entered numbers
    // whenever user press "Q" code will stop
    // application will inform user the result and number of entered numbers

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double enteredNumber =0;
        double total =0;
        int counter =0;

        boolean continuee = true;

        while (continuee){
            System.out.println("Please enter a number");

            try {
                enteredNumber= scan.nextInt();
                total+=enteredNumber;
                counter++;
                System.out.println("the loop has been completed");

            } catch (Exception e) {
                String str = scan.next();
                if(str.equalsIgnoreCase("Q")){
                    break;
                }
            }
        }
        System.out.println("total value : "+total+" and number of numbers : "+counter);
    }






}
