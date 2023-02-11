package day15_MethodOverLoading;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        //Question 4- Ask the user for positive integers to be added. Ask the user to press 0 when he wants to finish.
        //	When the user wants to finish, print the total number of positive integers entered and their sum.
        //
        //	Second part: If the user enters negative numbers, print "you cannot use negative numbers".
        //	Do not add this negative number to the number of numbers and the sum


        Scanner scan = new Scanner(System.in);

        int totalNumber =0;
        int number=4;

        while (number!=0){

            System.out.println("please enter a number to add\n" +
                    "press 0 to see the result");

            number= scan.nextInt();
            totalNumber = totalNumber +number;
        }
        System.out.println("total number is = "+totalNumber);




    }


}
