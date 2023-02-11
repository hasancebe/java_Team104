package day07_nestedIf;

import java.util.Scanner;

public class C03_NestedIf {

    public static void main(String[] args) {

        // Question 3- Get a number from the user, if the number is odd,
        // print it out if it is a negative or positive odd number,
        // if the number is an even number, print whether it is a multiple of 10.



        Scanner scan = new Scanner( System.in);

        System.out.println("please enter a number");

        int number = scan.nextInt();


        //

        if ( number % 2 !=0){  //  number %2 ==0

            if(number<0) {
                System.out.println("It is a negative number");
            }else {
                System.out.println("It is a positive number");
            }


        } else if (number %2 ==0) {

            if (number %10 == 0){
                System.out.println("It is a multiple of 10");
            }else {
                System.out.println("It is not a multiple of 10");

            }

        }


    }
}
