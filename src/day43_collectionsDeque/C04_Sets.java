package day43_collectionsDeque;

import java.util.HashSet;
import java.util.Set;

public class C04_Sets {

    public static void main(String[] args) {

        Set<Integer> testSet = new HashSet<>();


        testSet.add(10);
        testSet.add(20);
        testSet.add(30);
        testSet.add(40);
        testSet.add(50);
        testSet.add(60);
        testSet.add(20);

        System.out.println(testSet); // [50, 20, 40, 10, 60, 30]
    }



}
