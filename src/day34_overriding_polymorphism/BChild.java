package day34_overriding_polymorphism;

public class BChild extends AParent {

    /*
    to create an overriding signature and method name should be same

    Normaly when we override a method only overriding method will run
    BUT
    If we want to run overrding and overridden methods at the same time
    we should add super. keyword to call overridden method.
    to call:
    super.overriddenMethodName

    @Override  :
    It is like a plan B, It is not a must but to create a clean code
    we should add this notation before overriding.

    If the coder changes a parameter or deletes the method, (If we used
    @Override notation) It will cause CTE. And It will give information
    By doing this it will prevent deleting or changing the method



     */


//    public void method1(String a){
//        System.out.println("BChild method1");
//    }
//
//    public void method2(){
//        System.out.println("Bchild method2");
//    }
//
//    @Override
//    public void method1() {
//
//    }
//
//    @Override
//    public void method3() {
//
//    }

    public void method1(String masdfasdfasdf){

    }




    public static void main(String[] args) {

        BChild obj1 = new BChild();
        obj1.method1("a");
        obj1.method2();

        System.out.println("----------------------");
        AParent obj2 = new BChild();
        obj2.method1();
        obj2.method1("a");
        obj2.method2();




    }
}
