package day04_incremets_decrements;

public class C02_Inc_Decr {

    public static void main(String[] args) {

        int a = 10 ;

        // Let's print the value of a then increase the value;

        System.out.println(a);
        a++;  //11

        // first increase the value and print it

        int b = 10 ;

        b++;
        System.out.println(b);  // 11



        // Let's print the value of c then increase the value
        int c = 10;

        System.out.println("c = "+c++);
        System.out.println( "c new value ="+ c);



        // first increase the value and print d

        int d = 10;
        System.out.println("d = "+ ++d);


        // If we use c++ or d++, java will complete the job first then it will increace the value of the number

        // but if ve use ++c or ++d, java will do increment first, then it will complete the job




    }


}
