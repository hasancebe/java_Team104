package day39_abstraction;

public interface Interface01 {

    // Interface is full abstraction
    // Interfaces do not have any concrete methods

    // for a child class, an interface is like a blue-print (map, todolist, checklist)

    public static final int number1 = 10;
    int number2=20; // public, static and final
    double piNumber = 3.14;

    public abstract void method1();
    int method2(); // it is public and abstract
    public void method3(); // it is public and abstract

    //we do not need to write public and abstract when we are creating a method. even if we don't write them,
    // they will be still there.****All methods are public and abstract****
    // it is very similar with variables too, ****ALL variables are public, static and final****



}
