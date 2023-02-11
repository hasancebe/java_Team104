package day26_StaticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList2 {


    // let's create a method
    // inside of that method, create a new list
    // assign new values from anotherlist which cames from main method by add 5;
    //assing new list to old list
    //and return the list

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("before the method : "+ list);
        System.out.println("method(list) = " + method(list));
        System.out.println("orginal list from main method : "+list);

    }

    public static List<Integer> method (List<Integer> list){

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            newList.add(list.get(i)+5);
        }
        list = newList;

        return list;

    }

}
