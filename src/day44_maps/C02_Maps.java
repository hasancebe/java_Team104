package day44_maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

       Map<Integer,String> exampleMap= MapStorage.exampleMapCreater();
        System.out.println(exampleMap);

        exampleMap.put(105,"Ali-Firtina-10-C");
        exampleMap.put(107,"Hasan-Son-12-J");
        System.out.println(exampleMap);

        //if you add another value by using same key, It will delete the previous one and  will add the new one.
        System.out.println(MapStorage.returnNameOfStudentBySchoolNo(exampleMap, 107));

        // one of your students is very unhappy in his class, He wants to change the class
        // student number 107 and new class will T class
        String newClass= "T";
        int studentNumber = 107;
        exampleMap=MapStorage.ClassEditor(exampleMap, studentNumber, newClass);
        System.out.println(exampleMap);


        //let's change a student name
        int studentNumberToChangeName=105;
        String newName = "Ahmet";
        String newSurname = "Veli";

        exampleMap=MapStorage.studentNameEditor(exampleMap,studentNumberToChangeName,newName,newSurname);
        System.out.println(exampleMap);


    }
}
