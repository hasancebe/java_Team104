package day41_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterators {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator it1 = list.iterator();
        it1.next();
        it1.next();

        it1.remove();
        System.out.println(list);

        Iterator it2 = list.iterator();
    }
}
