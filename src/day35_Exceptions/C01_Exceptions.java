package day35_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // ask user to enter a whole number
        // write a code that prints the square of the number

    calculate();

        /*
        some exceptions can be handled by if else statements but not always
         */




    }
    public static void calculate (){
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter a whole number");

        int enteredNumber = 0;

        try {
            // The codes might be risky should be taken inside of try block
            enteredNumber = scan.nextInt();
        } catch (InputMismatchException e) {
            //In catch block we guide java to solve the problem

            System.out.println("you did not enter a whole number");
            // we called same method to start over everything
            calculate();
        }
        System.out.println(enteredNumber*enteredNumber);
    }
}
