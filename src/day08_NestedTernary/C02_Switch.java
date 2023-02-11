package day08_NestedTernary;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

        //For example, we need 8 if - else to write the name of the day entered by the user as a digit,
        // this may be long and difficult for those who review the code after this situation.


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");

        int number = scan.nextInt();

        if ( number==1) {
            System.out.println("Monday");
        } else if (number==2) {
            System.out.println("Tuesday");
        } else if (number==3) {
            System.out.println("Wednesday");
        } else if (number==4) {
            System.out.println("Thursday");
        } else if (number==5) {
            System.out.println("Fryday");
        } else if (number==6) {
            System.out.println("Saturday");
        } else if (number==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("invalid number");
        }





        switch (number) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Fryday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sudnay");
                break;

            default:
                System.out.println("invalid number");










        }





    }
}
