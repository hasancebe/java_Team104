package day47_Maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C02_contains {

    public static void main(String[] args) {

        Map<Integer,String> exampleMap=MapStorage.exampleMapCreater();
        System.out.println(exampleMap);
        /*
        {
        101=Ali-Can-10-H,
        102=Veli-Cem-11-M,
        103=Ali-Cem-11-H,
        104=Ayse-Can-10-H,
        105=Ayse-Cem-11-M,
        106=Fatma-Han-10-K
        }
         */
        // to check if the keys have the element
        System.out.println(exampleMap.containsKey(102)); // true
        System.out.println(exampleMap.containsKey(999)); // false

        // we can also check the values to see if the map has the value. But value will be checked as a whole
        System.out.println(exampleMap.containsValue("10")); // false
        System.out.println(exampleMap.containsValue("Fatma-Han-10-K")); // true
        System.out.println(exampleMap.containsValue("Fatma-Han-11-K")); // false

        // To check a vlaue if it has an element, first we need to reach that value then we can use values' method to see if it has the element
        System.out.println(exampleMap.get(106).contains("10")); //true


    }

}
