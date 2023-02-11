package day40_Interfaces;

public class I03_ChildClassOfTwoInterfaces implements I02_Interface,I04_Interface{
    @Override
    public String method4() {
        return null;
    }

    /*
    1- If we are trying to create a relations between classes, we should use extend keyword
    2- if it is between an interface and a class, we should use implements keyword
    3- If it is between interfaces we should use extends keyword
    4- Concrete class should override all methods from implemented interfaces
        - if there is same variable in two interfaces, to call this kind of a variable
        we have to mention the name of the class variable belongs.
        (exp)  InterfaceName.variableName
        - if there is only one variable, just writing the name of variable is enough
     */


    //mother: go to the school!!!
    //father: go to the school!!!
    // If we want to override a mothod from parents and if there are more than one same named
    //method in parent classes, just overriding one method is enough. Because all of the same
    //named methods are same method.
    @Override
    public void method1() {
        System.out.println("I will go to the school");
    }

    //mother: go to the school by train
    //father: go to the school by bus

    // If same named methods have different return types, It becomes hard to override them.
    // We can change one of the return types or the name of one method

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I02_Interface.STR);
        System.out.println(I04_Interface.STR);
        System.out.println(NUM2);


    }
}
