package day28_varargs;

public class C05_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is healthy");
        System.out.println(sb); // Java is healthy

        System.out.println(sb.capacity()); // 16 + numberOfCharacters
        System.out.println(sb.length()); // 15 (number of characters used to create sb)

        System.out.println(sb.reverse()); // yhtlaeh si avaJ
        System.out.println(sb); // yhtlaeh si avaJ
        sb.reverse();

        sb.delete(2,4);
        System.out.println(sb);
        System.out.println(sb.indexOf("a")); // 1

        sb.insert(2,"va");
        System.out.println(sb); // Java is healthy

        System.out.println(sb.lastIndexOf("a")); // 10
        sb.replace(1,5,"ahmet");
        System.out.println(sb); // Jahmetis healthy

        


    }


}
