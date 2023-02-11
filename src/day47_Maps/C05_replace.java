package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C05_replace {

    public static void main(String[] args) {

        Map<String,Integer> mp1 = new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        mp1.put("E",null);


        // replace method changes the value if it is already in the map. If it is not it will return null
        // but if there is a key with null value, it will change the value and will also return null.
        System.out.println(mp1.replace("C", 10));  // 7
        System.out.println(mp1); // {A=5, B=3, C=10}

        System.out.println(mp1.replace("D", 10)); // null
        System.out.println(mp1); // {A=5, B=3, C=10}

        System.out.println(mp1.replace("E", 12)); // null
        System.out.println(mp1); // {A=5, B=3, C=10, E=12}

        // If you want to check the old value you may use replace method with two values, If old value is correct it will return
        //true and will replace the value, If it is not it will return false
        System.out.println(mp1.replace("E", 10, 15)); // false
        System.out.println(mp1); // {A=5, B=3, C=10, E=12}

        System.out.println(mp1.replace("E", 12, 15)); // true
        System.out.println(mp1); // {A=5, B=3, C=10, E=15}


    }
}
