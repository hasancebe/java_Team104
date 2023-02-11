package day42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListsQuestions {

    /*
    Question : Ask a teacher to enter students' grades, teacher should press Q when all grades are entered.
    After the entering process is finished, prepare the output as follows

Average grade : …..
number of students : …..
Number of students below average : ….
Number of students with 10 points above or below the average: ….

     */

    static List<Double> gradeList =new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("before the method "+gradeList);
        createGradeList();
        System.out.println(gradeList);




    }
    public static void createGradeList (){
        Scanner scan = new Scanner(System.in);

        double grade = 0;
        boolean willContin = true;

        while (willContin){


            try {
                System.out.println("please enter a grade to save");
                grade= scan.nextDouble();
                gradeList.add(grade);


            } catch (Exception e) {
                String enteredLetter = scan.nextLine();

               if (enteredLetter.equalsIgnoreCase("q")){
                   willContin=false;
                   break;
               }
            }


        }







    }



}
