package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_Questions {


    // take all grades from the teacher then calculate avgNumber and which grades are higher then avg


    public static void main(String[] args) {

        List<Integer> gradesFromTheacher = new ArrayList<>();

        gradesFromTheacher=C02_TakeAllGrades.takeAllGradesFromTeacher();

        C03_AvgValueAndHigherValues.numbersHigherThanAvg(gradesFromTheacher);

    }





}
