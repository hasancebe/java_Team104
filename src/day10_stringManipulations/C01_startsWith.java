package day10_stringManipulations;

public class C01_startsWith {


    public static void main(String[] args) {

        String str1 = "We can not learn Java while preparing pasta";

        System.out.println(str1.startsWith("we")); //false

        System.out.println(str1.startsWith("W")); // true

        System.out.println(str1.startsWith("We can not learn Java while preparing pasta")); // true

        System.out.println(str1.startsWith("")); // true

        System.out.println(str1.startsWith(" learn",10)); // false


    }


}
