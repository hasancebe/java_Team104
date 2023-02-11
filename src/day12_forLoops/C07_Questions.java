package day12_forLoops;

public class C07_Questions {

    public static void main(String[] args) {

        //Question 9 (interview)- Ask the user for a String and print the String in reverse.


        String str = "Java abcdefg";

        int strLength = str.length();

        for (int i = strLength-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

        }




    }
}
