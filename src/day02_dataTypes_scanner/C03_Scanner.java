package day02_dataTypes_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String userName = scan.next();


        System.out.println(userName.toUpperCase(Locale.ROOT));



    }


}
