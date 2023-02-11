package day38_Abstraction;

public class BChildClass extends AParent {

    // In the lessons we have learned so far child class does not take parent's method
    // if we do not force them
    // in normal parent child relation, it is not mandatory.

    // If we want we can override every methods in parent class or
    // If we do not want to , we just do not

    // Child has the all freedom
    //can ovverride, use , child can choose not to use (three options)


    @Override
    public void method1() {
        System.out.println("child override");
    }



    public static void main(String[] args) {
        BChildClass obj = new BChildClass();
        obj.method1();
        obj.method2();

    }
}
