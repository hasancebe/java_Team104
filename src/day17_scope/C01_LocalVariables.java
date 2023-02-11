package day17_scope;

public class C01_LocalVariables {



    // If we create a variable inside of a method, the scope of the variable will be that method.
    // which means we can not use them outside of that method


    public static void main(String[] args) {

        String name = "Ramazan";
        int number =10;

        for (int i = 0; i <10 ; i++) {

            String city = "Ankara";

        }

        //System.out.println(city);

        double pi;
        //System.out.println(pi);
        // if we created a variable but did not assing any value to it, we can not use that local variable
        //System.out.println(isTrue);

    }

    public static  void method1(){
       // System.out.println(name);
        boolean isTrue=true;

    }


}
