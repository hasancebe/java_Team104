package day40_Interfaces;

public interface I09_InterfaceStaticAndDefaultMethods {


    /*
       Because of Developers wishes, java creaters added an exception to interfaces

       In an application we might have a lot of classes that inheritates same interface for years. and If company wants
       to add a new method to this old interface but this method should not be overridden by old classes. For this kind
       of situations java creaters added default or static methods to interfaces. before java 8 if you had created a concrete
       method in an interface this would give CTE.

       With JAVA 8 coders can add concrete methods to Interfaces. And child classes may choose not to override this method
     */


    void method1();
    void method2();
    void method55();

    /***
    Normally, in interfaces all methods are public and abstract
     ***/

    // this default keyword is not an access modifier. We should be carefull about that. As you can see in the exp
    //we can add public before default.
    public default void method3(){
        System.out.println("Interface default method3");
    }

    public static void method4(){
        System.out.println("Interface static method");
    }
}
