package Projects.SchoolProject;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    //number, class information

    private int number;
    private String classInformation;

    static public Map<Integer,Student> studentMap = new HashMap<>();




    public Student(int ID, int age, String name, String surname, int number, String classInformation) {
        super(ID, age, name, surname);
        this.number= number;
        this.classInformation=classInformation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassInformation() {
        return classInformation;
    }

    public void setClassInformation(String classInformation) {
        this.classInformation = classInformation;
    }

    public static Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public static void setStudentMap(Map<Integer, Student> studentMap) {
        Student.studentMap = studentMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", classInformation='" + classInformation + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
