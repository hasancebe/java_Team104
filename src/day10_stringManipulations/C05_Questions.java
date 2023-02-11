package day10_stringManipulations;

public class C05_Questions {

    public static void main(String[] args) {

        String str = "Java is very beautiful, ";
        String text = "very";

        System.out.println(str.indexOf("very"));   //8
        System.out.println(str.lastIndexOf("very"));  //8
        System.out.println("---------------------------");
        System.out.println(str.lastIndexOf("very",8)); //8
        System.out.println(str.lastIndexOf("very",10)); //8
        System.out.println(str.lastIndexOf('e',10)); //9






        // tell Java to look for "very" word inside of the "str"  //contains
        // tell java to check if "str" has "very" word only once
        // check if it has very more than one


//        if (!str.contains(text)) {
//            System.out.println("no it does not contain very");
//        } else {
//
//            int firstIndexOfVery = str.indexOf("very");
//            int lastIndexOfVery = str.lastIndexOf("very");
//
//            if (firstIndexOfVery == lastIndexOfVery) {
//                System.out.println("there is only one very inside of the str");
//
//
//            } else {
//                System.out.println("there are more than one");
//
//            }


//        }


    }

}