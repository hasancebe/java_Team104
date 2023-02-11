package day10_stringManipulations;

import java.util.Scanner;

public class C03_Questions {

    public static void main(String[] args) {


        // QUESTION : get a mail from the user
        // if the mail does not contain @, print "invalid mail"
        // if the mail does not contain @gmail.com, "mail must be gmail"
        // if the mail does not end with @gmail.com , print "there is a typo in the mail


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email");
        String email = scan.nextLine();
        System.out.println("entered email is : "+ email);

        if(!email.contains("@")) {
            System.out.println("invalid mail");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail must be gmail");

        } else if (!email.endsWith("@gmail.com")) {

            System.out.println("you typed wrongly");
        }else {
            System.out.println("perfect, your mail is saved");
        }


    }
}
