package day10_stringManipulations;

import java.util.Locale;

public class C07_null {

    public static void main(String[] args) {

        String str1 = "";
        System.out.println("---------------");
        System.out.println(str1);
        System.out.println("---------------");

        System.out.println(str1.concat("Java"));

        // "" : we cant see it but it is there, we can feel it, and we can use it wherever we want to
        //"" is a value so we can assing it

        System.out.println(str1+3+4);

        String strNull = null ;
        System.out.println(strNull);

        System.out.println(strNull+"java");
       // System.out.println(strNull.length());
        System.out.println(strNull.toUpperCase(Locale.ROOT));



    }


}
