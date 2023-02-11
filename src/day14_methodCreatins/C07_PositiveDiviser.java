package day14_methodCreatins;

import java.util.Scanner;

public class C07_PositiveDiviser {

    public static void main(String[] args) {


        /*
        Question 4- Get an integer from the user in the main method.
        Create a method that finds the number of positive divisors of
         the entered number and returns it to us.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        System.out.println(divisersOfNumber(number));

    }

    public static int divisersOfNumber (int num){
        int positiveDivisors=2;

        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                System.out.print(i);
                positiveDivisors=positiveDivisors+1;
            }
        }
        return positiveDivisors;
    }
}
