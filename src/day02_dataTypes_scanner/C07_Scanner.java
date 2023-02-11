package day02_dataTypes_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {


        /*
        Question 4- Take the length of 2 sides of a rectangle from the user and print the area of the rectangle.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter first length");
        double firstSide = scan.nextDouble();

        System.out.println("please enter second length");
        double secondSide = scan.nextDouble();


        System.out.println("the are of the rectangle is : "+(firstSide*secondSide)  );




    }

}
