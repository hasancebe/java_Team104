package day43_collectionsDeque;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSetsVsHashSets {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();
        int randomNumber = 0;

        LocalTime setHashStartingTime = LocalTime.now();

        for (int i = 0; i < 1500; i++) {
            randomNumber = rnd.nextInt(1000000);
            hashSet.add(randomNumber);
        }

        LocalTime setHashEndTime = LocalTime.now();

        System.out.println("starting : " + setHashStartingTime);
        System.out.println("ending : " + setHashEndTime);

        System.out.println("hashSet Process Time : " + (setHashEndTime.getNano() - setHashStartingTime.getNano()));

        LocalTime treeSetStaringTime = LocalTime.now();

        for (int i = 0; i < 1500; i++) {
            randomNumber = rnd.nextInt(1000000);
            treeSet.add(randomNumber);
        }

        LocalTime treeSetEndingTime = LocalTime.now();

        System.out.println("TreeSet Process Time : " + (treeSetEndingTime.getNano() - treeSetStaringTime.getNano()));

    }

}
