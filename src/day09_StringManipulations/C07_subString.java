package day09_StringManipulations;

public class C07_subString {

    public static void main(String[] args) {

        String str = "Java is getting better everyday";

        System.out.println(str.substring(3,5));   //a_

        System.out.println(str.substring(4,7));  // _is
        System.out.println(str.substring(10,13));  // tti

        str = "HASAN";

        // Please print first and last letters
        str = str.substring(0,1)+str.substring(4);
        System.out.println(str);

        str = "Ahmet";
        //please print first 2 and last 2 letters
        System.out.println(str.substring(0,2)+str.substring(str.length()-2));

        System.out.println("------------");
        System.out.println(str.substring(2,2));
        System.out.println("--------------");
        //System.out.println(str.substring(5,2));

        // to see the second letter
        System.out.println(str.substring(1,2));


    }
}
