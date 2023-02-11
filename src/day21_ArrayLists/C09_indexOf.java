package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_indexOf {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int[] arr = {3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);
        }
        System.out.println(numbers);

        System.out.println(numbers.indexOf(3)); // 0

        System.out.println(numbers.lastIndexOf(3)); // 13



    }
}
