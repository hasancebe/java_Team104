package day36_exceptions;

public class C04_ClassCastException {

    public static void main(String[] args) {

        short number = 23;  // primitive data type
        int num2 = number;


        Short number3 = 21;
        //Integer nub4 = number3; // non primitive datas



        Object obj =number3;
        Integer num4= (Integer) obj; //Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.Short cannot be cast to class java.lang.Integer
        // (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')
        //at day36_exceptions.C04_ClassCastException.main(C04_ClassCastException.java:17)

        System.out.println(num4);
    }




}
