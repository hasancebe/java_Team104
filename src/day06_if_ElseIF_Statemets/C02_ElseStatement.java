package day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class C02_ElseStatement {

    public static void main(String[] args) {

        // if the user is older than 65, user can retire. If he is younger , user should wait for a few years.

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age");

        int age = scan.nextInt();

        if ( age >= 65) {
            System.out.println("you can retire, travel the world");

        }else {
            System.out.println("you need to work "+ (65-age) +" years more");

        }
    }
}
