package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_forEachLoopQuestion {

    public static void main(String[] args) {
        // Question 1- For the repeating elements in a given array,
        // delete the duplicates, make only one of all the elements,
        // assign the new version to the old array and print it.

    Integer [] arr = {4,5,8,7,4,2,3,4,5,4,3,2,3,4,5};

    List<Integer> list = new ArrayList<>();

        for (Integer each:arr
             ) {
            if(!list.contains(each)){
                list.add(each);
            }
        }
        Integer [] arr1 =new Integer[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            arr1[i]=list.get(i);
        }

        arr=arr1;
        System.out.println(Arrays.toString(arr));
    }
}
