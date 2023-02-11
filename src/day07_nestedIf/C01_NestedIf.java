package day07_nestedIf;

import java.util.Scanner;

public class C01_NestedIf {


    public static void main(String[] args) {

        //Question 1- Get the gender and age from the user. Female, 60 years old and over,
        // Men 65 years and older can retire. Print “You can retire” or
        // “You need to work .. more years to retire”, taking into account gender and age.


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your gender"); // Male
        char gender = scan.next().charAt(0);

        System.out.println("Please enter your age");    //45
        int age = scan.nextInt();



        if (gender=='m'  ||  gender == 'M') {

            if (age >= 65){

                System.out.println("yes you can retire");

            }else {

                System.out.println("you need to work "+ (65-age)+ " more years");
            }

        } else if (gender == 'f'   || gender== 'F') {

            if (age >= 60){

                System.out.println("yes you can retire");

            }else {

                System.out.println("you need to work "+ (60-age)+ " more years");
            }

        } else {

            System.out.println("invalid information");
        }


    }
}
