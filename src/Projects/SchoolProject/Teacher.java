package Projects.SchoolProject;

import java.util.HashMap;
import java.util.Map;

public class Teacher extends Person{

    // department, and registration number

    private String department;
    private String  registrationNumber;

    static public Map<Integer,Teacher> teacherMap = new HashMap<>();



    public Teacher(int ID, int age, String name, String surname, String department, String RegNumb) {
        super(ID, age, name, surname);
        this.department = department;
        registrationNumber=RegNumb;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public static Map<Integer, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public static void setTeacherMap(Map<Integer, Teacher> teacherMap) {
        Teacher.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
