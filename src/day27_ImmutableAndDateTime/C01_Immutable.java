package day27_ImmutableAndDateTime;

public class C01_Immutable {

    public static void main(String[] args) {

        String str = "Java is funny";

        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        System.out.println(str);
        str = str.toUpperCase();
        System.out.println("str after the assingment = " + str);

        // The objects created from Immutable classes, can not be changed after creating.
        // If we do not do any assignment, the value will not change, Instead java will create another object
        // If we assign java will create a new object and it will assign it

    }
}
