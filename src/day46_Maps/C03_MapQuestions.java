package day46_Maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C03_MapQuestions {


    // please change surnames with capital letters
    public static void main(String[] args) {

        // our map
        Map<Integer,String> studentMap=MapStorage.exampleMapCreater();
        System.out.println(studentMap);

        studentMap=MapStorage.makeSurnamesAllCapitalsWithEntrySet(studentMap);

        System.out.println(studentMap);


    }


}
