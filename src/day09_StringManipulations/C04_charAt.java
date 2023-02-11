package day09_StringManipulations;

public class C04_charAt {


    public static void main(String[] args) {

        String str = "Java is the best";

        System.out.println("------------");
        System.out.println(str.charAt(0));  //J
        System.out.println("------------");
        System.out.println(str.charAt(5)); //i
        System.out.println(str.charAt(10));// e


       // System.out.println(str.charAt(30)); // gives error


        // index is different than number of the characters
        // java stars from 0 to count



    }
}
