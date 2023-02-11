package day44_maps;

import java.util.Map;

public class C04_ClassUpdate {

    public static void main(String[] args) {

        Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();
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
        int studentNumber=102;
        String newClassLetter= "T";

        exampleMap=MapStorage.classUpdate(exampleMap,studentNumber,newClassLetter);

        System.out.println(exampleMap);






    }

}
