package day09_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {

    public static void main(String[] args) {

        String str = "Java is happiness" ;

        System.out.println(str.toUpperCase(Locale.ROOT));  //JAVA IS HAPPINESS

        System.out.println(str);

        str= str.toUpperCase();

        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str); // java is happiness




        str.toUpperCase();   //capitals
        str = str.toUpperCase();


        str.toLowerCase();   // lower cases
        str = str.toLowerCase();


    }

}
