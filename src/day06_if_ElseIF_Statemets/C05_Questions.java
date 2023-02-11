package day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class C05_Questions {

    public static void main(String[] args) {

        //  Get  each lengths of a triangle’s 3 sides from the user,
        //        // and if the triangle is equilateral, print "Equilateral Triangle".
        //
        //        /*
        //        1) we will take 3 number from user
        //        2) condition : are they equal
        //        3) if it is true, print "Equilateral Triangle"
        //         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 sides ");

        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();


        if ( int1 <= 0 || int2 <=0 || int3<=0 ){

            System.out.println("invalid number for sides");
        } else if (int1 ==int2 && int2 == int3) {

            System.out.println("yes, it is an Equilateral Triangle");
        } else{

            System.out.println(" it is not an Equilateral Triangle");

        }




    }




}
