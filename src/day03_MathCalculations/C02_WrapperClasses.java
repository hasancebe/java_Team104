package day03_MathCalculations;

public class C02_WrapperClasses {

    public static void main(String[] args) {

        int int1 = 5;

        Integer intW = 6;


            int1 = intW;

            intW = int1;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char a = '2';
        Character charW = '2';

        System.out.println(Character.isAlphabetic('a')); //true
        System.out.println(Character.isDigit('a'));  //false


        /*
        In primitive data types there is no methods for us to use

        But in Wrapper Classes there are a lot of different methods to use (MAX.VALUE, isDigit etc.)
         */











    }


}
