package day45_maps;

import day44_maps.MapStorage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {

    public static void main(String[] args) {

        // taken the example map by using the method we created
        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();

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

        // keySet() method returns the keys of the map as a Set
        Set<Integer> keysSet= exampleMap.keySet();  // [101, 102, 103, 104, 105, 106]
        System.out.println(keysSet);

        // values() method returns the values of the map as a collection
        Collection<String> valueCollection= exampleMap.values();
        System.out.println(valueCollection);
        /*
        [
        Ali-Can-10-H,
        Veli-Cem-11-M,
        Ali-Cem-11-H,
        Ayse-Can-10-H,
        Ayse-Cem-11-M,
        Fatma-Han-10-K
        ]
         */

        // Ali, Can, 10, H, Veli,Cem, 11, M, Ali,Cem, 11, H,
        /*
        Normally Coders use "," instead of "-" But when we create maps' values this way it is very hard to see the elements
        So we should be able to understand when we see "Ali, Can, 10, H, Veli,Cem, 11, M, Ali,Cem, 11, H, " this kind of
        values, there might be elements less than it seems

        And we should  not forget that we saved a lot of datas in A string
         */



    }





}
