package day16_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

            /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

        Scanner scan = new Scanner(System.in);
        String str = "";

        do{
            System.out.println("please enter a word");
            str = scan.nextLine();
            if (str.length()%2!=0 && str.length()>=3){

                System.out.println(str.charAt(str.length()/2));

            }

        }while (str.length()%2!=0 && str.length()>=3);

        System.out.println("You entered wrong word");

    }
}
