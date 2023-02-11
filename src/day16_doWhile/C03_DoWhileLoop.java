package day16_doWhile;

import java.util.Scanner;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        /*
        write a code that will not stop until it gets a "x" from the user. It should keep asking
        "plese press x to stop the program"

         */

        Scanner scan = new Scanner(System.in);

        String str ="";

        do{

            System.out.println("plese press x to stop the program");
            str = scan.nextLine();


        }while(!str.equalsIgnoreCase("x"));

        System.out.println("program ended, Computer wins");




    }


}
