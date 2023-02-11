package day07_nestedIf;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        //Question 4- Get a grade from the user,
        // print “Passed the Class” if it is 50 or more,
        // and “Sorry, Failed” if it is less than 50.

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number!!!");

        int grade = scan.nextInt();

        System.out.println(grade >= 50 ? "passed the class" : "Sorry, Failed");


    }
}
