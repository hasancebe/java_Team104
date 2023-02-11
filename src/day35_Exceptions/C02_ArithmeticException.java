package day35_Exceptions;

public class C02_ArithmeticException {

    // take two numbers from user
    // and do division

    public static void main(String[] args) {

        int a = 20;
        int b = 4;


        if ( b==0){
            System.out.println(" you can not devide a number by zero");
        }else {
            System.out.println(a / b);
        }


    }

}
