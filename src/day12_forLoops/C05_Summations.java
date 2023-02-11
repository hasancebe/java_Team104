package day12_forLoops;

public class C05_Summations {

    public static void main(String[] args) {

        // let's calculate summation of digits of a number which is entered by user

        int number = 1000000004;

        String numberstr = ""+number;
//        System.out.println(numberstr);
//
        int numberOfDigits= numberstr.length();

        int totalDigits=0;


        for (int i = numberOfDigits; i >=1 ; i--) {

            int firstD= number%10;
            totalDigits=totalDigits+firstD;


            number=number/10;

        }

        System.out.println(totalDigits);

    }



}
