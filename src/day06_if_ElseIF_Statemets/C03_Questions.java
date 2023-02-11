package day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class C03_Questions {


    public static void main(String[] args) {

        // Question 2- Get a note from the user, print "Pass the Class"
        // if it is 50 or more, and "Sorry, failed" if it is less than 50.


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your grade");

        double grade = scan.nextDouble();

        if (grade >=50 ) {

            System.out.println("passed the class");

        }else {

            System.out.println("sorry you failed");
        }



    }



}
