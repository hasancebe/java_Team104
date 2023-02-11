package day38_Abstraction;

public abstract class DParentAbstractClass {

    /*
    An abstract class can have methods
    to make a normal class an abstract class, we should add abstract keyword before class
     */


    public abstract void mandatoryMethod();

    // abstract methods do not have any body

    public abstract void mandatoryMethod2();

    public abstract void mandatoryMethod3();

    public void method4(){
        // so far we used the therm of mehhod but actually there are a few different kinds of methods
        // concrete method
        // abstract method

        /*
        when we create an abstract method in parent class, we know that child has to override it. Because of this
        overridding we don't need any body in abstract methods. Because It will NEVER be used.

        becaus of that Java created abstract methods

        If we want to create a method to be overridden by the child ve create abstract methods
         */

    }

}
