package day40_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class I02_ConcreteChildClassOfInterface implements I01_Interface{

    public static void main(String[] args) {

        System.out.println(STR);
        System.out.println(NUMBER_2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    List<String> list = new ArrayList<>();
}
