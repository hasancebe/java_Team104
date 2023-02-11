package day09_StringManipulations;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2));  //False
        System.out.println(str1.equals(str3));  //fasle

        System.out.println("--------------");
        System.out.println(str1.equalsIgnoreCase(str2));  //true
        System.out.println(str1.equalsIgnoreCase(str3));  //true
        System.out.println("-------------");
        System.out.println(str1.equalsIgnoreCase("ALI"));  //true


        //  This method does not care if the letters are capital or lower cases
        // if the letters are same, the result will ture









    }

}
