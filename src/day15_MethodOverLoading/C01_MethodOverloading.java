package day15_MethodOverLoading;

public class C01_MethodOverloading {

    // when we call a method
    /*
        1- java will check the names of methods
        2-  number of variables
        3- java will choose the easiest one, the least casting
     */


    public static void main(String[] args) {
    multiplicatoin(3,4);
    multiplicatoin(4,5);
    multiplicatoin(4.5,6);
    multiplicatoin(5.5,6.8);
    }
    public static void multiplicatoin(int number1, int number2){

        System.out.println("int and int"+number1*number2);
    }
    public static void multiplicatoin(int number1, int number2,int number3){
        System.out.println("intiger and int and int");
        System.out.println(number1*number2*number3);

    }
    public static void multiplicatoin(double number1, int number2){
        System.out.println("double and int");
        System.out.println(number1*number2);
    }
    public static void multiplicatoin(int number1, double number2){
        System.out.println("int and double");
        System.out.println(number1*number2);
    }
    public static void multiplicatoin(double number1, double number2){
        System.out.println("double double");
        System.out.println(number1*number2);
    }




}
