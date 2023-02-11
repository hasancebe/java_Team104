package day41_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator lit1= list.listIterator();

        // Print all varlues of the lsit without the index
        while (lit1.hasNext()){
            System.out.print((Integer) lit1.next()+1+" ");
        }

        System.out.println();
        System.out.println("--------------");
        // Print all elements starting from the end to the begining
        while ((lit1.hasPrevious())){
            System.out.print(lit1.previous()+" ");
        }

        // change all list's elements by adding 5 to them.

        while (lit1.hasNext()){

          lit1.set   ( (Integer)lit1.next()+5);

        }

        System.out.println(list);
    }
}
