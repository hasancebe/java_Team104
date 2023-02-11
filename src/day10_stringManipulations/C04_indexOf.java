package day10_stringManipulations;

public class C04_indexOf {

    public static void main(String[] args) {

        String str ="Everything is clear with Mehmet hoca";

        System.out.println(str.indexOf("e")); //2
        System.out.println(str.indexOf('i')); //7
        System.out.println(str.indexOf("clear")); //14
        System.out.println(str.indexOf("e",14)); //16
        System.out.println(str.indexOf("e",3)); //16

        System.out.println("-----------------");
        // Please find the index of second "c"
        System.out.println(str.indexOf("c")); // 14
        int indexOfFirstC = str.indexOf("c");

        System.out.println(str.indexOf("c",indexOfFirstC+1)); // 34

    }
}
