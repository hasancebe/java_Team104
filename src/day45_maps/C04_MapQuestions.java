package day45_maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C04_MapQuestions {

    public static void main(String[] args) {

        // print  students' names, surnames and classes between 104-109;

        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();
        System.out.println(exampleMap);

        exampleMap.put(109,"Hasan-Veli-12-C");
        exampleMap.put(110,"kadir-High-12-C");
        exampleMap.put(111,"Murat-Yazici-10-D");
        exampleMap.put(112,"Hatice-Yazici-9-D");

        int startingNo= 103;
        int endingNo= 110;

        MapStorage.printStudentsNameSurnameClassBetweenNumbers(exampleMap,startingNo,endingNo);

    }
}
