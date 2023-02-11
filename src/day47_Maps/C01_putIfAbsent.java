package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_putIfAbsent {

    public static void main(String[] args) {


        Map<String,Integer> mp1 = new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        // if the key value is absent putIfAbsent will work as "put" method, and it will add the entry to the map
        System.out.println(mp1.putIfAbsent("D", 9)); // null //{A=5, B=3, C=7, D=9}
        System.out.println(mp1); //{A=5, B=3, C=7, D=9}

        //If there is a same key in the map, putIfAbsent will not add or change the entry, It will returnt the old value
        System.out.println(mp1.putIfAbsent("D", 6)); //9
        System.out.println(mp1); //{A=5, B=3, C=7, D=9}






    }
}
