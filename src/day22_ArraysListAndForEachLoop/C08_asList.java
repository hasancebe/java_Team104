package day22_ArraysListAndForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C08_asList {

    public static void main(String[] args) {


        Integer [] arr = {1,2,3};

        List<Integer> list = Arrays.asList(arr);  // we should not use this method


        System.out.println(list); // [1, 2, 3]

        List<Integer> list1 = list;


        // list.add(10);  // UnsupportedOperationException
        //System.out.println(list);

        // list.remove(2); // UnsupportedOperationException
        System.out.println("unchanged arr = "+Arrays.toString(arr));
        arr[0] = 99;
        System.out.println("changed arr = "+Arrays.toString(arr));

        System.out.println(list);
        System.out.println("list1"+list1);


    }


}
