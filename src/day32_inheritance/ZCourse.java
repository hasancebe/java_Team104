package day32_inheritance;

public class ZCourse extends ZSchool {
    ZCourse( ){

    }

    String course ="11-F";
    String tel ="88888888";

    public static void main(String[] args) {
        ZCourse obj = new ZCourse();
        System.out.println(obj.course); //11-F
        System.out.println(obj.tel); // 88888888
        System.out.println(obj.SchoolName); // star college
    }
}
