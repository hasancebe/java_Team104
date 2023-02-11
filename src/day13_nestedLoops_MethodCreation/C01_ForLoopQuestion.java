package day13_nestedLoops_MethodCreation;

public class C01_ForLoopQuestion {

    public static void main(String[] args) {


            // we will get a string
            // reverse
            // save the string in a string


        String str = "Java is my best friend";
        String reverseString="";


        for (int i = str.length()-1; i >=0 ; i--) {

         reverseString= reverseString+  str.substring(i, i + 1);

        }

        System.out.println(reverseString);
        System.out.println(reverseString.substring(1,4));


    }
}
