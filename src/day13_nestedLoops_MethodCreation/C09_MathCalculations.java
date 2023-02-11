package day13_nestedLoops_MethodCreation;

import java.util.Scanner;

public class C09_MathCalculations {

    public static void main(String[] args) {

        // a*b with method

        Scanner scan = new Scanner(System.in);



//        System.out.println("please enter the first number");
//        int a = scan.nextInt();
//        System.out.println("please enter the second number");
//        int b = scan.nextInt();

        int a = 2;
        int b = 3;

        int number=aTimesB(a,b);

        System.out.println(number);
    }

    public static int aTimesB( int a , int b){
        int result = a*b;

       return result;
    }



}
