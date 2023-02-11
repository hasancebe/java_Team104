package day10_stringManipulations;

public class C06_isBlank {

    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isEmpty()); //true

        String str2 = "      ";
        System.out.println(str2.isEmpty());  //false

        System.out.println(str.isBlank());  //true
        System.out.println(str2.isBlank()); // true

        String str3 ="x";

        System.out.println(str3.isBlank());  //false
        System.out.println(str3.isEmpty());  //false



    }
}
