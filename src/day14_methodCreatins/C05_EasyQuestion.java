package day14_methodCreatins;

import java.util.Scanner;

public class C05_EasyQuestion {

    public static void main(String[] args) {

        // get firstname and last name from the user
        // make it just like that  ali can >> Ali Can with a method

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = scan.next();

        System.out.println("Please enter your last name");
        String lastName = scan.next();

        processName(firstName,lastName);

    }

    public static void processName (String name,String lastName) {

        System.out.println(name.substring(0,1).toUpperCase()+
                            name.substring(1).toLowerCase()+
                            " "+
                            lastName.substring(0,1).toUpperCase()+
                            lastName.substring(1).toLowerCase());
    }

}
