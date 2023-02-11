package day14_methodCreatins;

public class C02_StringConcat {

    //create a method that accepts two given strings as parameters
    // returns these two strings to the main method as
    // a single string with a space between them

    public static String stringConcat (String str1, String str2){

        String result = str1 + " " + str2;
        return result;

    }

    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "Can";

        String returnedResult = stringConcat(str1,str2);

        System.out.println(returnedResult);

    }



}
