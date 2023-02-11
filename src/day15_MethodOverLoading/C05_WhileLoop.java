package day15_MethodOverLoading;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        //get numbers from the user
        // calculate the totalNumber until it reaches 500 or over
        // then print the totalNumber and the number of entered numbers

        Scanner scan = new Scanner(System.in);

        int number=0;
        int totalNumber=0;

        int counter =0;

        while (totalNumber<500) {

            System.out.println("Please enter a number");
            number = scan.nextInt();

            totalNumber = totalNumber + number;
            counter = counter+1;


        }

        System.out.println("total number is = "+ totalNumber+" and number of entered numbers is = " + counter);




    }
}
