package day44_maps;

import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        Map<Integer,String> exampleMap = MapStorage.exampleMapCreater();
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
        String nameOfDesiredStudent=MapStorage.returnNameOfStudentBySchoolNo(exampleMap,103);
        System.out.println(nameOfDesiredStudent);

        exampleMap=MapStorage.ClassEditor(exampleMap,104,"Z");
        System.out.println(exampleMap);

        exampleMap=MapStorage.studentNameEditor(exampleMap,105,"Hacı","Final");
        System.out.println(exampleMap);





    }
}
