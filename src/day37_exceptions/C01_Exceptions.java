package day37_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

        int a = 15;
        int b = 0;


        try {
            System.out.println(a/b);  // exception
            System.out.println("noooooo");
            System.out.println("yeeeees");
            System.out.println("I am a father");


        } catch (Exception e) {

            if ( a == 20){
                System.out.println(" a is 20");
            } else if (a==10) {
                System.out.println(" a is 10");
            }

            System.out.println("please do not try to devide a number by 0");
        }


    }

}
