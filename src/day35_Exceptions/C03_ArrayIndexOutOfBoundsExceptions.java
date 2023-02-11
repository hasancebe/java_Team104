package day35_Exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsExceptions {

    // take an array
    // and print the value of a given index


    public static void main(String[] args) {

        int [] arr= {3,5,7,4,2,6,8,5,3,5,7,4,6,3};

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an index");
        int index = scan.nextInt();


        try {

            System.out.println(arr[index]);
        } catch (Exception excp) {

            System.out.println(excp.getMessage()); //Index 20 out of bounds for length 14
            excp.printStackTrace(); //java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 14
            //at day35_Exceptions.C03_ArrayIndexOutOfBoundsExceptions.main(C03_ArrayIndexOutOfBoundsExceptions.java:22)


            /*
            even we do not write anything in this catch, code will continue working
            coder can write whatever he/she prefers in side of the catch block
            even premaden error messages

            If coder wants to write different codes he/she can write
            coder can prefor writing nothing
             */




        }

        System.out.println("problem passed");


    }



}
