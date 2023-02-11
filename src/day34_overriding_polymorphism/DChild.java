package day34_overriding_polymorphism;

public class DChild extends CParent {


    private void method1(){
        System.out.println("Child private method1");
    }

    //First Rule
    // static final and private methods can not be overridden

//    public void method2(){
//        System.out.println("Child static method2");
//    }

//    public final void method3 (){
//        System.out.println("Child final method3");
//    }


    public static void main(String[] args) {
        DChild obj1 = new DChild();
        obj1.method1();



    }



    public void method4(){
        // Second rule
        /*
        access modifiers

        child can not limit parents

        private< default< protected < public

        when we are overriding a method from parent class
        we should use same or more comprehensive access modifier
        otherwise It will cause a CTE
         */



    }

    public int method5(){

        return 2;
    }
    //Third Rule
    /*
    We can use different return types
    BUT
    If the return type is primitive (int, short) or void
    return type should be same with the parent method

    **We can also choose a child return type
     */


    //Rule 4
    /*
    Normaly overriding and overridden methods can not work together
    but if we want to run overridden method too, we should use
    super keyword
     */



}
