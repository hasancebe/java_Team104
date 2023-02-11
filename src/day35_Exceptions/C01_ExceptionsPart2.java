package day35_Exceptions;

import java.util.Scanner;

public class C01_ExceptionsPart2 {

    public static void main(String[] args) {

        // ask user to enter a whole number
        // write a code that prints the square of the number

        Scanner scan = new Scanner(System.in);

        int enteredNumber=0;
        boolean continuee = true;

        while (continuee){

            try {
                System.out.println("Please enter a number");
                enteredNumber= scan.nextInt();
            } catch (Exception e) {
                continue;
            }


        }
}}
