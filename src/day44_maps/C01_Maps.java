package day44_maps;

import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {

        System.out.println(MapStorage.exampleMapCreater());
        // we have created our first map in another class then we called the method to use it in this class
        Map<Integer,String> exampleMap = MapStorage.exampleMapCreater();
        // When we use this exampleMapCreater method, it will return same map
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

        int studentNo=103;

        // let's create a method that search for the name of the student in the map we created

        String nameAndSurnameOfStudent=MapStorage.returnNameOfStudentBySchoolNo(exampleMap,studentNo);
        System.out.println(nameAndSurnameOfStudent);


    }
}
