package day11_stringManipulations;

public class C01_replace {

    public static void main(String[] args) {

        String str = "Java is healthy";

        //change a to A

        System.out.println(str.replace('a','A'));
        System.out.println(str);  // the original str hasn't changed, because we haven't used any assigment

        System.out.println(str.replace(' ','_'));

        System.out.println(str.replace("a",""));

        System.out.println(str.replace("Java","Life"));

        System.out.println(str.replace("Java","Life").replace("healthy","hard"));



    }
}
