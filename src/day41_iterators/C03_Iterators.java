package day41_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterators {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator it1 = list.iterator();

        while (it1.hasNext()){

            System.out.print(it1.next()+" ");
        }
        System.out.println();
        System.out.println("--------------");
        System.out.println(it1.next()); // because there is nothing after that point ( Iterator has already reached the end of the list) if coder
                                        // wants to see beyond the end, this will cause an exception

    }


}
