package day03_MathCalculations;


import java.util.Scanner;

public class C05_Questions {

    public static void main(String[] args) {

        /*
        Question 3- Get a number from the user, no matter whatever value the user enters, convert that number to a number between -128 and 127 and print it.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number"); 
        int enteredNumber = scan.nextInt();

        byte result = (byte) enteredNumber;

        System.out.println(result);




    }

}
