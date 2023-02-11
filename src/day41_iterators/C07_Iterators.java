package day41_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C07_Iterators {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ListIterator lit1= list.listIterator();

        System.out.println(lit1.nextIndex());
        lit1.next();
        System.out.println(lit1.nextIndex());
        lit1.next();

        System.out.println(lit1.nextIndex());



    }
}
