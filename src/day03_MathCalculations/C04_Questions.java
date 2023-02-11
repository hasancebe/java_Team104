package day03_MathCalculations;

public class C04_Questions {

    public static void main(String[] args) {

        /*
        Question 1- Write a code that prints the average of 3 int values as double

         */

        int int1 = 33;
        int int2 = 3;
        int int3 = 66;

        double dbl = (int1+int2+int3)/3;
        System.out.println(dbl);


        int int4 = 20;
        double int5 = 6;
        System.out.println(int4/int5);


        System.out.println(21/6);   // 3.6666666   result will be 3 because an integer can not store decimals
        System.out.println(20/6);   // 3.3333333    result will be 3 because an integer can not store decimals
        System.out.println(20/6.0);  //3.3333333333333335






    }
}
