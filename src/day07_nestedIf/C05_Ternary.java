package day07_nestedIf;

import java.util.Scanner;

public class C05_Ternary {


    public static void main(String[] args) {


        //Question 1- Ask the user for a number,
        // check the number and print “this number is a multiple of 5”
        // if it is divisible by 5.

        Scanner scan = new Scanner(System.in);

        System.out.println("We need a number, give it to us");

        int number = scan.nextInt();



        System.out.println(     number%5==0? "this number is a multiple of 5" :"number is not a multiple of 5");


        String resultOfTernary = number%5==0 ? "this number is a multiple of 5" :"number is not a multiple of 5";


    }

}
