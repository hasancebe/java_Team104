package day12_forLoops;

public class C06_Questions {

    public static void main(String[] args) {

        //Question 8 (interview)- Get a positive number from user, print all integers starting from 1 to 100,
        //- If the number is divisible by 3, print fizz instead of number
        //- If the number is divisible by 5, print buzz instead of number
        //- if the number is divisible by both 3 and 5, print fizzBuzz instead of number

        for (int i = 1; i <= 100; i++) {

            if (i%3==0 && i%5==0){
                System.out.println("fizzBuzz ");

            } else if (i%3==0) {
                System.out.print("fizz ");

            } else if (i%5==0) {
                System.out.print("buzz ");

            }else {
                System.out.print(i+" ");
            }

        }


    }
}
