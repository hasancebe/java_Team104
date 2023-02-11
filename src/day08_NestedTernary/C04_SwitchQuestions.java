package day08_NestedTernary;

import java.util.Scanner;

public class C04_SwitchQuestions {

    public static void main(String[] args) {

        // get a letter form the user that th euser wants to know the maining of it from ISTQB;
        //Print the description ot the letter

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);


        switch (letter)  {

            case 'I':
            case 'i':
                System.out.println("international");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("invalid letter");


        }



    }
}
