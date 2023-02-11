package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_Questions {

    public static void main(String[] args) {

        // Question 6- Create a method that takes a positive integer from the user
        // and returns all positive integers that can divide the integer entered by user to us as a list.

        System.out.println("divisorsOfNumber() = " + divisorsOfNumber());
    }
    public static List<Integer> divisorsOfNumber (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value");
        int enteredValue = scan.nextInt();
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <=enteredValue ; i++) {

            if(enteredValue%i==0){

                divisors.add(i);
            }

        }
        return divisors;

    }
}
