package day28_varargs;

public class C01_Varargs {

    public static void main(String[] args) {

        add(2,3); // 5
        add (2,3,8); // 13
        add(3,6,4,3); // 16

        // if we increase the number of parameters, everytime java will ask us to create another method for it

    }

    private static void add(int num1, int num2, int num3, int num4) {
        System.out.println("total = "+ (num1+num2+num3+num4));
    }

    private static void add(int num1, int num2, int num3) {
        System.out.println("total = "+ (num1+num2+num3));
    }

    public static void add(int number1, int number2) {
        System.out.println("total = "+ (number1+number2));

    }


}
