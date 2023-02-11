package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_TakeAllGrades {


    public static void main(String[] args) {

        // create method to Take all grades(numbers) from the teacher, until teacher enters a number
        // higher than 100 and save them in a list and return it


        System.out.println("takeAllGradesFromTeacher() = " + takeAllGradesFromTeacher()); // returned method will be printed
    }
    public static List<Integer> takeAllGradesFromTeacher() {

        Scanner scan = new Scanner(System.in); // to take values fromthe user (scan object)

        Integer grade = 0; // to save values
        List<Integer> gradeList = new ArrayList<>(); // a list to save grades

        while (grade <= 100) { // loop and the condition to stop it

            System.out.println("please enter the grades. To Quit enter a value higher than 100"); // info for the user
            grade = scan.nextInt(); // takes value from the teacher and saves it in grade

            if (grade <= 100) { // if user wants to end loop this means I should not add it to the gradeList
                gradeList.add(grade);  /// if it is not higher than 100 it will save the value
            }
        }
        return gradeList;  // returns the method
    }
}
