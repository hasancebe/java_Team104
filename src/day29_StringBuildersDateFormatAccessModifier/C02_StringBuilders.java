package day29_StringBuildersDateFormatAccessModifier;

public class C02_StringBuilders {

        public static void main(String[] args) {

            StringBuilder sb = new StringBuilder("How beautiful java is");

            System.out.println("sb.toString().toUpperCase() = " + sb.toString().toUpperCase());
            System.out.println("orginal "+sb);

            System.out.println(sb.toString().contains("java")); //true


            // if we use toString method and after that if change the value by using String methods
            // it will not affect the original value.


            sb.setCharAt(4,'J');
            System.out.println(sb);



           // sb=sb.toString().substring(5);

            // after using a String class method, we can not assign the result to a StringBuilder because using
            //String class methods will turn StringBuilder to String. we can not assign two different data types.

        }
}
