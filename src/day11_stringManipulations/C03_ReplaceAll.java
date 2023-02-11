package day11_stringManipulations;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        String str = "234234j234a234234234v234a 234i234s 234234bea324uti234ful";

        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\D",""));


        // please calculate the total price
        String str1 ="price is 2000 Euro";
        String str2 ="price is 1500 Euro";



        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        int str1Price = Integer.parseInt(str1);
        int str2Price = Integer.parseInt(str2);

        System.out.println("totalPrice is = "+ (str1Price+str2Price));

//        System.out.println("----------------------------");
//        String strNumber = "20";
//        String strNumber2 = "10";
//
//        System.out.println(strNumber+strNumber2);
//
//        int strNumberValue = Integer.parseInt(strNumber);




    }
}
