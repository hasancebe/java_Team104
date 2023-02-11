package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sortMethod {


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int [] arr = {3,4,6,3,5,3,5,7,8,4,3,5,7,3,6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);
        }
        System.out.println(numbers); // [3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6]

        Collections.sort(numbers);

        System.out.println(numbers); // [3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8]

    }
}
