package day26_StaticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValueLists {

    public static void main(String[] args) {

        // Create a method that increases the values of a list by 5;

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("orginal list : "+list);
        System.out.println("method is called, list : "+inceaseValuesBy5(list));
        System.out.println("after method Call, list : "+ list);

    }

    public static List<Integer> inceaseValuesBy5 (List<Integer> list){

        for (int i = 0; i <list.size() ; i++) {

            list.set(i,list.get(i)+5);

        }

        return list;

    }
}
