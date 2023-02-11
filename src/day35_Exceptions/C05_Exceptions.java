package day35_Exceptions;

import java.util.Scanner;

public class C05_Exceptions {

    // create a calculater


    public static void main(String[] args) {

      calculater();




    }

    public static void calculater (){

        Scanner scan = new Scanner( System.in);


        int a = 0;
        int b= 0;

        try {
            System.out.println("Please enter first numebr");
            a = scan.nextInt();
            System.out.println("please enter second number");
            b = scan.nextInt();
        } catch (Exception e) {

            System.out.println("maan please don't do that");
            calculater();
        }

        System.out.println("What do you want to do");
        String sign = scan.next();

        switch (sign){

            case "+":
                System.out.println(a+b);

            case "-":
                System.out.println(a-b);

            case "*":
                System.out.println(a*b);

            case "/":
                System.out.println(a/b);

            default:
                System.out.println("you did not enter a sign");
                calculater();

        }


    }

}
