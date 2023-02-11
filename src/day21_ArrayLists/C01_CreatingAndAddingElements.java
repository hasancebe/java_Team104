package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;


public class C01_CreatingAndAddingElements {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        System.out.println(list.add(15));

        System.out.println(list); // [10, 20, 30, 15]

        list.add(1,15);

        System.out.println(list); // [10, 15, 20, 30, 15]

        list.add(0,5);

        System.out.println(list); // [5, 10, 15, 20, 30, 15]

        List<Integer> listToAdd = new ArrayList<>();
        listToAdd.add(33);
        listToAdd.add(11);
        System.out.println(listToAdd); // [33, 11]

        list.addAll(listToAdd);

        System.out.println(list); // [5, 10, 15, 20, 30, 15, 33, 11]

        list.addAll(4,listToAdd);

        System.out.println(list); // [5, 10, 15, 20, 33, 11, 30, 15, 33, 11]

        System.out.println(list.size()); // 10

        System.out.println(list.isEmpty()); // false







    }
}
