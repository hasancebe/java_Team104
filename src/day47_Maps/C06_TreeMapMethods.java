package day47_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethods {

    public static void main(String[] args) {

        TreeMap<String,Integer> mp1 = new TreeMap<>();

        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);

        System.out.println(mp1); // {A=5, C=7, F=8, H=3, T=3}

        System.out.println(mp1.higherKey("D")); // F // returns first higher key
        System.out.println(mp1.higherKey("H")); // T
        System.out.println(mp1.higherKey("U")); // null

        System.out.println(mp1.higherEntry("M")); // T=3

        System.out.println(mp1.lowerKey("F")); // C
        System.out.println(mp1.lowerEntry("G")); // F=8

        System.out.println(mp1.floorKey("D")); // C
        System.out.println(mp1.floorKey("H"));  // H
        System.out.println(mp1.floorEntry("L")); // H=3
        System.out.println(mp1.floorEntry("T")); // T=3

        System.out.println(mp1.ceilingKey("F")); // F
        System.out.println(mp1.ceilingKey("B")); // C
        System.out.println(mp1.ceilingEntry("H")); //H=3

        System.out.println(mp1); // {A=5, C=7, F=8, H=3, T=3}

        System.out.println(mp1.headMap("F")); //{A=5, C=7}
        System.out.println(mp1.headMap("K")); // {A=5, C=7, F=8, H=3}

        //to include the limits, we need to add true boolen after the key
        System.out.println(mp1.headMap("F", true)); // {A=5, C=7, F=8}
        System.out.println(mp1.headMap("N", true)); // {A=5, C=7, F=8, H=3}

        System.out.println(mp1.tailMap("F")); // {F=8, H=3, T=3}
        System.out.println(mp1.tailMap("D")); // {F=8, H=3, T=3}

        System.out.println(mp1.tailMap("F", false)); // {H=3, T=3}

        System.out.println(mp1.descendingMap()); // {T=3, H=3, F=8, C=7, A=5}
        System.out.println(mp1); // {A=5, C=7, F=8, H=3, T=3}

        System.out.println(mp1.firstKey());  // A
        System.out.println(mp1.firstEntry()); // A=5

        System.out.println(mp1.pollFirstEntry()); // A=5
        System.out.println(mp1); // {C=7, F=8, H=3, T=3}

        System.out.println(mp1.pollLastEntry()); // T=3
        System.out.println(mp1); // {C=7, F=8, H=3}

        mp1.put("A",5);
        mp1.put("D",3);
        mp1.put("T",7);
        System.out.println(mp1); // {A=5, C=7, D=3, F=8, H=3, T=7}

        System.out.println(mp1.subMap("B", "G")); //{C=7, D=3, F=8}
        System.out.println(mp1.subMap("C", "H")); // {C=7, D=3, F=8}
        System.out.println(mp1.subMap("C", false, "H", true));


    }

}
