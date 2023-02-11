package day45_maps;

import day44_maps.MapStorage;

import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        // print the students' name surname and class from same branch , H

        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();  // {101=Ali-Can-10-H, 102=Veli-Cem-11-M, 103=Ali-Cem-11-H, 104=Ayse-Can-10-H, 105=Ayse-Cem-11-M, 106=Fatma-Han-10-K}
        System.out.println(exampleMap);
        String branchLetter = "M";
        exampleMap.put(109,"Hakan-Cem-11-M");
        exampleMap.put(110,"Sukru-Kadir-10-M");

        MapStorage.callNamesSurnamesClassesFromSameBranch(exampleMap,branchLetter);

    }
}
