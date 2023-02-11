package day09_StringManipulations;

public class C06_subString {

    public static void main(String[] args) {

        String str1 = "Learn Java, get the job";

        System.out.println(str1.substring(5));  //  Java, get the job
        System.out.println("----------------");
        System.out.println(str1.substring(0));  //

        System.out.println(str1.length()); // 23
        System.out.println(str1.substring(str1.length()-3));
        System.out.println(str1.substring(20));




    }
}
