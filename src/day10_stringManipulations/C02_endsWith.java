package day10_stringManipulations;

public class C02_endsWith {

    public static void main(String[] args) {

        String str = "Java is everywhere";

        System.out.println(str.endsWith("where"));  //true

        System.out.println(str.endsWith("")); //true

        System.out.println(str.endsWith("Java is everywhere")); //true




    }
}
