package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_set {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Hasan");
        names.add("Huseyin");

        System.out.println(names); //[Ali, Veli, Hasan, Huseyin]

        names.set(1,"Muhammed");
        System.out.println(names); // [Ali, Muhammed, Hasan, Huseyin]


    }
}
