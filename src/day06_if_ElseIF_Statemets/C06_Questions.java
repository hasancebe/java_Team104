package day06_if_ElseIF_Statemets;

public class C06_Questions {

    public static void main(String[] args) {

        // take a number from user
        // check it if it is a negative number
        // check if it has one digit
        // check if it has two digits
        // if it has more digits lets say "big number"

        int number = 77 ;

        if (number<0){

            System.out.println("It is a negative number");
        } else if (number<10){
            System.out.println("It has only one digit");
        } else if (number<100) {
            System.out.println("It has two digits");
        }else {
            System.out.println("It is a big number");

        }


    }
}
