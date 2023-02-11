package day02_dataTypes_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
            Question 1- Get values in three different data types from the user and print the entered values with their explanations.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your name?");
        String userName = scan.next();

        System.out.println("please enter your age");
        int userAge = scan.nextInt();

        System.out.println("how many kg are you?"); // 64,4 kg
        double userKg = scan.nextDouble();


        System.out.println("User name is : " + userName);
        System.out.println("user age is : " + userAge);
        System.out.println(" kg is : " + userKg);




    }


}
