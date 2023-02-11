package day09_StringManipulations;

public class C02_equals {

    public static void main(String[] args) {

        String asdfasdf = "Ali";

        String str2 = "ali";
        String str3 = new String("Ali");
        String str4 = "Ali";


        System.out.println(asdfasdf == str2); // false
        System.out.println(asdfasdf==str3);   // false
        System.out.println(asdfasdf==str4);  // true


        // when we try to compare Strings we should not use == sing
        //instead we should use "equals" method
        System.out.println("--------------------------");
        System.out.println( asdfasdf.equals(str3));


    }
}
