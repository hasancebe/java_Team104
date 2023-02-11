package day03_MathCalculations;

import java.util.Scanner;

public class C01_DataCasting {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println('a'+'b'); //ab //195  97+98= 195

        /*
        let's receive two letters from the user
        and write down 3 characters after the letter

        input : a   , output will be bcd


         */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a character");
        char enteredChar = scan.next().charAt(0);


        System.out.println("enteredchar is = "+enteredChar);

        System.out.println(""+(char)(enteredChar+1)+(char)(enteredChar+2)+(char)(enteredChar+3));

        /*
        Auto Widening : If you assing a value from a narrow data type to wider data type, java does it automatically.

        ExplicitNarrowing :
        If we want to assing a wide data type to a narrower data type java will ask us to take responsibility.
        In this case we have to write down the datatype we want to convert to in braces.

         */









    }



}
