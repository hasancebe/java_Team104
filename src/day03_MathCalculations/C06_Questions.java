package day03_MathCalculations;

import java.util.Scanner;

public class C06_Questions {

    public static void main(String[] args) {

        /*
        Question 4- Take two double numbers from the user, divide the first number
         by the second number and print the integer part of the result of the division operation.
         */

        Scanner scan = new Scanner(System.in);


        System.out.println("please enter a number");
        double dbl1 = scan.nextDouble();

        System.out.println("Please enter a second number");
        double dbl2 = scan.nextDouble();

        int result = (int)(dbl1/dbl2);

        System.out.println(result);  //0,433434



    }
}
