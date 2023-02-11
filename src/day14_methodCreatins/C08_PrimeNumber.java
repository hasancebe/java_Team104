package day14_methodCreatins;

import java.util.Scanner;

public class C08_PrimeNumber {

    /*
    Question 3- Get a positive integer from user in main method.
    Create a method that checks if the entered number is a prime number and
     returns "prime" or "not prime" as a result.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        System.out.println(isItPrimeNumber(num));

    }

    public static String isItPrimeNumber(int number){

        String isPrime ="";
        for (int i = 2; i <number ; i++) {

            if(number%i==0){
                isPrime="not prime";
                break;
            }else {
                isPrime="prime";
            }
        }
        return isPrime;
    }
}
