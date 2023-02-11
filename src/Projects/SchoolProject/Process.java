package Projects.SchoolProject;

import java.util.Scanner;

public class Process {

        static public Scanner scan = new Scanner(System.in);
        static String studentOrTeacher;

    public static void mainMenu() {

        System.out.println(" ======================================\n" +
                " STUDENT AND TEACHER ADMINISTRATION PANEL\n" +
                " ======================================\n" +
                " 1- STUDENT TRANSACTIONS\n" +
                " 2- TEACHER PROCEDURES\n" +
                " Q- EXIT");

        System.out.println("Please choose something");
        studentOrTeacher  = scan.next().toUpperCase().substring(0,1);

        switch (studentOrTeacher) {

            case "1":
                studentTransactions();

        }




    }

    private static void studentTransactions() {
        System.out.println(" ============= TRANSACTIONS ===============\n" +
                " 1-ADD\n" +
                " 2-SEARCH\n" +
                " 3-LISTING\n" +
                " 4-DELETE\n" +
                " 5-MAIN MENU\n" +
                " Q-OUT");

        System.out.println("Please enter the value");
        String swtch = scan.next().toUpperCase().substring(0,1);

        switch (swtch){
            case "1":
                addPerson();
                studentTransactions();
                break;



        }



    }

    private static void addPerson() {


            System.out.println("Please enter the name");
            String name = scan.next();
            System.out.println("Please enter the surName");
            String surName = scan.next();
            System.out.println("Please enter the ID");
            int ID = scan.nextInt();
            System.out.println("Please enter the age");
            int age = scan.nextInt();
        if (studentOrTeacher.equalsIgnoreCase("1")){
            System.out.println("Please enter school number");
            int number = scan.nextInt();
            System.out.println("Please enter class");
            String studentClass = scan.next();

            Student student = new Student(ID,age,name,surName,number,studentClass);
            Student.studentMap.put(ID,student);
        } else if (studentOrTeacher.equalsIgnoreCase("2")) {
            //// department, and registration number
            System.out.println("Please enter department");
            String department = scan.next();
            System.out.println("Please enter department");
            String registration = scan.next();
            Teacher teacher = new Teacher(ID,age,name,surName,department,registration);
            Teacher.teacherMap.put(ID,teacher);

        }

        System.out.println(Teacher.teacherMap);
        System.out.println(Student.studentMap);


    }
}
