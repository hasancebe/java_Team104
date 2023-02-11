package day16_doWhile;

import java.util.Scanner;

public class C06_DoWhileHardQuestion {


    public static void main(String[] args) {

        /*
        Question 2- Ask the user to enter a password. Check the entered password according to the following conditions and
        print the errors in the password.
    Repeat this process until the user enters a valid password and print “Your Password Accepted” when the valid password is entered.
- Password must contain  lowercase letter
- Password must contain capital letter
- Password must contain special character
- Password must have at least 8 characters.

         */
        Scanner scan =new Scanner(System.in);
        String password ="";
        int isItOkay=0;

        do{

            System.out.println("please enter a password to save");
            password = scan.next();
            isItOkay=0;
            //- Password must contain  lowercase letter
            isItOkay= isItOkay+doesContainLowerCase(password);

            //- Password must contain capital letter
            isItOkay= isItOkay +doesContainCapital(password);

            if(password.length()>=8){
                isItOkay++;
            }else {
                System.out.println("It should have at least 8 characters");
            }



        }while (isItOkay!=3);

        System.out.println("Your password is saved");




    }

    public static int doesContainCapital(String password) {

        int isItRight =0;
        for (int i = 0; i <= password.length()-1; i++) {
            if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
            isItRight++;
            }
        }
        if (isItRight>0){
            return 1;
        }else {
            System.out.println("It does not have a Capital letter");
            return 0;
        }
    }

    public static int doesContainLowerCase(String password) {
        int isItRight=0;

        for (int i = 0; i <= password.length()-1; i++) {

            if(password.charAt(i)>='a'&& password.charAt(i)<='z'){
                isItRight++;
            }

        }

        if(isItRight>0){
            return 1;
        }else {
            System.out.println("It does not have a lowercase");
            return 0;
        }

    }
}
