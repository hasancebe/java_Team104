package day42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        System.out.println(ll1); // [K, T]

        /*
        LinkedLists implemented three interfaces
        List, Queue and Deque interfaces
        because of being first concrete class coming after these interfaces
        LinkedList class has to override all abstart methods from these interfaces

        when we are creating a linkedlist, according to the datatype we choose
        this linked list can carry features of an interface

        or if we use linkedList as a dataType, this list will carry all features from all three interfaces
         */

        List<String> ll2 = new LinkedList<>();



        ll2.add("R");
        System.out.println(ll2.add("Z")); // true

        ll2.add(0,"A");

        ll2.add(2,"G");

        ll2.addAll(ll1); // [A, R, G, Z, K, T]

        ll2.set(3,"M"); // [A, R, G, M, K, T]

        System.out.println(ll2.get(4)); //K

        ll2.retainAll(ll1); // [K, T]

        ll2.add("A");
        ll2.add("C");
        ll2.add("G");

        ll2.remove("G"); //[K, T, A, C]
        ll2.add("E");

        System.out.println(ll2.hashCode()); // 3240652 // 100460281

        //System.out.println(ll2.subList(2, 6)); IndexOutOfBoundsException: toIndex = 6


        System.out.println(ll2); //
    }


}
