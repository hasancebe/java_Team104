package day14_methodCreatins;

public class C03_ReverseString {

    //create a method that accepts a string as a parameter and
    // returns the inverted(reversed) version of the string

    public static void main(String[] args) {

        String str = "Work hard, learn java, earn money";
        System.out.println(reverseString(str));
    }

    public static String reverseString (String str){

        String reversedString ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString = reversedString + (str.substring(i, i + 1));
        }

       return reversedString;
    }


}
