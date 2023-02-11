package day28_varargs;

public class C02_Varargs {

    public static void main(String[] args) {
        add(); //0
        add(1); // 1
        add(2,3); // 5
        add (2,3,8); // 13
        add(3,6,4,3); // 16
        add(3,6,7,89,4,5,7,8,6,4,2,4,6,8); //159

    }
    public static void add(int... number1) {
       int total =0;
        for (int each: number1
             ) {
          total+= each;

        }

        System.out.println(total);
    }
}
