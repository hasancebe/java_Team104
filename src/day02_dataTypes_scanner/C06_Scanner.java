package day02_dataTypes_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        /*
          Question 2- Take a double and an int number from the user and print their sum and product.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a  number");
        double number1 = scan.nextDouble();

        System.out.println("Please enter a second whole number");
        int number2 = scan.nextInt();

        System.out.println("sum of two number is = "+(number1 + number2));
        System.out.println("product of two number is = "+(number1*number2));






    }
}
