package day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class C01_Questions {

    public static void main(String[] args) {

        //Get a letter from the user, print it if there is the month that
        // starts with a letter. NOTE: No uppercase or lowercase sensitivity.
        // When the user types j or J, output is Jan.


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a letter");

        char firstLetter= scan.next().charAt(0);

        if (firstLetter == 'j'  || firstLetter == 'J')  {

            System.out.println("January or June or July");

        } if (firstLetter =='f' || firstLetter =='F'){
            System.out.println("February");
        } if (firstLetter =='m' || firstLetter =='M'){
            System.out.println("May or March");
        } if (firstLetter =='a' || firstLetter =='A'){
            System.out.println("April or August");
        } if (firstLetter =='s' || firstLetter =='S'){
            System.out.println("September");
        } if (firstLetter =='o' || firstLetter =='O'){
            System.out.println("October");
        }


        // if we use a lot of "if" statements, java will check all of them.






    }

}
