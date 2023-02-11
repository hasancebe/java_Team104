package day04_incremets_decrements;

public class C06_Concatenations {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Beautiful";
        String s3 = " ";
        String s4 = "";

        int int1 = 3;
        int int2 = 5;

        // Java Beautiful
        System.out.println(s1+s3+s2);

        // 8Java Beautiful
        System.out.println(int1+int2+s1+s3+s2);

        //Java 8 Beautiful
        System.out.println(s1 + s3 + (int1 + int2)+s3       +s2);

        // Java 53 Java
        System.out.println(s1 +s3 +int2+int1+s3+s1);



    }



}
