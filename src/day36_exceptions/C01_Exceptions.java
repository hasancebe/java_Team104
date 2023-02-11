package day36_exceptions;

import java.util.Scanner;

public class C01_Exceptions {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a integer");


        try {
            int a = scan.nextInt();  // the source of the problem
            System.out.println(" you wont see me");
        } catch (Exception e) {
            System.out.println("you did not enter an integer");
        }

        System.out.println("code should go on");


    }


}
