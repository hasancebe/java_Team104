package day14_methodCreatins;

import java.util.Scanner;

public class C01_MethodCreation {

    //get two numbers from the user in the main method
    // create a method that accepts these two numbers as
    // parameters and returns their product to the main method

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scan.nextInt();
        System.out.println(multiplication(firstNumber, secondNumber));
        int returnedResult = multiplication(firstNumber, secondNumber);
        System.out.println(returnedResult);
    }
    public static int multiplication(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }


}
