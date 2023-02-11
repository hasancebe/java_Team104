package day07_nestedIf;

import java.util.Scanner;

public class C02_NestedIf {

    public static void main(String[] args) {
        //        //Question 1- Get the gender and age from the user. Female, 60 years old and over,
        //        // Men 65 years and older can retire. Print “You can retire” or
        //        // “You need to work .. more years to retire”, taking into account gender and age.


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age");

        int age = scan.nextInt();

        System.out.println("Please enter your gender");

        char gender = scan.next().charAt(0);

        if (age <18) {

            System.out.println("you are too young to check");
        } else if (age>=18 && age<60) {

            System.out.println("you can not retire");
            if (gender=='M'|| gender=='m') {
                System.out.println("you need to work more " +(65-age) + " years");

            }
            if (gender=='f'|| gender=='F'){

                System.out.println("you need to work more " +(60-age) + " years");
            }


        } else if (age >=60 && age <65) {

            if (gender=='f' || gender == 'F'){

                System.out.println("you can");

            } else if (gender == 'm' && gender == 'M') {

                System.out.println("you need to work more " +(65-age) + " years");




            } else {
                System.out.println("invalid data");
            }



        } else if (age>=65) {
            System.out.println("you can retire");

        }


    }
}
