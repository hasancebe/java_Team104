package day45_maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C05_MapQuestions {

    // Let's print all numbers with names, surnames

    public static void main(String[] args) {

        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();
        System.out.println(exampleMap);



        exampleMap.put(188,"Mehmet-Balli-12-U"); // 188 Mehmet-Balli-12-U
        exampleMap.put(177,"Ahmet-Toprak-11-U");

        MapStorage.printAllStudentsNoNameSurname(exampleMap);



    }





}
