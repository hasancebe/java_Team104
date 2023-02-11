package day41_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterators {

    public static void main(String[] args) {

        // without using index, we could not be able to change, update values in previous class


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator it1 = list.iterator();

        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());



    }
}
