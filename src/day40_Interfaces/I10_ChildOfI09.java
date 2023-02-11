package day40_Interfaces;

public class I10_ChildOfI09 implements I09_InterfaceStaticAndDefaultMethods{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method55() {

    }

    public static void main(String[] args) {


        //the difference between static and default methods in an interface

        //To call a static method from an interface, we need write the name of the interface
        I09_InterfaceStaticAndDefaultMethods.method4();


        //To call a default method from an interface, we need to create a object then by using the object we can call
        //the method from the interface
        I10_ChildOfI09 obj = new I10_ChildOfI09();
        obj.method3();

    }
}
