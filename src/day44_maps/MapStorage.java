package day44_maps;

import java.util.*;

public class MapStorage {


    public static Map<Integer, String> exampleMapCreater (){

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101,"Ali-Can-10-H");
        studentMap.put(102,"Veli-Cem-11-M");
        studentMap.put(103,"Ali-Cem-11-H");
        studentMap.put(104,"Ayse-Can-10-H");
        studentMap.put(105,"Ayse-Cem-11-M");
        studentMap.put(106,"Fatma-Han-10-K");

        return studentMap;
    }


    public static String returnNameOfStudentBySchoolNo(Map<Integer, String> exampleMap, int studentNo) {

        // get method gets the value of the key (101)
        String valueOfElement = exampleMap.get(studentNo); // "Ali-Can-10-H"

        // we splited the value ("Ali-Can-10-H") to use it as an array
        String [] studentValues =valueOfElement.split("-"); // [Ali, Can, 10, H] an array

        // we created our return value: name (space) surname
        String nameAndSurname = studentValues[0]+ " "+ studentValues[1]; // Ali Can

        return nameAndSurname;
    }

    public static Map<Integer,String> ClassEditor(Map<Integer, String> exampleMap, int studentNumber, String newClass) {

       //by get method, we took the value of the key (107)
        String studentValue= exampleMap.get(studentNumber); //"Hasan-Son-12-J"

        // we splited the value ("Hasan-Son-12-J") to use it as an array
        String [] studentArray = studentValue.split("-"); // [Hasan, Son, 12, J]

        //we changed the class letter
        studentArray[3]=newClass;

        // We have created the new String value (order should be followed) to add the map again
        String requestedValue = studentArray[0]+"-"+
                                studentArray[1]+"-"+
                                studentArray[2]+"-"+
                                studentArray[3];

        //we have added the changed value to same map again
        exampleMap.put(studentNumber,requestedValue);

        // returned the map where it is called
        return exampleMap;
    }

    public static Map<Integer,String> studentNameEditor(Map<Integer, String> exampleMap, int studentNumberToChangeName, String newName, String newSurname) {

        // get method is used to reach the value of the key
        String keyValue=exampleMap.get(studentNumberToChangeName); //"Ali-Firtina-10-C"

        // an array is created from the value by splitting (-)
        String [] valueArray = keyValue.split("-");  // [Ali, Firtina, 10, C]

        // name and surname are assigned to the array
        valueArray[0]=newName;
        valueArray[1]=newSurname;

        //RequestedString is created to add to map
        String requestedValue = valueArray[0]+"-"+
                                valueArray[1]+"-"+
                                valueArray[2]+"-"+
                                valueArray[3];

        // new value is added to the map with the school number
        exampleMap.put(studentNumberToChangeName,requestedValue);

        // returned updated map to where it is called
        return exampleMap;
    }

    public static Map<Integer,String > classUpdate(Map<Integer, String> exampleMap, int studentNumber, String newClassLetter) {

        String keyValue=exampleMap.get(studentNumber); //Veli-Cem-11-M

        String [] valueArray = keyValue.split("-");
        valueArray[3]=newClassLetter;
        String classNumber = valueArray[2];
        int classNumberInt = Integer.parseInt(classNumber)+1;
        classNumber=""+classNumberInt;
        valueArray[2]=classNumber;

        String requestedValue = valueArray[0]+"-"+
                                valueArray[1]+"-"+
                                valueArray[2]+"-"+
                                valueArray[3];

        exampleMap.put(studentNumber,requestedValue);


        return exampleMap;


    }


    public static void callNamesSurnamesClassesFromSameBranch(Map<Integer, String> exampleMap, String branchLetter) {

        // taken values from the exampleMap
        Collection<String> keyValues=exampleMap.values();  // [Ali-Can-10-H, Veli-Cem-11-M, Ali-Cem-11-H, Ayse-Can-10-H, Ayse-Cem-11-M, Fatma-Han-10-K]
        System.out.println(keyValues);

        // to reach each valueve used for each loop
        for (String eachValue:keyValues
        ) {
            // splited the each value to work on it
            String[] splitedValue = eachValue.split("-");

            // if we find a match
            if (splitedValue[3].equals(branchLetter)){

                // we modified the output
                String toprint = splitedValue[0]+ " "+
                        splitedValue[1]+ " "+
                        splitedValue[2];

                // we printed it
                System.out.println(toprint);
            }
        }
    }

    public static void printStudentsNameSurnameClassBetweenNumbers(Map<Integer, String> exampleMap, int startingNo, int endingNo) {

       Set<Integer> keysSet= exampleMap.keySet();
        System.out.println(keysSet); // [101, 102, 103, 104, 105, 106]

        // to reach each key
        for (Integer eachKey: keysSet
             ) {

            //Checking the keys if they are the wanted ones
            if (eachKey>=startingNo && eachKey<=endingNo){
                // if it is we took the value of the key
                String value=exampleMap.get(eachKey); // Ali-Can-10-H
                //split the value
                String[] valueArr= value.split("-");// [Ali, Can, 10, H]
                // prepare the String toprint
                String requestedString= valueArr[0]+ " " +valueArr[1]+" " +valueArr[2];
                System.out.println(requestedString);
            }
        }


    }

    public static void printAllStudentsNoNameSurname(Map<Integer, String> exampleMap) {

        Set<Integer> keySet=exampleMap.keySet();
        System.out.println(keySet);

        for (Integer eachKey:keySet
             ) {

            String value= exampleMap.get(eachKey); // Ali-Can-10-H
            String[] valueArr = value.split("-"); // [Ali, Can, 10, H]

            String desiredString = eachKey + " "+ valueArr[0]+" "+ valueArr[1];
            System.out.println(desiredString);
        }


    }

    public static Map<Integer,String> makeSurnamesAllCapitals(Map<Integer, String> exampleMap) {

        Set<Integer> keySet=exampleMap.keySet();

        for (Integer eachKey:keySet
             ) {
            String valueStr=exampleMap.get(eachKey);
            String [] valueArr= valueStr.split("-"); //Veli-Cem-11-M
            valueArr[1]=valueArr[1].toUpperCase();
            String desiredValue = valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3];
            exampleMap.put(eachKey,desiredValue);
        }

        return exampleMap;
    }

    public static void studentsInOrder(Map<Integer, String> studentMap) {

        // Please try to print all student in order
        // Branch, class, name, surname, School Number (the order of the information)
        String value ="";
        String[] arr;

        String desiredValue="";

        // to receive the netural order we created a set from TreeSet (Constructor) concrete Class
        Set<String> theOrder = new TreeSet<>();

        // to reach all elements of the map, We used MapEntrySet Method
        Set<Map.Entry<Integer,String>> studentEntrySet =   studentMap.entrySet();

        // by using this mapEnty, we chould be able use forEach loop
        for (Map.Entry<Integer,String> eachEntry: studentEntrySet
             ) {

            value=eachEntry.getValue(); // Ayse-Can-10-H
            arr=value.split("-");   // [Ayse, Can, 10, H]
            desiredValue = arr[3]+"-"+ arr[2]+"-"+arr[0]+"-"+arr[1]+"-"+ eachEntry.getKey();

            // added desiredValue to set
            theOrder.add(desiredValue);

        }

        // printed the set
        System.out.println(theOrder);

    }

    public static  Map<Integer,String> makeSurnamesAllCapitalsWithEntrySet(Map<Integer, String> studentMap) {

        // the entrySet
        Set<Map.Entry<Integer,String>> studentEntrySet =studentMap.entrySet();

        // variables that We will use inside the loop
        String value ="";
        String [] arr ;
        String desiredString ="";

        //ForeachLoop, we use the entrySet
        for (Map.Entry<Integer,String> eachEntry: studentEntrySet
        ) {
            value = eachEntry.getValue(); // Veli-Cem-11-M
            arr = value.split("-"); // [Veli, Cem, 11, M]

            arr[1]= arr[1].toUpperCase();
            desiredString = arr[0]+"-"+ arr[1]+"-"+ arr[2]+"-"+ arr[3];
            eachEntry.setValue(desiredString);
        }
        return  studentMap;
    }
}
