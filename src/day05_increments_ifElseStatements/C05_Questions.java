package day05_increments_ifElseStatements;

import java.util.Scanner;

public class C05_Questions {

    public static void main(String[] args) {

        //Question 3- Get a number from the user, print “Number divisible by 3”
        // if the number is divisible by 3, “Number divisible by five” if it is divisible by 5.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please give us a number");
        int number = scan.nextInt();


        if (number%3==0 && number % 5==0) {

            System.out.println("number is divisible by 15");
        }

        if (number%3==0)  {
            System.out.println("number is devisible by 3");
        }

        if(number%5==0) {

            System.out.println("number is devisible by 5");

        }






    }
}
