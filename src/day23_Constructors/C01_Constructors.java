package day23_Constructors;

import java.util.Scanner;

public class C01_Constructors {


    public static void main(String[] args) {


        // We use/create constructors to create objects from a class
        Scanner                 scan =                  new                 Scanner(            System.in           );
    // name of the class        Name of object          keyword             Constructor         parameter

        int number = scan.nextInt();

        String str = new String("Java is funny");

        String str2 = new String("Java is beautiful");

        System.out.println(str2.toLowerCase());





    }




}
