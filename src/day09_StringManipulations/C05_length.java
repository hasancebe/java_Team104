package day09_StringManipulations;

public class C05_length {

    public static void main(String[] args) {


      //
        String str ="Java";
        System.out.println(str.length());

        System.out.println(str.charAt(0));  //J
        System.out.println(str.charAt(3));  //a
        System.out.println(str.charAt(2));  //v


        String str1 = "Javaisveryeasyandfunnyandperfect";

        System.out.println(str1.length());  //32

        System.out.println(str1.charAt(str1.length()-1));



    }
}
