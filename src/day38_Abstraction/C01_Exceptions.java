package day38_Abstraction;

public class C01_Exceptions {


    public static void main(String[] args) {
        int a =20;
        int b =0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("you can not devide a number by zero");
            System.out.println("problem is solved");
        }finally {
            System.out.println("Data server connection is refreshed");
        }
    }


}
