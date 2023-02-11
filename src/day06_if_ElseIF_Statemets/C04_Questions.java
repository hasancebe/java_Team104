package day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class C04_Questions {

    public static void main(String[] args) {

        // Question 4- Ask the user to enter a character, print whether the entered character is uppercase or not.

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a letter");

        char letter = scan.next().charAt(0); // ali  >>   a

        if (letter >='A' && letter<='Z'){
            System.out.println("yes, it is a capital");

        }else {

            System.out.println("it is not a capital");
        }

    }
}
