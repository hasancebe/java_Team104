package day09_StringManipulations;

import java.util.Scanner;

public class C05_Questions {

    public static void main(String[] args) {

        // receive a word from user and print the last character of the text

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a long word");
        String str = scan.nextLine();

        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-3));  //dinamicly this code will show last character on the screen



    }

}
