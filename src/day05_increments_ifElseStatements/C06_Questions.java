package day05_increments_ifElseStatements;

import java.util.Scanner;

public class C06_Questions {

    public static void main(String[] args) {


        //Question 4- Get  each lengths of a triangle’s 3 sides from the user,
        // and if the triangle is equilateral, print "Equilateral Triangle".

        /*
        1) we will take 3 number from user
        2) condition : are they equal
        3) if it is true, print "Equilateral Triangle"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");

        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();

        if (int1==int2 && int2==int3)  {

            System.out.println("Equilateral Triangle");

        }








    }


}
