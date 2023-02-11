package day03_MathCalculations;

import java.util.Scanner;

public class C08_MadulusQuestions {


    /*
    Let's take a positive 4-digit integer from the user and find the sum of the digits
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter a 4-digit integer");
        int nbr = scan.nextInt();  //1434  //12


        int firstDigit = nbr % 10;  // 4

        nbr = nbr/10;  //143

        int secondDigit = nbr%10;  //3

        nbr = nbr/10;  // 14

        int thirdDigit = nbr %10; //4

        nbr = nbr /10 ;  //1

        int fourthDigit = nbr;

        System.out.println(firstDigit+secondDigit+thirdDigit+fourthDigit);








    }





}
