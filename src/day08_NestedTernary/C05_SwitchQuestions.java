package day08_NestedTernary;

import java.util.Scanner;

public class C05_SwitchQuestions {
    public static void main(String[] args) {


        //get a number from user
        //print if it is a week or weekend day


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter  a number");
        int number = scan.nextInt();


        switch (number) {


            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("you entered =" +number);
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("you entered =" +number);
                System.out.println("Weekend");
                break;
            default:
                System.out.println("please enter a correct number");


        }


    }
}
