package day11_stringManipulations;

import java.util.Scanner;

public class C05_Questions {

    public static void main(String[] args) {
        /*
        //Question 1 : Get a sentence from the user
        // - if the sentence includes "home", print "home home sweet home"
        // - if the sentence includes "work", "good to work"
        // - if it includes both "You have home and work"
        // - if it contains neither, print "you need to work hard"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something");
        String str = scan.nextLine();


        if (str.contains("home")&&str.contains("work")){
            System.out.println("you have home and work");

        } else if (str.contains("work")) {
            System.out.println("good to work");

        } else if (str.contains("home")) {
            System.out.println("home home sweet home");

        }else {
            System.out.println("you need to work hard");
        }


    }
}
