package day43_collectionsDeque;

import java.util.Deque;
import java.util.LinkedList;

public class C01_DequeCollections {

    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]
        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        dq1.offer("D"); // [A, K, B, F, D]

        System.out.println(dq1.contains("D")); // true
        System.out.println(dq1.element()); // A
        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // D

        System.out.println(dq1.pop()); // A  // [K, B, F, D]
        System.out.println(dq1.poll()); // K  // [B, F, D]
        dq1.add("F");
        dq1.add("F");
        dq1.add("F");
        System.out.println(dq1.removeFirstOccurrence("F")); //true [B, D, F, F, F]
        dq1.add("S");
        dq1.removeLastOccurrence("F"); // [B, D, F, F, S]
        dq1.push("E"); // [E, B, D, F, F, S]



        System.out.println(dq1);


    }
}
