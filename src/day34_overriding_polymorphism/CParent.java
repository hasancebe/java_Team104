package day34_overriding_polymorphism;

public class CParent {

    private void method1(){
        System.out.println("Parent private method1 ");

        // Private methods can not be overridden because chidren
        //classes can not reach it because of access modifiers
    }

    public static void method2(){
        System.out.println("Parent static method2");
        // static methots and variables blong to the class they are in
        // we can not override them
    }
    public final void method3 (){
        System.out.println("Parent final method3");
    }

     void method4(){
        //default access modifier

    }

    public int method5(){
        return 2;
    }
}
