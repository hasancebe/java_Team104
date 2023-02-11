package day07_nestedIf;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {

        //Question 2- Get 3 side lengths of triangle from the user,
        // print “Equilateral triangle” if the triangle is equilateral,
        // otherwise print “Not equilateral”.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 side lengths of the triangle");

        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();


        String result = (int1==int2 && int2==int3 )?  "Equilateral triangle"  : "not equilateral" ;

        System.out.println((int1==int2 && int2==int3 )?  "Equilateral triangle"  : "not equilateral");
        System.out.println(result);




    }
}
