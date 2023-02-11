package day14_methodCreatins;

import java.util.Scanner;

public class C06_OurSubStringMethod {

    /*
    Question 1- Create a method that prints the letters in the String given as input from the user ,
     including the starting index, excluding the ending index, according to the start and end indexes.
     - if the user enters a number greater than the end value as the start value, give an error message
     - if the user enters an index larger than the length, print an error message.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();

        System.out.println("please enter a number");
        int num1 = scan.nextInt();

        System.out.println("please enter second number");
        int num2 = scan.nextInt();

        ourSubStringMethod(str,num1,num2);

    }

    public static void ourSubStringMethod(String str, int staringNumber, int endingNumber){

        if(staringNumber>endingNumber){
            System.out.println("error, first number is higher than second one");

        } else if (staringNumber>str.length()) {
            System.out.println("error, staring number is higher than the length");

        }else {
            for (int i = staringNumber; i <endingNumber ; i++) {
                System.out.print(str.charAt(i));

            }
        }


    }


}
