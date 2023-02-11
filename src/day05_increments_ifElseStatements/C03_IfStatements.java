package day05_increments_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        // lets take two integer from the user
        // if the first number is bigger than 100 " a is bigger than 100"
        // if second number is an even number , print b is an even number
        // if first number is bigger than the second one, print a is bigger than b
                    //a>b

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int a = scan.nextInt();

        System.out.println("please enter an another integer");
        int b = scan.nextInt();

        if (a>100) {

            System.out.println( a+ " is bigger than 100");

        }

        // if second number is an even number , print b is an even number
        //condition reminder should be zero for an even number

        if (b%2==0) {
            System.out.println( b+ " is an even number");

        }

        // if first number is bigger than the second one, print a is bigger than b
        //a>b

        if (a>b) {

            System.out.println(a + " is bigger than " + b);


        }


    }

}
