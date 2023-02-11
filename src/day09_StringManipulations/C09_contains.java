package day09_StringManipulations;

public class C09_contains {

    public static void main(String[] args) {

        String str = " We are having fun!!";

        System.out.println(str.contains("")); // always true

        System.out.println(str.contains("fun")); //true
        System.out.println(str.contains(" are having")); //true

        System.out.println(str.contains("we")); //false

        str = " I am 39  years old";

        System.out.println(str.contains("39"));




    }

}
