package day29_StringBuildersDateFormatAccessModifier;

public class C01_StringBuilders {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is Life");

        System.out.println(sb1.reverse()); // efiL si avaJ

        System.out.println(sb1.insert(0, ".")); // .efiL si avaJ

        System.out.println("orginal value of sb1 : "+sb1);

        sb1.reverse();

        StringBuilder sb2 = new StringBuilder("Java is Life");

               String str = "Java is Life";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true
        // System.out.println(sb1==str);  I can not compare them. Because they have different data types


        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        System.out.println(sb1.equals(str)); //false

        StringBuilder sb3 = new StringBuilder(str);

        StringBuilder sb4 = new StringBuilder("Java is beautiful");

        System.out.println(sb1.compareTo(sb4)); //-22
        System.out.println(sb1.compareTo(sb2)); // 1

        System.out.println(sb1 + "----"+sb2) ;

        StringBuilder sb5 = new StringBuilder("Java is beautiful");
        StringBuilder sb6 = new StringBuilder("Jdva is asdfasdful");

        System.out.println(sb5.compareTo(sb6)); // -3


    }


}
