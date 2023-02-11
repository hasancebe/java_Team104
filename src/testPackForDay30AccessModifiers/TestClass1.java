package testPackForDay30AccessModifiers;

import day30_AccessModifiersEncapsulationsInheritance.C01_AccessModifiers;

public class TestClass1 {

    public static void main(String[] args) {

      //  C01_AccessModifiers.defaultnumber1  // we can not reach a default var from different package.
        System.out.println(C01_AccessModifiers.publicNumber1);

        System.out.println(C01_AccessModifiers.publictStr);
    }
}
