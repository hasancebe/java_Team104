package day46_Maps;

import day44_maps.MapStorage;

import java.util.Map;
import java.util.Set;

public class C01_Map_EntrySet {

    public static void main(String[] args) {

        Map<Integer, String> exampleMap = MapStorage.exampleMapCreater();

        // to create an entryset,
        /*
        1) name of map . entrySet()
        2) on the left side of the equal sign :  "Set<Map.Entry<Integer,String>>" then the name of the " entrySet ="
         */

        /*
        Maps store keys and values, It uses {}
        {101=Ali-Can-10-H, 102=Veli-Cem-11-M, 103=Ali-Cem-11-H, 104=Ayse-Can-10-H, 105=Ayse-Cem-11-M, 106=Fatma-Han-10-K}
        EntryMap is created from a map, It uses []
        It stores key and value all together as a whole element
        [101=Ali-Can-10-H, 102=Veli-Cem-11-M, 103=Ali-Cem-11-H, 104=Ayse-Can-10-H, 105=Ayse-Cem-11-M, 106=Fatma-Han-10-K]
         */

        Set<Map.Entry<Integer, String>> exampleMapEntrySet = exampleMap.entrySet();
        System.out.println(exampleMap);
        System.out.println(exampleMapEntrySet);


        // Let's print all entries by using an index number
        int index = 1;

        for (Map.Entry<Integer, String> eachEntry : exampleMapEntrySet
        ) {
            System.out.println(index + ")   " + eachEntry);
            index++;
        }

        /*
        1)   101=Ali-Can-10-H
        2)   102=Veli-Cem-11-M
        3)   103=Ali-Cem-11-H
        4)   104=Ayse-Can-10-H
        5)   105=Ayse-Cem-11-M
        6)   106=Fatma-Han-10-K
         */

        // let's try to see the keys of this entrySet
        for (Map.Entry<Integer, String> w : exampleMapEntrySet
        ) {
            System.out.println(w.getKey());
        }

        /*
        101
        102
        103
        104
        105
        106
         */

        // from the entry set, check student's class number, if it is less than 12, increase it by one
        // if it is 12, change the value with "the student is not here anymore"
        String value = "";
        String[] arr;
        int classNumber = 0;
        String desiredValue = "";

        exampleMap.put(110, "Alic-Velic-12-A");
        exampleMap.put(111, "Alicc-Velicc-9-A");

// we are using for each loop to change values
        for (Map.Entry<Integer, String> eachEntry : exampleMapEntrySet
        ) {
            // we stored the value of element in string
            value = eachEntry.getValue(); // Ali-Can-10-H

            // used split method to make it an array
            arr = value.split("-"); // [Ali, Can, 10, H]

            // class number was a string, to work on it, it should be changed to an Integer
            classNumber = Integer.parseInt(arr[2]);

            // If the class number is 12, the student will leave the highschool
            if (classNumber == 12) {
                eachEntry.setValue("the student is not here anymore");

                // if it is less than 12, the student will continue next class
            } else if (classNumber < 12) {
                classNumber++;
                // Ali-Can-11-H  // // [Ali, Can, 11, H]

                // to add the class number to map's value, again it should be changed to a string
                arr[2] = classNumber + "";

                // to add the value to the map, we modified the value using the array
                desiredValue = arr[0] + "-" +    // Ali-Can-11-H
                        arr[1] + "-" +
                        arr[2] + "-" +
                        arr[3];

                eachEntry.setValue(desiredValue);

            }
        }

        System.out.println(exampleMap);
    }
}
