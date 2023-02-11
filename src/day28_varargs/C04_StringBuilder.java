package day28_varargs;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(7);
        // java creates a SB for 7 characters

        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); // 0

        sb.append("Java");

        System.out.println(sb);//Java
        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //4

        sb.append(" beautiful");
        System.out.println(sb);//Java
        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); //14

        sb.append(" there is always");
        System.out.println(sb);//Java beautiful there is always
        System.out.println(sb.capacity()); //34
        System.out.println(sb.length()); //30

        sb.trimToSize();

        System.out.println(sb.capacity()); //30
        System.out.println(sb.length()); //30

    }



}
