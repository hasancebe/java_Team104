package day41_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterators {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        ListIterator lit1= list.listIterator();
        // print all values which are over 35
        while (lit1.hasNext()){
            lit1.next();

//            if ((Integer)lit1.next()<35){
//                lit1.remove();
//            }
        }
        System.out.println(list);

        // by using iterators delete all numbers which are between 15 and 35
        while (lit1.hasPrevious()){
            Integer value = (Integer) lit1.previous();

            if (value>15 && value<35){
                lit1.remove();
            }
        }
        System.out.println(list);
    }
}
