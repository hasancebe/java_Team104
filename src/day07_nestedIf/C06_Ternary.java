package day07_nestedIf;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        //Question 3- Ask the user for a letter,
        // if the entered character is lowercase,
        // print it in uppercase,
        // otherwise print the entered letter


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a letter");

        char letter = scan.next().charAt(0);

        System.out.println((letter<=122 && letter>=97)?(char)(letter-32):(letter));









    }


}
