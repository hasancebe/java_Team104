package day28_varargs;

public class C03_Varargs {

    // create a method that calculates total value of numbers except the first number,
    // then multiply total value by the first number

    public static void main(String[] args) {
        method1(3,4,5,5,7,8,6,4);
    }

    private static void method1(int firstNumber,int secondNumber,int thirdNumber, int... numbers) {

        int total =0;
        for (int each: numbers
             ) {
            total+=each;

        }

        System.out.println(firstNumber*total);
    }


}
