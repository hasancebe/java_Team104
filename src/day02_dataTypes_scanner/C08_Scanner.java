package day02_dataTypes_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        /*
        Question 7 (Interview)- Take two numbers from the user and change their values (swap).

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the first number to swap");
        int number1 = scan.nextInt();

        System.out.println("please enter the second number to swap");
        int number2 = scan.nextInt();


        int empty;

        empty = number2;
        number2 = number1;
        number1 = empty;

        System.out.println("number1 is : "+ number1);
        System.out.println("number2 is : "+ number2);



    }


}
