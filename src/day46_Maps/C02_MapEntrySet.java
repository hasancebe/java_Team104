
package day46_Maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C02_MapEntrySet {

    // Please try to print all student in order
    // Branch, class, name, surname, School Number (the order of the information)

    public static void main(String[] args) {

        // Created the example map
        Map<Integer,String> studentMap = MapStorage.exampleMapCreater();
        System.out.println(studentMap);

        //added new students the test the list
        studentMap.put(109,"Veli-Brown-12-A");
        studentMap.put(200,"Velic-Brownc-11-B");

        //Called the method from MapStorage Class
        MapStorage.studentsInOrder(studentMap);




    }

}
