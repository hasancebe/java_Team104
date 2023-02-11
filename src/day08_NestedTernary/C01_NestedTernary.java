package day08_NestedTernary;

import java.util.Scanner;

public class C01_NestedTernary {

    public static void main(String[] args) {

        // get an integer from user   //  Scanner

        //if positive print even number or not even number   // number%2==0
        //if it is not positive print 3 digit or not 3 digit


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if ( number>0){

            System.out.println(number%2==0 ? "yes it is an even number"   : "it is not an even number" )  ;

        }else {

            System.out.println(number<=-100 && number>-1000  ? "it has 3 digits"    : "It does not have 3 digits")  ;
        }


        // only use ternary


        String str =

                number >0
                ?
                number %2 ==0? "even number": "not an even number"
                :
                number<=-100 && number>-1000 ?"it has 3 digits" :"It does not have 3 digits";  // result is string


        System.out.println(str);


    }


}
